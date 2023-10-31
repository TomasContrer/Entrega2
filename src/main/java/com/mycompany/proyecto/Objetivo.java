/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import java.util.Date;

/**
 *
 * @author Judi
 */

public class Objetivo {
    private Date fechaInicio;
    private Date fechaFinalizado;
    private Persona coordinador;
    private Casa casaObjetivo;
    private Persona[] voluntariosAsignados;

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizado() {
        return fechaFinalizado;
    }

    public void setFechaFinalizado(Date fechaFinalizado) {
        this.fechaFinalizado = fechaFinalizado;
    }

    public Persona getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Persona coordinador) {
        this.coordinador = coordinador;
    }

    public Casa getCasaObjetivo() {
        return casaObjetivo;
    }

    public void setCasaObjetivo(Casa casaObjetivo) {
        this.casaObjetivo = casaObjetivo;
    }

    public Persona[] getVoluntariosAsignados() {
        return voluntariosAsignados;
    }

    public void setVoluntariosAsignados(Persona[] voluntariosAsignados) {
        this.voluntariosAsignados = voluntariosAsignados;
    }
    
    

}
