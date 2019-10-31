package mockup;

import mockup.football.Football;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("competition")
public class ServiceCompetition {

    @GET
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String get() throws Exception {

        Object o = Cache.getCache("competition", "list");

        if (o != null) {
            JSONObject j = (JSONObject) o;
            return j.toString();
        } else {
            JSONObject j = Football.getCompetitions();
            Cache.setCacheSeconds("competition", "list", j, 10);
            return j.toString();
        }

    }

}
