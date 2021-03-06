package mockup.football;

import mockup.util.Util;
import org.json.JSONObject;

public class Football {

    private static final String URL = "http://api.football-data.org/v2/";
    private static final String KEY = "e9a6083cac7e418ba20fbf7ef49705e8";

    public static JSONObject getCompetitions() throws Exception {

        String url = URL + "competitions";

        JSONObject j = Util.requestGet(url, KEY);

        return j;

    }

    public static JSONObject getTeams(int competition) throws Exception {

        String url = URL + "competitions/" + competition + "/teams";

        JSONObject j = Util.requestGet(url, KEY);

        return j;

    }

    public static JSONObject getMatches(String competition, int day) throws Exception {

        String url = URL + "competitions/" + competition + "/matches/?matchday=" + day;

        JSONObject j = Util.requestGet(url, KEY);

        return j;

    }

    public static JSONObject getStandings(String competition) throws Exception {

        String url = URL + "competitions/" + competition + "/standings/";

        JSONObject j = Util.requestGet(url, KEY);

        return j;

    }

    public static JSONObject getPBH(String id) throws Exception {

        String url = "https://geoservicos.pbh.gov.br/geoserver/wfs?service=WFS&version=1.0.0&request=GetFeature&typeName=ide_bhgeo:" + id +
                "&srsName=EPSG:4326&outputFormat=application%2Fjson";

        JSONObject j = Util.requestGet(url);

        return j;

    }

}
