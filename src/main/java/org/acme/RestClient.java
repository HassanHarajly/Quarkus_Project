package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
@ApplicationScoped
public class RestClient {
    public Response get(String url) {
        Client client = ClientBuilder.newBuilder().build();
        return client.target(url).request().get();
    }
}
