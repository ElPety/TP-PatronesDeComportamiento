package org.example.app.Visitor;

public class AlumnoBecado extends Alumno {
    public AlumnoBecado(String nombre, double cuota) { super(nombre, cuota); }
    @Override
    public void aceptar(Visitor v) { v.visitar(this); }
}