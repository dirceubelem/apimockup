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
@Path("estadio")
public class ServiceEstadio {

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
        jo.put("foto", "https://mockup.fluo.site/assets/estadio/1.png");
        jo.put("nome", "Mineirão");
        jo.put("estado", "Minas Gerais");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/estadio/2.png");
        jo.put("nome", "Independência");
        jo.put("estado", "Minas Gerais");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/estadio/3.png");
        jo.put("nome", "Maracanã");
        jo.put("estado", "Rio de Janeiro");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/estadio/4.png");
        jo.put("nome", "Morumbi");
        jo.put("estado", "São Paulo");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/estadio/5.png");
        jo.put("nome", "Itaquerão");
        jo.put("estado", "São Paulo");
        ja.put(jo);

        j.put("lista", ja);
        j.put("sucesso", true);

        return j.toString();
    }

}
