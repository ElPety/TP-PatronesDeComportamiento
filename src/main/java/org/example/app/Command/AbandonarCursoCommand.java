package org.example.app.Command;

public class AbandonarCursoCommand implements Command {
    private final AlumnoCommandReceiver receiver;
    private final String curso;
    public AbandonarCursoCommand(AlumnoCommandReceiver r, String curso) {
        this.receiver = r; this.curso = curso;
    }
    @Override
    public void execute() { receiver.abandonar(curso); }
}
