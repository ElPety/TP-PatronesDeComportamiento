package org.example.app.Memento;

import java.util.HashMap;
import java.util.Map;

public class Examen {
    private final Map<Integer, String> respuestas = new HashMap<>();

    public void setRespuesta(int pregunta, String resp) {
        respuestas.put(pregunta, resp);
    }

    public String getRespuesta(int pregunta) { return respuestas.get(pregunta); }

    public Memento save() {
        return new Memento(new HashMap<>(respuestas));
    }

    public void restore(Memento m) {
        respuestas.clear();
        respuestas.putAll(m.getState());
    }

    @Override
    public String toString() { return "Respuestas=" + respuestas; }
}