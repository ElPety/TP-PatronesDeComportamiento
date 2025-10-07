package org.example.app.ChainofResponsibility;

public class Solicitud {
    private final String descripcion;
    private final int nivel; // 1=Asistente,2=Profesor,3=Coordinador

    public Solicitud(String descripcion, int nivel) {
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public String getDescripcion() { return descripcion; }
    public int getNivel() { return nivel; }
}
