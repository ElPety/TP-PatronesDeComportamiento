package org.example.app.Strategy;

import java.util.List;

public class ExamenExtra implements CalculoNota {
    private final int bonus; // puntos extra para el examen final
    public ExamenExtra(int bonus) { this.bonus = bonus; }
    @Override
    public double calcular(List<Integer> notas) {
        double base = notas.stream().mapToInt(Integer::intValue).average().orElse(0);
        return Math.min(10, base + bonus);
    }
}