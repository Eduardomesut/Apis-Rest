/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rest;

import com.mycompany.dao.Tarea;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;

/**
 *
 * @author tarde
 */
@Path("/users")
public class TareaService {
    
    private static ArrayList<Tarea> tareas = new ArrayList<>();
    
    @POST
    @Path("/tarea/addTarea")
    @Produces(MediaType.APPLICATION_XML)
    public Tarea addTarea(Tarea tarea) {
        this.tareas.add(tarea);
        return tarea;
    }
    
    @POST
    @Path("/tarea/addTarea/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Tarea addTareaJSON(Tarea tarea) {
        this.tareas.add(tarea);
        return tarea;
    }
   
    @GET
    @Path("/tareas")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Tarea> mirarTareas() {
        return this.tareas;
    }
    
    
    
}
