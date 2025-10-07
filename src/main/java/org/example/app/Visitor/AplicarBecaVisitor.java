package org.example.app.Visitor;

public class AplicarBecaVisitor implements Visitor {
    private final double factorBeca; // ej. 0.5 reduce 50% a becados
    public AplicarBecaVisitor(double factorBeca) { this.factorBeca = factorBeca; }

    @Override
    public void visitar(AlumnoRegular a) {
        System.out.println("Alumno regular: " + a.getNombre() + " - cuota sin cambio: " + a.getCuota());
    }

    @Override
    public void visitar(AlumnoBecado a) {
        double nueva = a.getCuota() * factorBeca;
        System.out.println("Alumno becado: " + a.getNombre() + " - cuota reducida a: " + nueva);
        a.setCuota(nueva);
    }
}