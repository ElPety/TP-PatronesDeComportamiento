package org.example.app.Mediator;

public abstract class Usuario {
    protected String nombre;
    public Usuario(String nombre) { this.nombre = nombre; }
    public abstract void receive(String msg);
    public void send(String msg, ChatMediator mediator) {
        mediator.enviar(msg, this);
    }
    public String getNombre() { return nombre; }
}
