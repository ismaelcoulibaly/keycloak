package org.ila;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.jwt.JsonWebToken;

import io.quarkus.security.identity.SecurityIdentity;

@Path("/hello")
public class HelloResource {

    
    @Inject
    SecurityIdentity identity;

    @Inject
    JsonWebToken token;

    @GET
    public String hello() {
        return "Hello " + identity.getPrincipal().getName();
    }
}