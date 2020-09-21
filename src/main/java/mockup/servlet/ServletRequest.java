/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockup.servlet;

import mockup.DateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Enumeration;

/**
 * @author dirceubelem
 */
@WebServlet(name = "ServletChat", urlPatterns = {"/generic"})
public class ServletRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        receiveRequest("GET", request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        receiveRequest("POST", request, response);
    }

    private void receiveRequest(String method, HttpServletRequest request, HttpServletResponse response) {
        logar(method + " - Chegou requisicao");

        try {

            PrintWriter out = response.getWriter();
            out.println(method + "<br/>");

            final Enumeration<String> attributeNames = request.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                logar("{attribute} " + request.getParameter(attributeNames.nextElement()));
                out.println("{attribute} " + request.getParameter(attributeNames.nextElement()) + "<br/>");
            }

            final Enumeration<String> parameterNames = request.getParameterNames();
            while (parameterNames.hasMoreElements()) {
                logar("{parameter} " + request.getParameter(parameterNames.nextElement()));
                out.println("{parameter} " + request.getParameter(parameterNames.nextElement()) + "<br/>");
            }

            request.setCharacterEncoding("UTF-8");
            StringBuilder sb = new StringBuilder();
            BufferedReader br = request.getReader();

            String line = "";

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            logar(method + " BODY " + sb.toString());

            out.println(sb.toString() + "<br/>");

        } catch (Exception e) {
            logar(method + "ERROR: " + e.getMessage());
        }

    }

    public static void logar(String text) {

        try {
            DateTime date = DateTime.now();
            String arquivo = "log_" + date.toString("yyyyMMdd") + ".txt";
            PrintWriter saida = new PrintWriter(new FileOutputStream("/mockup/" + arquivo, true));
            saida.write(date.toString("dd/MM/yyyy HH:mm:ss") + "|" + text + "\n");
            saida.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
