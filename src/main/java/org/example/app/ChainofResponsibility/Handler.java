package org.example.app.ChainofResponsibility;

public interface Handler {
    void setNext(Handler next);
    void handle(Solicitud s);
}
