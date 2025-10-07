package org.example.app.Strategy;

import java.util.List;

public class AlumnoCal {
    private final String nombre;
    private final List<Integer> notas;
    private CalculoNota estrategia;
    public AlumnoCal(String nombre, List<Integer> notas) {
        this.nombre = nombre; this.notas = notas;
    }
    public void setEstrategia(CalculoNota estrategia) { this.estrategia = estrategia; }
    public double calcularNota() {
        if (estrategia == null) throw new IllegalStateException("Estrategia no configurada");
        return estrategia.calcular(notas);
    }
}