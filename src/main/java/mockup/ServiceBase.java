package mockup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

public class ServiceBase {

    @Context
    protected UriInfo context;
    @Context
    protected HttpServletRequest request;
    @Context
    protected HttpServletResponse response;

}
