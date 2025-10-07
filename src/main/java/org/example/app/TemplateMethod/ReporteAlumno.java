package org.example.app.TemplateMethod;

public class ReporteAlumno extends ReporteAcademico {
    private final String alumno;
    public ReporteAlumno(String alumno) { this.alumno = alumno; }
    @Override
    protected void contenido() {
        System.out.println("Contenido del reporte para el alumno: " + alumno);
        // detalles específicos del alumno
    }
}