/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class ModeloJugador {
    
    private int dorsal;
    private String nombre;
    private double puntos;
    private double rebotes;
    private double asistencias;

    public ModeloJugador() {
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public double getRebotes() {
        return rebotes;
    }

    public void setRebotes(double rebotes) {
        this.rebotes = rebotes;
    }

    public double getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(double asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "Jugador{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", puntos=" + puntos + ", rebotes=" + rebotes + ", asistencias=" + asistencias + '}';
    }
    
    
}
