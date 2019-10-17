package mockup;

import mockup.to.TOAccount;

import javax.ws.rs.*;

@Path("account")
public class ServiceAccount extends ServiceBase {

    @POST
    @Consumes(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    @Produces(ApplicationConfig.APPLICATION_JSON_CHARSET_UTF8)
    public TOAccount auth(TOAccount t) throws Exception {

        if (t.getEmail().equals("user@user.com") && t.getPassword().equals("senha123")) {
            t.setName("Usuário");
            t.setId(Guid.getString());
            return t;
        } else {

            response.sendError(403);

            return null;
        }

    }

}
