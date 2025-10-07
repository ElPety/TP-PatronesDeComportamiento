package org.example.app.State;

public class Inscripcion {
    private EstadoInscripcion estado;
    public Inscripcion() { this.estado = null; }
    public void cambiarEstado(EstadoInscripcion nuevo) {
        this.estado = nuevo;
        System.out.println("Estado cambiado a: " + nuevo.getNombre());
        nuevo.cambiarEstado(this);
    }
    public EstadoInscripcion getEstado() { return estado; }
}