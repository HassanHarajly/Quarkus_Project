package org.acme;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    RestClient restClient;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DogFactsPojo hello() {
        return restClient.get("https://dog-api.kinduff.com/api/facts").readEntity(DogFactsPojo.class);
    }


}