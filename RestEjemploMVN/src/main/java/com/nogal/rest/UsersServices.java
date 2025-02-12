package com.nogal.rest;

import com.nogal.dao.User;
import java.util.List;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;

//http://localhost:8080/RestEjemploMVN/resources/users/all/XML

@Path("/users")
public class UsersServices {

    @GET
    @Path("/all/XML")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getUsers() {
        List<User> r = new ArrayList<User>();
        r.add(new User("1", "Pepe", "alumno", 1989));
        r.add(new User("2", "Juan", "alumno", 1979));
        r.add(new User("3", "Sara", "profe", 1999));
        return r;
    }

    @GET
    @Path("/all/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsersJSON() {
        List<User> r = new ArrayList<User>();
        r.add(new User("1", "Pepe", "alumno", 1989));
        r.add(new User("2", "Juan", "alumno", 1979));
        r.add(new User("3", "Sara", "profe", 1999));
        return r;
    }

    
    @POST
    @Path("/postUsers/XML")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public List<User> createUser(List<User> lu) {
        for (User user : lu) {
            System.out.println(user);
        }
        return lu;
    }

    @POST
    @Path("/postUsers/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<User> createUserJSON(List<User> lu) {
        for (User user : lu) {
            System.out.println(user);
        }
        return lu;
    }

}
