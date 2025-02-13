/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduardo.dao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

/**
 *
 * @author Eduardo
 */
@XmlRootElement
@ApplicationScoped
public class ObjetoCompartido {
    HashMap<String, Integer> votos;

    public ObjetoCompartido() {
        votos = new HashMap();
    }
    
    public synchronized String addVoto(String nombre){
        if (this.votos.containsKey(nombre)) {
            this.votos.put(nombre, this.votos.get(nombre) + 1);
            return nombre + " " + this.votos.get(nombre);
        }else{
            this.votos.put(nombre, 1);
            return nombre + " " + this.votos.get(nombre);
        }
        
    }
    
    public synchronized HashMap<String, Integer> verVotos(){
        return this.votos;
    }
    
    
}
