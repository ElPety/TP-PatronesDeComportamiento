package org.example.app.State;

public class Inscrito implements EstadoInscripcion {
    @Override
    public void cambiarEstado(Inscripcion ins) {
        // lógica si hace falta
    }
    @Override
    public String getNombre() { return "Inscrito"; }
}
