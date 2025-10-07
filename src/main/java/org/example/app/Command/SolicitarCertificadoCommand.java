package org.example.app.Command;


public class SolicitarCertificadoCommand implements Command {
    private final AlumnoCommandReceiver receiver;
    private final String curso;
    public SolicitarCertificadoCommand(AlumnoCommandReceiver r, String curso) {
        this.receiver = r; this.curso = curso;
    }
    @Override
    public void execute() { receiver.solicitarCertificado(curso); }
}
