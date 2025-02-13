/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tarde
 */
@XmlRootElement
public class Tarea {
    
    private Long id;
    private String nombre;
    private String descripcion;

    public Tarea() {
    }

    public Tarea(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
