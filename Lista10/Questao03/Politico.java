package Lista10.Questao03;

import java.util.Date;

import Lista10.Questao02.Pessoa;

public class Politico extends Pessoa {
    private String siglaPartido;
    private int numeroPartido;

    public Politico(String nome, long id, Date nascimento, String siglaPartido, int numeroPartido) {
        super(nome, id, nascimento);
        this.siglaPartido = siglaPartido;
        this.numeroPartido = numeroPartido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSigla do Partido: " + siglaPartido + "\nNúmero do Partido: " + numeroPartido;
    }
}
