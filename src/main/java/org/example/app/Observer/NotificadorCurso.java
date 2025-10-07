package org.example.app.Observer;

public class NotificadorCurso {
    private final CursoObserver cursoObserver;

    public NotificadorCurso(CursoObserver cursoObserver) {
        this.cursoObserver = cursoObserver;
    }

    public void notificarCambio(String mensaje) {
        cursoObserver.notifyObservers(mensaje);
    }
}