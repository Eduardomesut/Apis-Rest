/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mates.rest;

import com.mates.dao.HacerOperacion;
import com.mates.dao.Operacion;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
@Path("/users")
public class MatesService {
    private static HacerOperacion operacion = new HacerOperacion();
    
    //http://localhost:8080/Api-maths/
    
    @GET
    @Path("/operar/{operacion}/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    public Operacion hacerOperacion(@PathParam("operacion")String operacion){
        String[]partes;
        if (operacion.contains("+")) {
            partes = operacion.split("\\+");
            double num1 = Double.parseDouble(partes[0]);
            double num2 = Double.parseDouble(partes[1]);
            Operacion op = this.operacion.suma(num1, num2);
            return op;
        }else{
            partes = operacion.split("-");
            double num1 = Double.parseDouble(partes[0]);
            double num2 = Double.parseDouble(partes[1]);
            Operacion op = this.operacion.resta(num1, num2);
            return op;
        }
    }
    
    @GET
    @Path("/operar/{operacion}/XML")
    @Produces(MediaType.APPLICATION_XML)
    public Operacion hacerOperacionxml(@PathParam("operacion")String operacion){
        String[]partes;
        if (operacion.contains("+")) {
            partes = operacion.split("\\+");
            double num1 = Double.parseDouble(partes[0]);
            double num2 = Double.parseDouble(partes[1]);
            Operacion op = this.operacion.suma(num1, num2);
            return op;
        }else{
            partes = operacion.split("-");
            double num1 = Double.parseDouble(partes[0]);
            double num2 = Double.parseDouble(partes[1]);
            Operacion op = this.operacion.resta(num1, num2);
            return op;
        }
    }
    
    @GET
    @Path("/operaciones/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Operacion> verOperaciones(){
        return this.operacion.verTodas();
    }
    
    @GET
    @Path("/operaciones/XML")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Operacion> verOperacionesxml(){
        return this.operacion.verTodas();
    }
    
    @POST
    @Path("/operacion/JSON")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response agregarOperacion(Operacion opera) {
        operacion.addOperacion(opera);
        return Response.status(Response.Status.CREATED).entity(operacion).build();
    }

//    @PUT
//    @Path("/{index}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response actualizarOperacion(@PathParam("index") int index, Operacion operacionActualizada) {
//        if (index >= 0 && index < operaciones.size()) {
//            operaciones.set(index, operacionActualizada);
//            return Response.ok(operacionActualizada).build();
//        }
//        return Response.status(Response.Status.NOT_FOUND).build();
//    }
//
//    @DELETE
//    @Path("/{index}")
//    public Response eliminarOperacion(@PathParam("index") int index) {
//        if (index >= 0 && index < operaciones.size()) {
//            operaciones.remove(index);
//            return Response.noContent().build();
//        }
//        return Response.status(Response.Status.NOT_FOUND).build();
//    }
}
    
    

