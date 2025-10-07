package org.example.app.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<Usuario> usuarios = new ArrayList<>();
    @Override
    public void register(Usuario u) { usuarios.add(u); }
    @Override
    public void enviar(String msg, Usuario origen) {
        for (Usuario u : usuarios) {
            if (u != origen) u.receive("De " + origen.getNombre() + ": " + msg);
        }
    }
}