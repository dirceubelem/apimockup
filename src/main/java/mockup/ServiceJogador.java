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
@Path("jogador")
public class ServiceJogador {

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
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/1.png");
        jo.put("nome", "Neymar");
        jo.put("time", "Barcelona");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/2.png");
        jo.put("nome", "Fred");
        jo.put("time", "Fluminense");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/3.png");
        jo.put("nome", "Ronaldinho Gaúcho");
        jo.put("time", "Querétaro Fútbol Club");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/4.png");
        jo.put("nome", "Victor");
        jo.put("time", "Atlético Mineiro");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/5.png");
        jo.put("nome", "Fábio");
        jo.put("time", "Cruzeiro");
        ja.put(jo);

        j.put("lista", ja);
        j.put("sucesso", true);

        return j.toString();
    }

    @GET
    public String list2() throws Exception {
        response.setContentType("text/html;charset=UTF-8");

        JSONObject j = new JSONObject();

        JSONArray ja = new JSONArray();

        JSONObject jo;

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/1.png");
        jo.put("nome", "Neymar");
        jo.put("time", "Barcelona");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/2.png");
        jo.put("nome", "Fred");
        jo.put("time", "Fluminense");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/3.png");
        jo.put("nome", "Ronaldinho Gaúcho");
        jo.put("time", "Querétaro Fútbol Club");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/4.png");
        jo.put("nome", "Victor");
        jo.put("time", "Atlético Mineiro");
        ja.put(jo);

        jo = new JSONObject();
        jo.put("foto", "https://mockup.fluo.site/assets/jogador/5.png");
        jo.put("nome", "Fábio");
        jo.put("time", "Cruzeiro");
        ja.put(jo);

        j.put("lista", ja);
        j.put("sucesso", true);

        return j.toString();
    }
}
