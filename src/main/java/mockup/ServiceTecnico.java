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
@Path("tecnico")
public class ServiceTecnico {

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
        jo.put("foto", "http://apiexemplo.fourtime.com/assets/tecnico/1.png");
        jo.put("nome", "Levir Culpi");
        jo.put("time", "Atético Mineiro");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "http://apiexemplo.fourtime.com/assets/tecnico/2.png");
        jo.put("nome", "Cruzeiro");
        jo.put("time", "Marcelo Oliveira");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "http://apiexemplo.fourtime.com/assets/tecnico/3.png");
        jo.put("nome", "Luxemburgo");
        jo.put("time", "Flamengo");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "http://apiexemplo.fourtime.com/assets/tecnico/4.png");
        jo.put("nome", "Tite");
        jo.put("time", "Corinthians");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "http://apiexemplo.fourtime.com/assets/tecnico/5.png");
        jo.put("nome", "Ricardo Drubscky");
        jo.put("time", "Fluminense");
        ja.put(jo);

        j.put("lista", ja);
        j.put("sucesso", true);

        return j.toString();
    }
}
