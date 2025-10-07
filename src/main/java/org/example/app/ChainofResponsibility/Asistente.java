package org.example.app.ChainofResponsibility;

public class Asistente implements Handler {
    private Handler next;
    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Solicitud s) {
        if (s.getNivel() == 1) {
            System.out.println("Asistente resuelve: " + s.getDescripcion());
        } else if (next != null) {
            next.handle(s);
        }
    }
}
