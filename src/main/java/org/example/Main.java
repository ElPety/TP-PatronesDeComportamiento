package org.example;

import org.example.app.ChainofResponsibility.*;
import org.example.app.Command.*;
import org.example.app.Iterator.*;
import org.example.app.Mediator.*;
import org.example.app.Memento.*;
import org.example.app.Observer.*;
import org.example.app.State.*;
import org.example.app.Strategy.*;
import org.example.app.TemplateMethod.*;
import org.example.app.Visitor.*;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== DEMOS PATRONES - Plataforma de Aprendizaje ===\n");

        // 1. Chain of Responsibility (Solicitudes de tutoría)
        System.out.println("-- Chain of Responsibility --");
        Handler asistente = new Asistente();
        Handler profesor = new Profesor();
        Handler coordinador = new Coordinador();
        asistente.setNext(profesor);
        profesor.setNext(coordinador);

        Solicitud s1 = new Solicitud("Consulta sobre tarea", 1); // nivel 1 -> asistente
        Solicitud s2 = new Solicitud("Cambio de programa", 2); // profesor
        Solicitud s3 = new Solicitud("Conflicto académico grave", 3); // coordinador

        asistente.handle(s1);
        asistente.handle(s2);
        asistente.handle(s3);

        // 2. Command (acciones del alumno)
        System.out.println("\n-- Command --");
        AlumnoCommandReceiver receiver = new AlumnoCommandReceiver();
        Command inscribirse = new InscribirseCursoCommand(receiver, "Programación I");
        Command abandonar = new AbandonarCursoCommand(receiver, "Programación I");
        Command solicitarCert = new SolicitarCertificadoCommand(receiver, "Programación I");

        Invoker invoker = new Invoker();
        invoker.execute(inscribirse);
        invoker.execute(solicitarCert);
        invoker.execute(abandonar);

        // 3. Iterator (recorrer cursos de un alumno)
        System.out.println("\n-- Iterator --");
        Curso c1 = new Curso("Programación I");
        Curso c2 = new Curso("Álgebra");
        AlumnoIter alumno = new AlumnoIter("Ana");
        alumno.addCurso(c1);
        alumno.addCurso(c2);

        CursoIterator it = alumno.createIterator();
        while (it.hasNext()) {
            System.out.println("Curso inscrito: " + it.next().getNombre());
        }

        // 4. Mediator (chat)
        System.out.println("\n-- Mediator --");
        ChatMediator mediator = new ChatRoom();
        Usuario alum = new UsuarioAlumno("Pedro");
        Usuario prof = new UsuarioProfesor("Dr. Gómez");
        mediator.register(alum);
        mediator.register(prof);
        alum.send("Hola profesor, tengo una duda.", mediator);
        prof.send("Responde en la próxima clase.", mediator);

        // 5. Memento (guardar/recuperar progreso de examen)
        System.out.println("\n-- Memento --");
        Examen examen = new Examen();
        examen.setRespuesta(1, "A"); examen.setRespuesta(2, "C");
        Memento m = examen.save();
        examen.setRespuesta(2, "B"); // cambia
        System.out.println("Antes restore: " + examen);
        examen.restore(m);
        System.out.println("Después restore: " + examen);

        // 6. Observer (notificaciones de curso)
        System.out.println("\n-- Observer --");
        CursoObserver cursoObs = new CursoObserver("Bases de Datos");
        AlumnoObserver alumnoObs = new AlumnoObserver("Lucía");
        cursoObs.addObserver(alumnoObs);
        NotificadorCurso notificador = new NotificadorCurso(cursoObs);
        notificador.notificarCambio("Clase cancelada el 10/10");

        // 7. State (estado inscripción)
        System.out.println("\n-- State --");
        Inscripcion ins = new Inscripcion();
        ins.cambiarEstado(new EnEspera());
        ins.cambiarEstado(new Inscrito());
        ins.cambiarEstado(new Cancelado());

        // 8. Strategy (cálculo de nota)
        System.out.println("\n-- Strategy --");
        AlumnoCal alumnoCal = new AlumnoCal("Martín", Arrays.asList(6,8,10));
        alumnoCal.setEstrategia(new PromedioSimple());
        System.out.println("Promedio simple: " + alumnoCal.calcularNota());
        alumnoCal.setEstrategia(new PromedioPonderado(Arrays.asList(0.2,0.3,0.5)));
        System.out.println("Promedio ponderado: " + alumnoCal.calcularNota());
        alumnoCal.setEstrategia(new ExamenExtra(2));
        System.out.println("Examen extra: " + alumnoCal.calcularNota());

        // 9. Template Method (reportes)
        System.out.println("\n-- Template Method --");
        ReporteAcademico reporteCurso = new ReporteCurso("Desarrollo de Software");
        ReporteAcademico reporteAlumno = new ReporteAlumno("Sofía");
        reporteCurso.generarReporte();
        reporteAlumno.generarReporte();

        // 10. Visitor (aplicar beca)
        System.out.println("\n-- Visitor --");
        AlumnoRegular ar = new AlumnoRegular("Tomás", 1000);
        AlumnoBecado ab = new AlumnoBecado("María", 1000);
        AplicarBecaVisitor aplicador = new AplicarBecaVisitor(0.5); // 50% descuento para becado
        ar.aceptar(aplicador);
        ab.aceptar(aplicador);
    }
}
