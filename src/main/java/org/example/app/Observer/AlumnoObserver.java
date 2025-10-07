package org.example.app.Observer;

public class AlumnoObserver implements Observer {
    private final String nombre;
    public AlumnoObserver(String nombre) { this.nombre = nombre; }
    @Override
    public void update(String msg) { System.out.println(nombre + " recibió notificación: " + msg); }
}