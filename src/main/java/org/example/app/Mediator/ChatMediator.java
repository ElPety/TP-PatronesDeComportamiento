package org.example.app.Mediator;

public interface ChatMediator {
    void register(Usuario u);
    void enviar(String msg, Usuario origen);
}
