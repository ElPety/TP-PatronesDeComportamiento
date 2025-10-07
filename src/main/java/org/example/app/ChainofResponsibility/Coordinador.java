package org.example.app.ChainofResponsibility;

public class Coordinador implements Handler {
    private Handler next;
    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Solicitud s) {
        if (s.getNivel() == 3) {
            System.out.println("Coordinador resuelve: " + s.getDescripcion());
        } else {
            System.out.println("Solicitud no puede ser procesada: " + s.getDescripcion());
        }
    }
}
