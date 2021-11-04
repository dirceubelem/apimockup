package mockup;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("tinder")
public class ServiceTinder {

    @GET
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String getTinder() {

        JSONArray ja = new JSONArray();

        JSONObject j;

        j = new JSONObject();
        j.put("name", "Rex");
        j.put("picture", "https://mockup.fluo.app/finder/f1.jpg");
        j.put("age", 5);
        j.put("city", "Belo Horizonte");
        j.put("distance", "5 km distância");
        j.put("since", "Entrou em Novembro/21");
        ja.put(j);

        j = new JSONObject();
        j.put("name", "Boris");
        j.put("picture", "https://mockup.fluo.app/finder/f2.jpg");
        j.put("age", 6);
        j.put("city", "Betim");
        j.put("distance", "19 km distância");
        j.put("since", "Entrou em Setembro/21");
        ja.put(j);

        j = new JSONObject();
        j.put("name", "Lenon");
        j.put("picture", "https://mockup.fluo.app/finder/f3.jpg");
        j.put("age", 3);
        j.put("city", "Contagem");
        j.put("distance", "9 km distância");
        j.put("since", "Entrou em Outubro/21");
        ja.put(j);

        j = new JSONObject();
        j.put("name", "Lili");
        j.put("picture", "https://mockup.fluo.app/finder/f4.png");
        j.put("age", 4);
        j.put("city", "Sabará");
        j.put("distance", "29 km distância");
        j.put("since", "Entrou em Novembro/21");
        ja.put(j);


        return ja.toString();

    }

}
