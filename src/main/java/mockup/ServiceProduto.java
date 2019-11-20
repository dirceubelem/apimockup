/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author dirceubelem
 */
@Path("produto")
public class ServiceProduto {

    @Context
    private UriInfo context;
    @Context
    private HttpServletRequest request;
    @Context
    private HttpServletResponse response;

    @GET
    public String list() throws Exception {
        response.setContentType("text/html;charset=UTF-8");

        JSONObject j = new JSONObject();

        JSONArray ja = new JSONArray();

        JSONObject jo;

        jo = new JSONObject();
        jo.put("imagem", "http://apiexemplo.fourtime.com/assets/produto/1.png");
        jo.put("nome", "Coca Cola");
        jo.put("valor", 4.50);
        ja.put(jo);

        jo = new JSONObject();
        jo.put("imagem", "http://apiexemplo.fourtime.com/assets/produto/2.png");
        jo.put("nome", "Bis");
        jo.put("valor", 3.75);
        ja.put(jo);

        jo = new JSONObject();
        jo.put("imagem", "http://apiexemplo.fourtime.com/assets/produto/3.png");
        jo.put("nome", "Água Mineral");
        jo.put("valor", 2.00);
        ja.put(jo);

        jo = new JSONObject();
        jo.put("imagem", "http://apiexemplo.fourtime.com/assets/produto/4.png");
        jo.put("nome", "Waffer");
        jo.put("valor", 2.45);
        ja.put(jo);

        jo = new JSONObject();
        jo.put("imagem", "http://apiexemplo.fourtime.com/assets/produto/5.png");
        jo.put("nome", "Açucar");
        jo.put("valor", 5.00);
        ja.put(jo);

        j.put("lista", ja);
        j.put("sucesso", true);

        return j.toString();
    }

}
