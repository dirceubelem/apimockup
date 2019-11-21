/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockup;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author dirceubelem
 */
@Path("version")
public class ServiceVersion extends ServiceBase {

    @GET
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public String get() throws Exception {
        JSONObject j = new JSONObject();
        j.put("version", 0.6);
        return j.toString();
    }
}
