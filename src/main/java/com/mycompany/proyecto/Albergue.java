/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Judi
 */

// 
public class Albergue {
    private Persona[]familias;
    private int capacidad;
    private double telefono;
    private Persona[] voluntarios;
    private Persona coordinador;
    private String direccion;

    public Persona[] getFamilias() {
        return familias;
    }

    public void setFamilias(Persona[] familias) {
        this.familias = familias;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public Persona[] getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(Persona[] voluntarios) {
        this.voluntarios = voluntarios;
    }

    public Persona getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Persona coordinador) {
        this.coordinador = coordinador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
