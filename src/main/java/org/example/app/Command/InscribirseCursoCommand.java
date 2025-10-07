package org.example.app.Command;

public class InscribirseCursoCommand implements Command {
    private final AlumnoCommandReceiver receiver;
    private final String curso;
    public InscribirseCursoCommand(AlumnoCommandReceiver r, String curso) {
        this.receiver = r; this.curso = curso;
    }
    @Override
    public void execute() { receiver.inscribirse(curso); }
}
