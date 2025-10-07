package org.example.app.Strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota {
    private final List<Double> pesos;
    public PromedioPonderado(List<Double> pesos) { this.pesos = pesos; }
    @Override
    public double calcular(List<Integer> notas) {
        double total = 0;
        for (int i = 0; i < notas.size(); i++) {
            double peso = (i < pesos.size()) ? pesos.get(i) : 0;
            total += notas.get(i) * peso;
        }
        return total;
    }
}