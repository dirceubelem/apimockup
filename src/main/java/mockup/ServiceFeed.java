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
        j.put("user", "mauricio");
        j.put("avatar", "https://i2.wp.com/ui-avatars.com/api/mauricio/128?ssl=1");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Dia de Chuva");
        j.put("image", "https://mockup.fluo.site/images/1.png");
        j.put("likes", f);

        ja.put(j);


        f = new JSONArray();
        f.put("Maria");
        f.put("Gustavo");
        f.put("Carlos");
        f.put("Carolina");
        f.put("Henrique");
        f.put("Dirceu");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("user", "gustavo");
        j.put("avatar", "https://i2.wp.com/ui-avatars.com/api/gustavo/128?ssl=1");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Really enjoyed the movie");
        j.put("image", "https://mockup.fluo.site/images/2.png");
        j.put("likes", f);

        ja.put(j);


        f = new JSONArray();
        f.put("Maria");
        f.put("Gustavo");
        f.put("Dirceu");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("user", "carolina");
        j.put("avatar", "https://i2.wp.com/ui-avatars.com/api/carolina/128?ssl=1");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Entardecer");
        j.put("image", "https://mockup.fluo.site/images/3.png");
        j.put("likes", f);

        ja.put(j);


        f = new JSONArray();
        f.put("Maria");
        f.put("Gustavo");
        f.put("Vitor");
        f.put("Alessandro");

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("user", "maria");
        j.put("avatar", "https://i2.wp.com/ui-avatars.com/api/carolina/128?ssl=1");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Photo by @awwnuhh42");
        j.put("image", "https://mockup.fluo.site/images/4.png");
        j.put("likes", f);

        ja.put(j);


        f = new JSONArray();
        f.put("Maria");
        f.put("Gustavo");
        f.put("Carlos");
        f.put("Carolina");
        f.put("Henrique");
        f.put("Dirceu");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");
        f.put("Geraldo");
        f.put("Renato");
        f.put("Cristina");

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("user", "carlos");
        j.put("avatar", "https://i2.wp.com/ui-avatars.com/api/carlosroberto/128?ssl=1");

        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Sapiens Parque");
        j.put("image", "https://mockup.fluo.site/images/5.png");
        j.put("likes", f);

        ja.put(j);

        f = new JSONArray();
        f.put("Maria");
        f.put("Gustavo");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");
        f.put("Geraldo");
        f.put("Renato");
        f.put("Cristina");


        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("user", "carlos");
        j.put("avatar", "https://i2.wp.com/ui-avatars.com/api/carlosroberto/128?ssl=1");

        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Setup");
        j.put("image", "https://mockup.fluo.site/images/6.png");
        j.put("likes", f);

        ja.put(j);


        f = new JSONArray();
        f.put("Maria");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");
        f.put("Geraldo");
        f.put("Maria");
        f.put("Gustavo");
        f.put("Carlos");
        f.put("Carolina");
        f.put("Henrique");
        f.put("Dirceu");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");
        f.put("Geraldo");
        f.put("Renato");
        f.put("Cristina");
        f.put("Renato");
        f.put("Cristina");

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("user", "dronebh");
        j.put("avatar", "https://i2.wp.com/ui-avatars.com/api/dronebh/128?ssl=1");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "O Cine Theatro Brasil, atualmente chamado Cine Theatro Brasil Vallourec, é um prédio histórico de Belo Horizonte");
        j.put("image", "https://mockup.fluo.site/images/7.png");
        j.put("likes", f);

        ja.put(j);


        f = new JSONArray();
        f.put("Maria");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");
        f.put("Geraldo");
        f.put("Renato");
        f.put("Cristina");
        f.put("Maria");
        f.put("Gustavo");
        f.put("Carlos");
        f.put("Carolina");
        f.put("Henrique");
        f.put("Dirceu");
        f.put("Roberto");
        f.put("Vitor");
        f.put("Alessandro");
        f.put("Geraldo");
        f.put("Renato");
        f.put("Cristina");

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Alguém sabe onde a foto foi tirada");
        j.put("image", "https://mockup.fluo.site/images/8.png");
        j.put("likes", f);

        ja.put(j);


        return ja.toString();
    }

}
