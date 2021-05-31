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
        jo.put("avatar", "https://mockup.fluo.app/avatar/1.png");
        jo.put("stories", "https://mockup.fluo.app/images/alexey-sviridkin-VXb42m0uM3s-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "gustavo");
        jo.put("live", true);
        jo.put("avatar", "https://mockup.fluo.app/avatar/2.png");
        jo.put("stories", "https://mockup.fluo.app/images/alexey-sviridkin-VXb42m0uM3s-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "henrique");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.app/avatar/3.png");
        jo.put("stories", "https://mockup.fluo.app/images/anita-austvika-Grh1pGOrxuE-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "junior");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.app/avatar/4.png");
        jo.put("stories", "https://mockup.fluo.app/images/anita-austvika-KAkljqqXdKs-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "maria");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.app/avatar/5.png");
        jo.put("stories", "https://mockup.fluo.app/images/christiann-koepke-XersifI0JCk-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "angelo");
        jo.put("live", true);
        jo.put("avatar", "https://mockup.fluo.app/avatar/6.png");
        jo.put("stories", "https://mockup.fluo.app/images/cristina-gottardi-E5UPWEIjvB8-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "daniele");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.app/avatar/7.png");
        jo.put("stories", "https://mockup.fluo.app/images/daniel-thiele-MG4ap7OlC0w-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "ana");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.app/avatar/8.png");
        jo.put("stories", "https://mockup.fluo.app/images/alexey-sviridkin-VXb42m0uM3s-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "cristina");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.app/avatar/9.png");
        jo.put("stories", "https://mockup.fluo.app/images/gin-z-fDkXxoiUy6Q-unsplash.jpg");
        ja.put(jo);
        jo = new JSONObject();
        jo.put("user", "wagner");
        jo.put("live", false);
        jo.put("avatar", "https://mockup.fluo.app/avatar/10.png");
        jo.put("stories", "https://mockup.fluo.app/images/harley-davidson-9yx3FyexTOU-unsplash.jpg");
        ja.put(jo);

        return ja.toString();

    }

}
