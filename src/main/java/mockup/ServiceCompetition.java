package mockup;

import mockup.football.Football;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
            Cache.setCache("competition", "list", j, 1440);
            return j.toString();
        }

    }

    @GET
    @Path("{id}/teams")
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getTeams(@PathParam("id") int id) throws Exception {

        Object o = Cache.getCache("competition", "teams" + id);

        if (o != null) {
            JSONObject j = (JSONObject) o;
            return j.toString();
        } else {
            JSONObject j = Football.getTeams(id);
            Cache.setCache("competition", "teams" + id, j, 1440);
            return j.toString();
        }

    }

    @GET
    @Path("{code}/matches/{day}")
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getTeams(@PathParam("code") String code, @PathParam("v") int day) throws Exception {

        Object o = Cache.getCache("competition", "matches" + code + day);

        if (o != null) {
            JSONObject j = (JSONObject) o;
            return j.toString();
        } else {
            JSONObject j = Football.getMatches(code, day);
            Cache.setCacheSeconds("competition", "matches" + code + day, j, 10);
            return j.toString();
        }

    }

    @GET
    @Path("{code}/standings")
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getStandings(@PathParam("code") String code) throws Exception {

        Object o = Cache.getCache("competition", "standings" + code);

        if (o != null) {
            JSONObject j = (JSONObject) o;
            return j.toString();
        } else {
            JSONObject j = Football.getStandings(code);
            Cache.setCacheSeconds("competition", "standings" + code, j, 10);
            return j.toString();
        }

    }

}
