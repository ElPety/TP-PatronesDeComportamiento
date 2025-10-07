package org.example.app.Iterator;

import java.util.ArrayList;
import java.util.List;

public class AlumnoIter {
    private final String nombre;
    private final List<Curso> cursos = new ArrayList<>();
    public AlumnoIter(String nombre) { this.nombre = nombre; }
    public void addCurso(Curso c) { cursos.add(c); }
    public CursoIterator createIterator() {
        return new CursoIterator() {
            private int index = 0;
            @Override
            public boolean hasNext() { return index < cursos.size(); }
            @Override
            public Curso next() { return cursos.get(index++); }
        };
    }
}
