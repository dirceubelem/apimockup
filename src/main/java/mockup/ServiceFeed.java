package mockup;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("feed")
public class ServiceFeed extends ServiceBase {

    @GET
    @Path("prova")
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String feedProva() {
        JSONArray ja = new JSONArray();

        JSONObject j;

        j = new JSONObject();
        j.put("curtidas", 513);
        j.put("perfil", "https://mockup.fluo.site/avatar/1.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/alexey-sviridkin-VXb42m0uM3s-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 542);
        j.put("perfil", "https://mockup.fluo.site/avatar/2.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/alexey-sviridkin-VXb42m0uM3s-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 321);
        j.put("perfil", "https://mockup.fluo.site/avatar/3.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/anita-austvika-Grh1pGOrxuE-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 6452);
        j.put("perfil", "https://mockup.fluo.site/avatar/4.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/anita-austvika-KAkljqqXdKs-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 65);
        j.put("perfil", "https://mockup.fluo.site/avatar/5.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/christiann-koepke-XersifI0JCk-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 5665);
        j.put("perfil", "https://mockup.fluo.site/avatar/6.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/cristina-gottardi-E5UPWEIjvB8-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 412);
        j.put("perfil", "https://mockup.fluo.site/avatar/7.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/daniel-thiele-MG4ap7OlC0w-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 12);
        j.put("perfil", "https://mockup.fluo.site/avatar/8.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/francisco-delgado-pp4krOAi1Rc-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("perfil", "https://mockup.fluo.site/avatar/9.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/gin-z-fDkXxoiUy6Q-unsplash.jpg");
        ja.put(j);

        j = new JSONObject();
        j.put("curtidas", 3489);
        j.put("perfil", "https://mockup.fluo.site/avatar/10.png");
        j.put("data", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("imagem", "https://mockup.fluo.site/images/harley-davidson-9yx3FyexTOU-unsplash.jpg");
        ja.put(j);

        return ja.toString();
    }

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

        JSONArray g;

        j = new JSONObject();
        j.put("id", Guid.getString());
        j.put("user", "mauricio");
        j.put("avatar", "https://mockup.fluo.site/avatar/1.png");
        j.put("local", "Los Angeles");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Dia de Chuva");
        j.put("image", "https://mockup.fluo.site/images/alexey-sviridkin-VXb42m0uM3s-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("alexey-sviridkin-VXb42m0uM3s-unsplash"));
        g.put(addGalery("anita-austvika-Grh1pGOrxuE-unsplash"));
        g.put(addGalery("anita-austvika-KAkljqqXdKs-unsplash"));
        g.put(addGalery("christiann-koepke-XersifI0JCk-unsplash"));
        j.put("gallery", g);

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
        j.put("avatar", "https://mockup.fluo.site/avatar/2.png");
        j.put("local", "Diamond");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Really enjoyed the movie");

        j.put("image", "https://mockup.fluo.site/images/cristina-gottardi-E5UPWEIjvB8-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("cristina-gottardi-E5UPWEIjvB8-unsplash"));
        g.put(addGalery("daniel-thiele-MG4ap7OlC0w-unsplash"));
        g.put(addGalery("francisco-delgado-pp4krOAi1Rc-unsplash"));
        g.put(addGalery("gin-z-fDkXxoiUy6Q-unsplash"));
        g.put(addGalery("harley-davidson-9yx3FyexTOU-unsplash"));
        j.put("gallery", g);


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
        j.put("avatar", "https://mockup.fluo.site/avatar/3.png");
        j.put("local", "São Paulo");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Entardecer");

        j.put("image", "https://mockup.fluo.site/images/ingmar-hoogerhoud-xsGE8wePfeA-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("ingmar-hoogerhoud-xsGE8wePfeA-unsplash"));
        g.put(addGalery("irena-carpaccio-nE0flkzTXxg-unsplash"));
        g.put(addGalery("irena-carpaccio-p6hzGvEXSoQ-unsplash"));
        g.put(addGalery("irena-carpaccio-SkI7RNk_t00-unsplash"));
        j.put("gallery", g);

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
        j.put("avatar", "https://mockup.fluo.site/avatar/3.png");
        j.put("local", "NY");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Photo by @awwnuhh42");
        j.put("image", "https://mockup.fluo.site/images/iva-s-lPnRIpkZnEk-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("iva-s-lPnRIpkZnEk-unsplash"));
        g.put(addGalery("jeffrey-grospe-P6I0OeIg8fg-unsplash"));
        g.put(addGalery("jeremy-bishop-2pQKwi5r2Yg-unsplash"));
        g.put(addGalery("jeremy-bishop-4la1HJ77U3Q-unsplash"));
        g.put(addGalery("jeremy-bishop-6AJC3L02OMc-unsplash"));
        g.put(addGalery("jeremy-bishop-7qplxRQbz34-unsplash"));
        j.put("gallery", g);

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
        j.put("avatar", "https://mockup.fluo.site/avatar/4.png");
        j.put("local", "Sapiens Parque");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Sapiens Parque");
        j.put("image", "https://mockup.fluo.site/images/jeremy-bishop-AXMEntgTSpM-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("jeremy-bishop-AXMEntgTSpM-unsplash"));
        g.put(addGalery("jeremy-bishop-d5YBTPgD-W0-unsplash"));
        g.put(addGalery("jeremy-bishop-hYdZ9PsWd-U-unsplash"));
        g.put(addGalery("julieta-christy-nFVf1c91750-unsplash"));
        g.put(addGalery("marcus-lenk-v-8P5fepcC8-unsplash"));
        j.put("gallery", g);
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
        j.put("avatar", "https://mockup.fluo.site/avatar/5.png");
        j.put("local", "Nova Suissa");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Setup");
        j.put("image", "https://mockup.fluo.site/images/milkovi-1MSHtu4pkBM-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("milkovi-1MSHtu4pkBM-unsplash"));
        g.put(addGalery("milkovi-Kp3B7GnvFD0-unsplash"));
        g.put(addGalery("moises-alex-RAah-FB0kpk-unsplash"));
        j.put("gallery", g);
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
        j.put("avatar", "https://mockup.fluo.site/avatar/6.png");
        j.put("local", "Belo Horizonte");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "O Cine Theatro Brasil, atualmente chamado Cine Theatro Brasil Vallourec, é um prédio histórico de Belo Horizonte");
        j.put("image", "https://mockup.fluo.site/images/sammy-joonhee-jkANttf0x1A-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("sammy-joonhee-jkANttf0x1A-unsplash"));
        g.put(addGalery("the-honest-company-r8Q_2nr9Rbg-unsplash"));
        j.put("gallery", g);
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
        j.put("user", "guilherme");
        j.put("local", "Belo Horizonte");
        j.put("avatar", "https://mockup.fluo.site/avatar/7.png");
        j.put("date", DateTime.now().toString("dd/MM/yyyy HH:mm"));
        j.put("description", "Alguém sabe onde a foto foi tirada");
        j.put("image", "https://mockup.fluo.site/images/the-honest-company-Ua9AK-pZ5cw-unsplash.jpg");

        g = new JSONArray();
        g.put(addGalery("the-honest-company-Ua9AK-pZ5cw-unsplash"));
        g.put(addGalery("wonsung-jang-zmMtb3PtsrE-unsplash"));
        g.put(addGalery("yann-allegre-1Phy9wlkM6M-unsplash"));
        g.put(addGalery("yann-allegre-Lbv1852MmOw-unsplash"));
        j.put("gallery", g);
        j.put("likes", f);

        ja.put(j);


        return ja.toString();
    }

    public JSONObject addGalery(String i) {
        JSONObject j = new JSONObject();
        j.put("image", "https://mockup.fluo.site/images/" + i + ".jpg");
        return j;
    }

}
