package com.mycompany.proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Judi
 */
public class Casa {
    private char estado;
    private Persona[] familia;
    private double telefono;
    private String direccion;
    private int numero_Casa;
    private String comuna;
    private String region;
    private boolean intervenido;

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Persona[] getFamilia() {
        return familia;
    }

    public void setFamilia(Persona[] familia) {
        this.familia = familia;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero_Casa() {
        return numero_Casa;
    }

    public void setNumero_Casa(int numero_Casa) {
        this.numero_Casa = numero_Casa;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isIntervenido() {
        return intervenido;
    }

    public void setIntervenido(boolean intervenido) {
        this.intervenido = intervenido;
    }
    
    
    
}
