package org.example.app.Visitor;

public abstract class Alumno {
    protected String nombre;
    protected double cuota;
    public Alumno(String nombre, double cuota) { this.nombre = nombre; this.cuota = cuota; }
    public abstract void aceptar(Visitor v);
    public String getNombre() { return nombre; }
    public double getCuota() { return cuota; }
    public void setCuota(double c) { this.cuota = c; }
}