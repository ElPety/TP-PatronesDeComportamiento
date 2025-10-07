package org.example.app.Visitor;


public interface Visitor {
    void visitar(AlumnoRegular a);
    void visitar(AlumnoBecado a);
}