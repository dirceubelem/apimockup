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
@Path("stories")
public class ServiceStories {

    @Context
    private UriInfo context;
    @Context
    private HttpServletRequest request;
    @Context
    private HttpServletResponse response;

    @GET
    public String obter() throws Exception {

        JSONArray ja = new JSONArray();
        JSONObject jo = new JSONObject();
        jo.put("user", "humberto");
        jo.put("live", true);
        jo.put("avatar", "https://mockup.fluo.site/avatar/1.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "gustavo");
        jo.put("live", true);
        jo.put("avatar", "https://mockup.fluo.site/avatar/2.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "henrique");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.site/avatar/3.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "junior");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.site/avatar/4.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "maria");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.site/avatar/5.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "angelo");
        jo.put("live", true);
        jo.put("avatar", "https://mockup.fluo.site/avatar/6.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "daniele");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.site/avatar/7.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "ana");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.site/avatar/8.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "cristina");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.site/avatar/9.png");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "wagner");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.site/avatar/10.png");
        ja.put(jo);

        return ja.toString();

    }

}
