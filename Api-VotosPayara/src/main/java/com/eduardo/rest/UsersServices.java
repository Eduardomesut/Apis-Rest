package com.eduardo.rest;


import com.eduardo.dao.ObjetoCompartido;
import jakarta.inject.Inject;
import java.util.List;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;

//http://localhost:8080/fhgfgh/resources/gfg/gf/gf

@Path("/users")
public class UsersServices {
    @Inject
    private ObjetoCompartido obj;

    @GET
    @Path("/voto/{name}/XML")
    @Produces(MediaType.APPLICATION_XML)
    public String addVotoxml(@PathParam("name")String name) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response>" + this.obj.addVoto(name) + "</response>";
    }
    @GET
    @Path("/voto/{name}/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    public String addVotojson(@PathParam("name")String name) {
        return this.obj.addVoto(name);
    }
    @GET
    @Path("/votos/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, Integer> verVotosJSON(){
        return this.obj.verVotos();
        
    }
    @GET
    @Path("/votos/XML")
    @Produces(MediaType.APPLICATION_XML)
    public HashMap<String, Integer> verVotosXML(){
        return this.obj.verVotos();
        
    }
    
    @POST
    @Path("/postUsers/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public HashMap<String, Integer> createUserJSON(String body) {
       this.obj.addVoto(body);
       return this.obj.verVotos();
    }

}
