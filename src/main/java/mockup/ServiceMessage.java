package mockup;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("message")
public class ServiceMessage {

    @GET
    @Path("{id}")
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getMessage(@PathParam("id") String user) {
        JSONObject j = new JSONObject();

        j.put("user", "daniele");
        j.put("name", "Daniele");
        j.put("avatar", "https://mockup.fluo.site/avatar/2.png");

        JSONArray ja = new JSONArray();

        JSONObject m = null;
        m = new JSONObject();
        m.put("user", "daniele");
        m.put("message", "Olá, como está?");
        ja.put(m);

        m = new JSONObject();
        m.put("user", "daniele");
        m.put("message", "Tava querendo confirmar a reunião amanhã\nàs 15h");
        ja.put(m);

        m = new JSONObject();
        m.put("user", "daniele");
        m.put("message", "Posso confirmar?");
        ja.put(m);

        m = new JSONObject();
        m.put("user", "dirceubelem");
        m.put("message", "Oi Daniele.");
        ja.put(m);

        m = new JSONObject();
        m.put("user", "dirceubelem");
        m.put("message", "Como vai?");
        ja.put(m);

        m = new JSONObject();
        m.put("user", "daniele");
        m.put("message", "Me manda depois seu e-mail para eu poder\nmandar o invite");
        ja.put(m);

        m = new JSONObject();
        m.put("user", "dirceubelem");
        m.put("message", "Segue aí,\ndirceu@fourtime.com");
        ja.put(m);

        m = new JSONObject();
        m.put("user", "dirceubelem");
        m.put("message", "Até amanhã. Abs");
        ja.put(m);

        j.put("messages", ja);

        return j.toString();
    }

}
