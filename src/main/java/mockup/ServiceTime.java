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
@Path("time")
public class ServiceTime {

    @Context
    private UriInfo context;
    @Context
    private HttpServletRequest request;
    @Context
    private HttpServletResponse response;

    @GET
    @Path("lista")
    public String list() throws Exception {

        response.setContentType("text/html;charset=UTF-8");

        JSONObject j = new JSONObject();

        JSONArray ja = new JSONArray();

        JSONObject jo;

        jo = new JSONObject();
        jo.put("escudo", "https://mockup.fluo.site/v1/assets/times/1.png");
        jo.put("nome", "Atlético Mineiro");
        jo.put("estado", "Minas Gerais");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("escudo", "https://mockup.fluo.site/v1/assets/times/2.png");
        jo.put("nome", "Cruzeiro");
        jo.put("estado", "Minas Gerais");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("escudo", "https://mockup.fluo.site/v1/assets/times/3.png");
        jo.put("nome", "Bahia");
        jo.put("estado", "Bahia");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("escudo", "https://mockup.fluo.site/v1/assets/times/4.png");
        jo.put("nome", "Flamengo");
        jo.put("estado", "Rio de Janeiro");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("escudo", "https://mockup.fluo.site/v1/assets/times/5.png");
        jo.put("nome", "Botafogo");
        jo.put("estado", "Rio de Janeiro");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("escudo", "https://mockup.fluo.site/v1/assets/times/6.png");
        jo.put("nome", "Fluminense");
        jo.put("estado", "Rio de Janeiro");
        ja.put(jo);

        j.put("lista", ja);
        j.put("sucesso", true);

        return j.toString();
    }

}
