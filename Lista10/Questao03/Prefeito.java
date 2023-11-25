package Lista10.Questao03;

import java.util.Date;

public class Prefeito extends Politico {
    private String cidadeGovernada;

    public Prefeito(String nome, long id, Date nascimento, String siglaPartido, int numeroPartido, String cidadeGovernada) {
        super(nome, id, nascimento, siglaPartido, numeroPartido);
        this.cidadeGovernada = cidadeGovernada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Prefeito" + "\nCidade Governada: " + cidadeGovernada;
    }
}
