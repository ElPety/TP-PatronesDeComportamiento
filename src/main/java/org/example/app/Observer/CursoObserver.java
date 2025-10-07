package org.example.app.Observer;

import java.util.ArrayList;
import java.util.List;

public class CursoObserver {
    private final String nombre;
    private final List<Observer> observers = new ArrayList<>();

    public CursoObserver(String nombre) { this.nombre = nombre; }
    public void addObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }
    public void notifyObservers(String msg) {
        for (Observer o : observers) o.update("[" + nombre + "] " + msg);
    }
}