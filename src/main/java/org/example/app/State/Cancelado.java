package org.example.app.State;

public class Cancelado implements EstadoInscripcion {
    @Override
    public void cambiarEstado(Inscripcion ins) {
        // lógica si hace falta
    }
    @Override
    public String getNombre() { return "Cancelado"; }
}