/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author dirceubelem
 */
@Path("usuario")
public class ServiceUsuario {

    @Context
    private UriInfo context;
    @Context
    private HttpServletRequest request;
    @Context
    private HttpServletResponse response;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceUsuario() {
    }

    @POST
    @Path("autenticar")
    @Consumes("application/json")
    public void autenticar(Usuario usuario) throws Exception {

        if (!(usuario.getUsuario().equals("usuario@email.com") && usuario.getSenha().equals("senha123"))) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
        }else{
            response.sendError(HttpServletResponse.SC_OK);
        }

    }
}
