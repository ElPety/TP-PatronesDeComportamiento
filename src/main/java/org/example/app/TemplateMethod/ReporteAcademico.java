package org.example.app.TemplateMethod;

public abstract class ReporteAcademico {
    public final void generarReporte() {
        encabezado();
        contenido();
        pie();
    }
    protected void encabezado() {
        System.out.println("=== Encabezado del reporte ===");
    }
    protected abstract void contenido();
    protected void pie() {
        System.out.println("=== Pie del reporte ===\n");
    }
}