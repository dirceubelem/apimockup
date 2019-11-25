package mockup;

import mockup.football.Football;
import org.json.JSONArray;
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

        try {

            Object o = Cache.getCache("competition", "list");

            if (o != null) {
                JSONObject j = (JSONObject) o;
                return j.toString();
            } else {
                JSONObject j = Football.getCompetitions();

                JSONArray competitions = j.getJSONArray("competitions");
                JSONArray newCompetitions = new JSONArray();

                for (int i = 0; i < competitions.length(); i++) {
                    JSONObject jo = competitions.getJSONObject(i);

                    if (jo.getString("plan").equals("TIER_ONE")) {
                        newCompetitions.put(jo);
                    }
                }

                j.put("competitions", newCompetitions);
                j.put("count", newCompetitions.length());

                j.put("datejson", DateTime.now().toString("dd/MM/yyyy HH:mm:ss"));
                Cache.setCache("competition", "list", j, 1440);
                return j.toString();
            }

        } catch (Exception e) {

            String json = "{\"datejson\":\"24/11/2019 23:28:26\",\"count\":12,\"competitions\":[{\"area\":{\"name\":\"Brazil\",\"id\":2032},\"lastUpdated\":\"2019-11-25T01:25:02Z\",\"code\":\"BSA\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":34,\"endDate\":\"2019-12-08\",\"id\":460,\"startDate\":\"2019-04-28\"},\"name\":\"Série A\",\"id\":2013,\"numberOfAvailableSeasons\":3,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"England\",\"id\":2072},\"lastUpdated\":\"2019-11-25T00:00:14Z\",\"code\":\"ELC\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":17,\"endDate\":\"2020-05-27\",\"id\":503,\"startDate\":\"2019-08-02\"},\"name\":\"Championship\",\"id\":2016,\"numberOfAvailableSeasons\":3,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"England\",\"id\":2072},\"lastUpdated\":\"2019-11-24T23:59:27Z\",\"code\":\"PL\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":13,\"endDate\":\"2020-05-17\",\"id\":468,\"startDate\":\"2019-08-09\"},\"name\":\"Premier League\",\"id\":2021,\"numberOfAvailableSeasons\":27,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"Europe\",\"id\":2077},\"lastUpdated\":\"2019-11-07T20:45:01Z\",\"code\":\"CL\",\"emblemUrl\":\"https://upload.wikimedia.org/wikipedia/en/b/bf/UEFA_Champions_League_logo_2.svg\",\"currentSeason\":{\"winner\":null,\"currentMatchday\":5,\"endDate\":\"2020-05-30\",\"id\":495,\"startDate\":\"2019-06-25\"},\"name\":\"UEFA Champions League\",\"id\":2001,\"numberOfAvailableSeasons\":19,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"Europe\",\"id\":2077},\"lastUpdated\":\"2018-08-23T12:16:01Z\",\"code\":\"EC\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":null,\"endDate\":\"2020-07-12\",\"id\":507,\"startDate\":\"2020-06-12\"},\"name\":\"European Championship\",\"id\":2018,\"numberOfAvailableSeasons\":2,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"France\",\"id\":2081},\"lastUpdated\":\"2019-11-24T23:59:47Z\",\"code\":\"FL1\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":14,\"endDate\":\"2020-05-31\",\"id\":499,\"startDate\":\"2019-08-09\"},\"name\":\"Ligue 1\",\"id\":2015,\"numberOfAvailableSeasons\":9,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"Germany\",\"id\":2088},\"lastUpdated\":\"2019-11-24T23:59:27Z\",\"code\":\"BL1\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":12,\"endDate\":\"2020-05-16\",\"id\":474,\"startDate\":\"2019-08-16\"},\"name\":\"Bundesliga\",\"id\":2002,\"numberOfAvailableSeasons\":24,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"Italy\",\"id\":2114},\"lastUpdated\":\"2019-11-24T23:59:28Z\",\"code\":\"SA\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":13,\"endDate\":\"2020-05-24\",\"id\":530,\"startDate\":\"2019-08-24\"},\"name\":\"Serie A\",\"id\":2019,\"numberOfAvailableSeasons\":15,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"Netherlands\",\"id\":2163},\"lastUpdated\":\"2019-11-24T23:59:31Z\",\"code\":\"DED\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":14,\"endDate\":\"2020-05-25\",\"id\":481,\"startDate\":\"2019-08-09\"},\"name\":\"Eredivisie\",\"id\":2003,\"numberOfAvailableSeasons\":10,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"Portugal\",\"id\":2187},\"lastUpdated\":\"2019-11-11T21:55:09Z\",\"code\":\"PPL\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":12,\"endDate\":\"2020-05-19\",\"id\":484,\"startDate\":\"2019-08-10\"},\"name\":\"Primeira Liga\",\"id\":2017,\"numberOfAvailableSeasons\":9,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"Spain\",\"id\":2224},\"lastUpdated\":\"2019-11-24T23:59:34Z\",\"code\":\"PD\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":null,\"currentMatchday\":14,\"endDate\":\"2020-05-24\",\"id\":519,\"startDate\":\"2019-08-16\"},\"name\":\"Primera Division\",\"id\":2014,\"numberOfAvailableSeasons\":27,\"plan\":\"TIER_ONE\"},{\"area\":{\"name\":\"World\",\"id\":2267},\"lastUpdated\":\"2018-08-23T12:16:17Z\",\"code\":\"WC\",\"emblemUrl\":null,\"currentSeason\":{\"winner\":{\"crestUrl\":\"https://upload.wikimedia.org/wikipedia/en/c/c3/Flag_of_France.svg\",\"name\":\"France\",\"tla\":\"FRA\",\"id\":773,\"shortName\":\"France\"},\"currentMatchday\":3,\"endDate\":\"2018-07-15\",\"id\":1,\"startDate\":\"2018-06-14\"},\"name\":\"FIFA World Cup\",\"id\":2000,\"numberOfAvailableSeasons\":2,\"plan\":\"TIER_ONE\"}],\"filters\":{}}";
            return json;

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
            j.put("datejson", DateTime.now().toString("dd/MM/yyyy HH:mm:ss"));
            Cache.setCache("competition", "teams" + id, j, 1440);
            return j.toString();
        }

    }

    @GET
    @Path("{code}/matches/{day}")
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getTeams(@PathParam("code") String code, @PathParam("day") int day) throws Exception {

        Object o = Cache.getCache("competition", "matches" + code + day);

        if (o != null) {
            JSONObject j = (JSONObject) o;
            return j.toString();
        } else {
            JSONObject j = Football.getMatches(code, day);
            j.put("datejson", DateTime.now().toString("dd/MM/yyyy HH:mm:ss"));
            Cache.setCacheSeconds("competition", "matches" + code + day, j, 20);
            return j.toString();
        }

    }

    @GET
    @Path("{code}/standings")
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getStandings(@PathParam("code") String code) throws Exception {

        try {

            Object o = Cache.getCache("competition", "standings" + code);

            if (o != null) {
                JSONObject j = (JSONObject) o;
                return j.toString();
            } else {
                JSONObject j = Football.getStandings(code);
                j.put("datejson", DateTime.now().toString("dd/MM/yyyy HH:mm:ss"));
                Cache.setCacheSeconds("competition", "standings" + code, j, 20);
                return j.toString();
            }

        } catch (Exception e) {

            String json = "{\"datejson\":\"24/11/2019 23:55:28\",\"season\":{\"winner\":null,\"currentMatchday\":34,\"endDate\":\"2019-12-08\",\"id\":460,\"startDate\":\"2019-04-28\"},\"competition\":{\"area\":{\"name\":\"Brazil\",\"id\":2032},\"lastUpdated\":\"2019-11-25T01:55:02Z\",\"code\":\"BSA\",\"name\":\"Série A\",\"id\":2013,\"plan\":\"TIER_ONE\"},\"filters\":{},\"standings\":[{\"stage\":\"REGULAR_SEASON\",\"type\":\"TOTAL\",\"table\":[{\"goalsFor\":73,\"lost\":3,\"won\":25,\"playedGames\":34,\"position\":1,\"team\":{\"crestUrl\":\"\",\"name\":\"CR Flamengo\",\"id\":1783},\"draw\":6,\"goalsAgainst\":30,\"goalDifference\":43,\"points\":81},{\"goalsFor\":53,\"lost\":6,\"won\":20,\"playedGames\":34,\"position\":2,\"team\":{\"crestUrl\":null,\"name\":\"Santos FC\",\"id\":6685},\"draw\":8,\"goalsAgainst\":30,\"goalDifference\":23,\"points\":68},{\"goalsFor\":53,\"lost\":4,\"won\":19,\"playedGames\":34,\"position\":3,\"team\":{\"crestUrl\":null,\"name\":\"SE Palmeiras\",\"id\":1769},\"draw\":11,\"goalsAgainst\":27,\"goalDifference\":26,\"points\":68},{\"goalsFor\":57,\"lost\":9,\"won\":17,\"playedGames\":34,\"position\":4,\"team\":{\"crestUrl\":null,\"name\":\"Grêmio FBPA\",\"id\":1767},\"draw\":8,\"goalsAgainst\":34,\"goalDifference\":23,\"points\":59},{\"goalsFor\":47,\"lost\":10,\"won\":16,\"playedGames\":34,\"position\":5,\"team\":{\"crestUrl\":null,\"name\":\"CA Paranaense\",\"id\":1768},\"draw\":8,\"goalsAgainst\":31,\"goalDifference\":16,\"points\":56},{\"goalsFor\":34,\"lost\":8,\"won\":14,\"playedGames\":34,\"position\":6,\"team\":{\"crestUrl\":null,\"name\":\"São Paulo FC\",\"id\":1776},\"draw\":12,\"goalsAgainst\":25,\"goalDifference\":9,\"points\":54},{\"goalsFor\":39,\"lost\":11,\"won\":14,\"playedGames\":34,\"position\":7,\"team\":{\"crestUrl\":null,\"name\":\"SC Internacional\",\"id\":6684},\"draw\":9,\"goalsAgainst\":34,\"goalDifference\":5,\"points\":51},{\"goalsFor\":36,\"lost\":8,\"won\":12,\"playedGames\":34,\"position\":8,\"team\":{\"crestUrl\":null,\"name\":\"SC Corinthians Paulista\",\"id\":1779},\"draw\":14,\"goalsAgainst\":30,\"goalDifference\":6,\"points\":50},{\"goalsFor\":39,\"lost\":14,\"won\":13,\"playedGames\":34,\"position\":9,\"team\":{\"crestUrl\":null,\"name\":\"Goiás EC\",\"id\":4250},\"draw\":7,\"goalsAgainst\":54,\"goalDifference\":-15,\"points\":46},{\"goalsFor\":39,\"lost\":12,\"won\":11,\"playedGames\":34,\"position\":10,\"team\":{\"crestUrl\":null,\"name\":\"EC Bahia\",\"id\":1777},\"draw\":11,\"goalsAgainst\":38,\"goalDifference\":1,\"points\":44},{\"goalsFor\":36,\"lost\":12,\"won\":11,\"playedGames\":34,\"position\":11,\"team\":{\"crestUrl\":null,\"name\":\"CR Vasco da Gama\",\"id\":1780},\"draw\":11,\"goalsAgainst\":42,\"goalDifference\":-6,\"points\":44},{\"goalsFor\":44,\"lost\":15,\"won\":12,\"playedGames\":34,\"position\":12,\"team\":{\"crestUrl\":null,\"name\":\"Fortaleza EC\",\"id\":3984},\"draw\":7,\"goalsAgainst\":46,\"goalDifference\":-2,\"points\":43},{\"goalsFor\":39,\"lost\":15,\"won\":11,\"playedGames\":34,\"position\":13,\"team\":{\"crestUrl\":null,\"name\":\"CA Mineiro\",\"id\":1766},\"draw\":8,\"goalsAgainst\":45,\"goalDifference\":-6,\"points\":41},{\"goalsFor\":29,\"lost\":19,\"won\":12,\"playedGames\":34,\"position\":14,\"team\":{\"crestUrl\":null,\"name\":\"Botafogo FR\",\"id\":1770},\"draw\":3,\"goalsAgainst\":41,\"goalDifference\":-12,\"points\":39},{\"goalsFor\":33,\"lost\":17,\"won\":10,\"playedGames\":34,\"position\":15,\"team\":{\"crestUrl\":null,\"name\":\"Ceará SC\",\"id\":1837},\"draw\":7,\"goalsAgainst\":34,\"goalDifference\":-1,\"points\":37},{\"goalsFor\":27,\"lost\":12,\"won\":7,\"playedGames\":34,\"position\":16,\"team\":{\"crestUrl\":null,\"name\":\"Cruzeiro EC\",\"id\":1771},\"draw\":15,\"goalsAgainst\":40,\"goalDifference\":-13,\"points\":36},{\"goalsFor\":33,\"lost\":16,\"won\":9,\"playedGames\":33,\"position\":17,\"team\":{\"crestUrl\":null,\"name\":\"Fluminense FC\",\"id\":1765},\"draw\":8,\"goalsAgainst\":44,\"goalDifference\":-11,\"points\":35},{\"goalsFor\":21,\"lost\":18,\"won\":7,\"playedGames\":33,\"position\":18,\"team\":{\"crestUrl\":null,\"name\":\"CS Alagoano\",\"id\":4244},\"draw\":8,\"goalsAgainst\":50,\"goalDifference\":-29,\"points\":29},{\"goalsFor\":27,\"lost\":18,\"won\":6,\"playedGames\":34,\"position\":19,\"team\":{\"crestUrl\":null,\"name\":\"Chapecoense AF\",\"id\":1772},\"draw\":10,\"goalsAgainst\":48,\"goalDifference\":-21,\"points\":28},{\"goalsFor\":16,\"lost\":22,\"won\":3,\"playedGames\":34,\"position\":20,\"team\":{\"crestUrl\":null,\"name\":\"Avaí FC\",\"id\":1775},\"draw\":9,\"goalsAgainst\":52,\"goalDifference\":-36,\"points\":18}],\"group\":null},{\"stage\":\"REGULAR_SEASON\",\"type\":\"HOME\",\"table\":[{\"goalsFor\":46,\"lost\":0,\"won\":15,\"playedGames\":17,\"position\":1,\"team\":{\"crestUrl\":\"\",\"name\":\"CR Flamengo\",\"id\":1783},\"draw\":2,\"goalsAgainst\":16,\"goalDifference\":30,\"points\":47},{\"goalsFor\":34,\"lost\":1,\"won\":12,\"playedGames\":17,\"position\":2,\"team\":{\"crestUrl\":null,\"name\":\"SE Palmeiras\",\"id\":1769},\"draw\":4,\"goalsAgainst\":9,\"goalDifference\":25,\"points\":40},{\"goalsFor\":38,\"lost\":1,\"won\":12,\"playedGames\":17,\"position\":3,\"team\":{\"crestUrl\":null,\"name\":\"Santos FC\",\"id\":6685},\"draw\":4,\"goalsAgainst\":15,\"goalDifference\":23,\"points\":40},{\"goalsFor\":25,\"lost\":1,\"won\":10,\"playedGames\":17,\"position\":4,\"team\":{\"crestUrl\":null,\"name\":\"SC Internacional\",\"id\":6684},\"draw\":6,\"goalsAgainst\":12,\"goalDifference\":13,\"points\":36},{\"goalsFor\":21,\"lost\":1,\"won\":9,\"playedGames\":17,\"position\":5,\"team\":{\"crestUrl\":null,\"name\":\"SC Corinthians Paulista\",\"id\":1779},\"draw\":7,\"goalsAgainst\":11,\"goalDifference\":10,\"points\":34},{\"goalsFor\":33,\"lost\":4,\"won\":10,\"playedGames\":17,\"position\":6,\"team\":{\"crestUrl\":null,\"name\":\"Grêmio FBPA\",\"id\":1767},\"draw\":3,\"goalsAgainst\":18,\"goalDifference\":15,\"points\":33},{\"goalsFor\":23,\"lost\":4,\"won\":10,\"playedGames\":17,\"position\":7,\"team\":{\"crestUrl\":null,\"name\":\"CA Paranaense\",\"id\":1768},\"draw\":3,\"goalsAgainst\":11,\"goalDifference\":12,\"points\":33},{\"goalsFor\":27,\"lost\":4,\"won\":10,\"playedGames\":17,\"position\":8,\"team\":{\"crestUrl\":null,\"name\":\"Goiás EC\",\"id\":4250},\"draw\":3,\"goalsAgainst\":19,\"goalDifference\":8,\"points\":33},{\"goalsFor\":20,\"lost\":3,\"won\":8,\"playedGames\":17,\"position\":9,\"team\":{\"crestUrl\":null,\"name\":\"São Paulo FC\",\"id\":1776},\"draw\":6,\"goalsAgainst\":11,\"goalDifference\":9,\"points\":30},{\"goalsFor\":22,\"lost\":6,\"won\":9,\"playedGames\":17,\"position\":10,\"team\":{\"crestUrl\":null,\"name\":\"Fortaleza EC\",\"id\":3984},\"draw\":2,\"goalsAgainst\":15,\"goalDifference\":7,\"points\":29},{\"goalsFor\":22,\"lost\":4,\"won\":8,\"playedGames\":17,\"position\":11,\"team\":{\"crestUrl\":null,\"name\":\"Ceará SC\",\"id\":1837},\"draw\":5,\"goalsAgainst\":12,\"goalDifference\":10,\"points\":29},{\"goalsFor\":18,\"lost\":7,\"won\":9,\"playedGames\":17,\"position\":12,\"team\":{\"crestUrl\":null,\"name\":\"Botafogo FR\",\"id\":1770},\"draw\":1,\"goalsAgainst\":15,\"goalDifference\":3,\"points\":28},{\"goalsFor\":22,\"lost\":4,\"won\":7,\"playedGames\":17,\"position\":13,\"team\":{\"crestUrl\":null,\"name\":\"EC Bahia\",\"id\":1777},\"draw\":6,\"goalsAgainst\":16,\"goalDifference\":6,\"points\":27},{\"goalsFor\":24,\"lost\":7,\"won\":8,\"playedGames\":17,\"position\":14,\"team\":{\"crestUrl\":null,\"name\":\"CA Mineiro\",\"id\":1766},\"draw\":2,\"goalsAgainst\":22,\"goalDifference\":2,\"points\":26},{\"goalsFor\":18,\"lost\":6,\"won\":6,\"playedGames\":17,\"position\":15,\"team\":{\"crestUrl\":null,\"name\":\"CR Vasco da Gama\",\"id\":1780},\"draw\":5,\"goalsAgainst\":21,\"goalDifference\":-3,\"points\":23},{\"goalsFor\":15,\"lost\":5,\"won\":6,\"playedGames\":16,\"position\":16,\"team\":{\"crestUrl\":null,\"name\":\"CS Alagoano\",\"id\":4244},\"draw\":5,\"goalsAgainst\":19,\"goalDifference\":-4,\"points\":23},{\"goalsFor\":13,\"lost\":4,\"won\":5,\"playedGames\":17,\"position\":17,\"team\":{\"crestUrl\":null,\"name\":\"Cruzeiro EC\",\"id\":1771},\"draw\":8,\"goalsAgainst\":14,\"goalDifference\":-1,\"points\":23},{\"goalsFor\":17,\"lost\":6,\"won\":5,\"playedGames\":17,\"position\":18,\"team\":{\"crestUrl\":null,\"name\":\"Fluminense FC\",\"id\":1765},\"draw\":6,\"goalsAgainst\":15,\"goalDifference\":2,\"points\":21},{\"goalsFor\":13,\"lost\":9,\"won\":3,\"playedGames\":17,\"position\":19,\"team\":{\"crestUrl\":null,\"name\":\"Chapecoense AF\",\"id\":1772},\"draw\":5,\"goalsAgainst\":21,\"goalDifference\":-8,\"points\":14},{\"goalsFor\":9,\"lost\":9,\"won\":1,\"playedGames\":17,\"position\":20,\"team\":{\"crestUrl\":null,\"name\":\"Avaí FC\",\"id\":1775},\"draw\":7,\"goalsAgainst\":23,\"goalDifference\":-14,\"points\":10}],\"group\":null},{\"stage\":\"REGULAR_SEASON\",\"type\":\"AWAY\",\"table\":[{\"goalsFor\":27,\"lost\":3,\"won\":10,\"playedGames\":17,\"position\":1,\"team\":{\"crestUrl\":\"\",\"name\":\"CR Flamengo\",\"id\":1783},\"draw\":4,\"goalsAgainst\":14,\"goalDifference\":13,\"points\":34},{\"goalsFor\":15,\"lost\":5,\"won\":8,\"playedGames\":17,\"position\":2,\"team\":{\"crestUrl\":null,\"name\":\"Santos FC\",\"id\":6685},\"draw\":4,\"goalsAgainst\":15,\"goalDifference\":0,\"points\":28},{\"goalsFor\":19,\"lost\":3,\"won\":7,\"playedGames\":17,\"position\":3,\"team\":{\"crestUrl\":null,\"name\":\"SE Palmeiras\",\"id\":1769},\"draw\":7,\"goalsAgainst\":18,\"goalDifference\":1,\"points\":28},{\"goalsFor\":24,\"lost\":5,\"won\":7,\"playedGames\":17,\"position\":4,\"team\":{\"crestUrl\":null,\"name\":\"Grêmio FBPA\",\"id\":1767},\"draw\":5,\"goalsAgainst\":16,\"goalDifference\":8,\"points\":26},{\"goalsFor\":14,\"lost\":5,\"won\":6,\"playedGames\":17,\"position\":5,\"team\":{\"crestUrl\":null,\"name\":\"São Paulo FC\",\"id\":1776},\"draw\":6,\"goalsAgainst\":14,\"goalDifference\":0,\"points\":24},{\"goalsFor\":24,\"lost\":6,\"won\":6,\"playedGames\":17,\"position\":6,\"team\":{\"crestUrl\":null,\"name\":\"CA Paranaense\",\"id\":1768},\"draw\":5,\"goalsAgainst\":20,\"goalDifference\":4,\"points\":23},{\"goalsFor\":18,\"lost\":6,\"won\":5,\"playedGames\":17,\"position\":7,\"team\":{\"crestUrl\":null,\"name\":\"CR Vasco da Gama\",\"id\":1780},\"draw\":6,\"goalsAgainst\":21,\"goalDifference\":-3,\"points\":21},{\"goalsFor\":17,\"lost\":8,\"won\":4,\"playedGames\":17,\"position\":8,\"team\":{\"crestUrl\":null,\"name\":\"EC Bahia\",\"id\":1777},\"draw\":5,\"goalsAgainst\":22,\"goalDifference\":-5,\"points\":17},{\"goalsFor\":15,\"lost\":7,\"won\":3,\"playedGames\":17,\"position\":9,\"team\":{\"crestUrl\":null,\"name\":\"SC Corinthians Paulista\",\"id\":1779},\"draw\":7,\"goalsAgainst\":19,\"goalDifference\":-4,\"points\":16},{\"goalsFor\":14,\"lost\":10,\"won\":4,\"playedGames\":17,\"position\":10,\"team\":{\"crestUrl\":null,\"name\":\"SC Internacional\",\"id\":6684},\"draw\":3,\"goalsAgainst\":22,\"goalDifference\":-8,\"points\":15},{\"goalsFor\":15,\"lost\":8,\"won\":3,\"playedGames\":17,\"position\":11,\"team\":{\"crestUrl\":null,\"name\":\"CA Mineiro\",\"id\":1766},\"draw\":6,\"goalsAgainst\":23,\"goalDifference\":-8,\"points\":15},{\"goalsFor\":16,\"lost\":10,\"won\":4,\"playedGames\":16,\"position\":12,\"team\":{\"crestUrl\":null,\"name\":\"Fluminense FC\",\"id\":1765},\"draw\":2,\"goalsAgainst\":29,\"goalDifference\":-13,\"points\":14},{\"goalsFor\":22,\"lost\":9,\"won\":3,\"playedGames\":17,\"position\":13,\"team\":{\"crestUrl\":null,\"name\":\"Fortaleza EC\",\"id\":3984},\"draw\":5,\"goalsAgainst\":31,\"goalDifference\":-9,\"points\":14},{\"goalsFor\":14,\"lost\":9,\"won\":3,\"playedGames\":17,\"position\":14,\"team\":{\"crestUrl\":null,\"name\":\"Chapecoense AF\",\"id\":1772},\"draw\":5,\"goalsAgainst\":27,\"goalDifference\":-13,\"points\":14},{\"goalsFor\":12,\"lost\":10,\"won\":3,\"playedGames\":17,\"position\":15,\"team\":{\"crestUrl\":null,\"name\":\"Goiás EC\",\"id\":4250},\"draw\":4,\"goalsAgainst\":35,\"goalDifference\":-23,\"points\":13},{\"goalsFor\":14,\"lost\":8,\"won\":2,\"playedGames\":17,\"position\":16,\"team\":{\"crestUrl\":null,\"name\":\"Cruzeiro EC\",\"id\":1771},\"draw\":7,\"goalsAgainst\":26,\"goalDifference\":-12,\"points\":13},{\"goalsFor\":11,\"lost\":12,\"won\":3,\"playedGames\":17,\"position\":17,\"team\":{\"crestUrl\":null,\"name\":\"Botafogo FR\",\"id\":1770},\"draw\":2,\"goalsAgainst\":26,\"goalDifference\":-15,\"points\":11},{\"goalsFor\":11,\"lost\":13,\"won\":2,\"playedGames\":17,\"position\":18,\"team\":{\"crestUrl\":null,\"name\":\"Ceará SC\",\"id\":1837},\"draw\":2,\"goalsAgainst\":22,\"goalDifference\":-11,\"points\":8},{\"goalsFor\":7,\"lost\":13,\"won\":2,\"playedGames\":17,\"position\":19,\"team\":{\"crestUrl\":null,\"name\":\"Avaí FC\",\"id\":1775},\"draw\":2,\"goalsAgainst\":29,\"goalDifference\":-22,\"points\":8},{\"goalsFor\":6,\"lost\":13,\"won\":1,\"playedGames\":17,\"position\":20,\"team\":{\"crestUrl\":null,\"name\":\"CS Alagoano\",\"id\":4244},\"draw\":3,\"goalsAgainst\":31,\"goalDifference\":-25,\"points\":6}],\"group\":null}]}";
            return json;

        }

    }

}
