package org.example.app.Mediator;

public class UsuarioProfesor extends Usuario {
    public UsuarioProfesor(String nombre) { super(nombre); }
    @Override
    public void receive(String msg) { System.out.println(getNombre() + " recibió: " + msg); }
}