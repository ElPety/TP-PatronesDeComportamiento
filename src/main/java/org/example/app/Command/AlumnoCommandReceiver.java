package org.example.app.Command;

public class AlumnoCommandReceiver {
    public void inscribirse(String curso) {
        System.out.println("Alumno inscrito en " + curso);
    }
    public void abandonar(String curso) {
        System.out.println("Alumno abandonó " + curso);
    }
    public void solicitarCertificado(String curso) {
        System.out.println("Certificado solicitado para " + curso);
    }
}
