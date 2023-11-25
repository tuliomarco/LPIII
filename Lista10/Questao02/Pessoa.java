package Lista10.Questao02;

import java.util.Date;

public class Pessoa {
    private String nome;
    private long id;
    private Date nascimento;

    public Pessoa(String nome, long id, Date nascimento) {
        this.nome = nome;
        this.id = id;
        this.nascimento = nascimento;
    }

    public String toString() {
        return "Nome: " + nome + "\nID: " + id + "\nData de Nascimento: " + nascimento;
    }

    public double calculaEmprestimo() {
        return 1000.00;
    }
}
