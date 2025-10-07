package org.example.app.Visitor;

public class AlumnoRegular extends Alumno {
    public AlumnoRegular(String nombre, double cuota) { super(nombre, cuota); }
    @Override
    public void aceptar(Visitor v) { v.visitar(this); }
}