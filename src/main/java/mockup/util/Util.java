package mockup.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {

    public static JSONObject requestGet(String endPoint, String key) throws Exception {

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet(endPoint);
        get.setHeader("Content-Type", "application/json");
        get.setHeader("X-Auth-Token", key);

        HttpResponse response = httpClient.execute(get);

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuilder result = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        JSONObject j = new JSONObject(result.toString());
        return j;

    }

    public static JSONObject requestGet(String endPoint) throws Exception {

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet(endPoint);
        get.setHeader("Content-Type", "application/json");

        HttpResponse response = httpClient.execute(get);

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuilder result = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        JSONObject j = new JSONObject(result.toString());
        return j;

    }

}
