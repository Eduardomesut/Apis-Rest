/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mates.dao;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo
 */
@XmlRootElement
public class Operacion {
    
    private double num1;
    private double num2;
    private double resultado;

    public Operacion() {
    }

    public Operacion(double num1, double num2, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + '}';
    }
    
    
    
}
