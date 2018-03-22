import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/* @(#) $Id$
 *
 * Copyright (c) 2000-2018 ComArch S.A. All Rights Reserved. Any usage, duplication or redistribution of this
 * software is allowed only according to separate agreement prepared in written between ComArch and authorized party.
 */

/**
 * @author Piotr Maciaszek
 */

@Path("/test")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class HelloTest {
    
    @GET
    @Path("/hello")
    public String hello() {
        return "dupa";
    }
    
}
