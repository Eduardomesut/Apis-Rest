/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mates.dao;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
@XmlRootElement
public class HacerOperacion {
    ArrayList<Operacion> operaciones = new ArrayList<>();
    
    public synchronized Operacion suma(double num1, double num2){
        Operacion suma = new Operacion(num1, num2, num1+num2);
        this.operaciones.add(suma);
        return suma;       
    }
    public synchronized Operacion resta(double num1, double num2){
        Operacion resta = new Operacion(num1, num2, num1-num2);
        this.operaciones.add(resta);
        return resta;       
    }
    public synchronized ArrayList<Operacion> verTodas(){
        
        return this.operaciones;       
    }
    
    public synchronized ArrayList<Operacion> addOperacion(Operacion opera){
        this.operaciones.add(opera);
        return this.operaciones;       
    }
    
}
