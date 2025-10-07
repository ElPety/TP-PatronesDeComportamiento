package org.example.app.ChainofResponsibility;

public class Profesor implements Handler {
    private Handler next;
    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Solicitud s) {
        if (s.getNivel() == 2) {
            System.out.println("Profesor resuelve: " + s.getDescripcion());
        } else if (next != null) {
            next.handle(s);
        }
    }
}
