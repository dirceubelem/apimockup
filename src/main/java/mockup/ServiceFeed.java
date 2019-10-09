package mockup;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("feed")
public class ServiceFeed extends ServiceBase {

    @GET
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String feed() {
        JSONArray ja = new JSONArray();

        JSONObject j;

        JSONArray f = new JSONArray();
        f.put("Cláudio");
        f.put("Gustavo");
        f.put("Carlos");
        f.put("Carolina");
        f.put("Henrique");

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Imagem 1");
        j.put("image", "https://mockup.fluo.site/images/1.png");
        j.put("likes", f);

        ja.put(j);

        return ja.toString();
    }

}
