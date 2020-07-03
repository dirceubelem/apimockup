package mockup;

import mockup.football.Football;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("pbh")
public class ServicePBH {

    @GET
    @Path("{id}")
    public String get(@PathParam("id") String code) {
        try {

            Object o = Cache.getCache("pbh", "service" + code);

            if (o != null) {
                JSONObject j = (JSONObject) o;
                return j.toString();
            } else {
                JSONObject j = Football.getPBH(code);
                j.put("datejson", DateTime.now().toString("dd/MM/yyyy HH:mm:ss"));
                Cache.setCacheSeconds("pbh", "service" + code, j, 1440);
                return j.toString();
            }

        } catch (Exception e) {

            return "{\"error\": true}";

        }
    }

}
