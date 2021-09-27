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
 * @author dirceubelem
 */
@Path("amigos")
public class ServiceAmigo {

    @Context
    private UriInfo context;
    @Context
    private HttpServletRequest request;
    @Context
    private HttpServletResponse response;

    public ServiceAmigo() {
    }

    @GET
    public String obter() throws Exception {

        JSONArray ja = new JSONArray();
        JSONObject jo = new JSONObject();
        jo.put("usuario", "joana");
        jo.put("avatar", "https://mockup.fluo.app/avatar/1.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "daniele");
        jo.put("avatar", "https://mockup.fluo.app/avatar/2.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "cecilia");
        jo.put("avatar", "https://mockup.fluo.app/avatar/3.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "marcela");
        jo.put("avatar", "https://mockup.fluo.app/avatar/4.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "maria");
        jo.put("avatar", "https://mockup.fluo.app/avatar/5.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "angela");
        jo.put("avatar", "https://mockup.fluo.app/avatar/6.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "rubens");
        jo.put("avatar", "https://mockup.fluo.app/avatar/7.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "gustavo");
        jo.put("avatar", "https://mockup.fluo.app/avatar/8.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "cristiano");
        jo.put("avatar", "https://mockup.fluo.app/avatar/9.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("usuario", "thais");
        jo.put("avatar", "https://mockup.fluo.app/avatar/10.png");
        ja.put(jo);

        return ja.toString();

    }

}
