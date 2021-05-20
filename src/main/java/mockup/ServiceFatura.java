package mockup;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("fatura")
public class ServiceFatura {

    @GET
    public String getFatura() {

        JSONObject j = new JSONObject();
        j.put("vencimento", "15/05/2021");
        j.put("valor", 3559.17);
        j.put("limiteDisponivel", 6282.99);

        JSONArray ja = new JSONArray();
        ja.put(getItem("ifood", "Restaurante", "alimentacao.png", "12:11", 20.94));
        ja.put(getItem("ifood Clube", "Restaurante", "alimentacao.png", "12:09", 23.88));
        ja.put(getItem("Mercadopago *Loterias", "Serviços", "servicos.png", "11:42", 56.5));
        ja.put(getItem("Apple.Com/Bill", "Serviços", "servicos.png", "Ontem", 3.5));
        ja.put(getItem("Apple.Com/Bill", "Serviços", "servicos.png", "Ontem", 34.9));
        ja.put(getItem("Mercadolivre", "Outros", "outros.png", "Ontem", 154.44));
        ja.put(getItem("Mercadolivre", "Outros", "outros.png", "Ontem", 251.1));
        ja.put(getItem("Godaddy.com", "Serviços", "servicos.png", "Ontem", 127.15));
        ja.put(getItem("Ui8.Net", "Serviços", "servicos.png", "Ontem", 175.31));
        ja.put(getItem("Smiles Fidelidade S.A.", "Outros", "outros.png", "Terça", 42));
        ja.put(getItem("Sem Parar", "Viagem", "viagem.png", "05 Mai", 0.18));
        ja.put(getItem("ifood", "Restaurante", "alimentacao.png", "05 Mai", 28.34));
        ja.put(getItem("ifood", "Restaurante", "alimentacao.png", "04 Mai", 28.34));
        ja.put(getItem("Google Storage", "Educação", "educacao.png", "03 Mai", 6.99));
        ja.put(getItem("Ebanx*Spotify", "Serviços", "servicos.png", "28 Abr", 16.9));

        j.put("despesas", ja);

        return j.toString();

    }

    private JSONObject getItem(String descricao, String tipo, String imagem, String data, double valor) {
        JSONObject j = new JSONObject();
        j.put("descricao", descricao);
        j.put("tipo", tipo);
        j.put("imagem", "https://mockup.fluo.app/assets/fatura/" + imagem);
        j.put("valor", valor);
        j.put("data", data);
        return j;
    }

}
