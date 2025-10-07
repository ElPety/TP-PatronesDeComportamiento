package org.example.app.TemplateMethod;

public class ReporteCurso extends ReporteAcademico {
    private final String curso;
    public ReporteCurso(String curso) { this.curso = curso; }
    @Override
    protected void contenido() {
        System.out.println("Contenido del reporte para el curso: " + curso);
        // detalles específicos del curso
    }
}