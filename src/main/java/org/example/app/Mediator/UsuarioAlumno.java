package org.example.app.Mediator;


public class UsuarioAlumno extends Usuario {
    public UsuarioAlumno(String nombre) { super(nombre); }
    @Override
    public void receive(String msg) { System.out.println(getNombre() + " recibió: " + msg); }
}
