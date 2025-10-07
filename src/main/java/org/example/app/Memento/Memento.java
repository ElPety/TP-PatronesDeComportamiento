package org.example.app.Memento;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Memento {
    private final Map<Integer, String> state;
    public Memento(Map<Integer, String> state) { this.state = new HashMap<>(state); }
    public Map<Integer, String> getState() { return Collections.unmodifiableMap(state); }
}