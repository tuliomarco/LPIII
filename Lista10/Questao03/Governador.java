package Lista10.Questao03;

import java.util.Date;

public class Governador extends Politico {
    private String estadoGovernado;

    public Governador(String nome, long id, Date nascimento, String siglaPartido, int numeroPartido, String estadoGovernado) {
        super(nome, id, nascimento, siglaPartido, numeroPartido);
        this.estadoGovernado = estadoGovernado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Governador" + "\nEstado Governado: " + estadoGovernado;
    }
}
