package Lista10.Questao02;

import java.util.Date;

class Funcionario extends Pessoa {
    private Date admissao;
    private double salario;

    public Funcionario(String nome, long id, Date nascimento, Date admissao, double salario) {
        super(nome, id, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    public String toString() {
        return super.toString() + "\nAdmissão: " + admissao + "\nSalário: " + salario;
    }

    public double qualSalario() {
        return salario;
    }

    @Override
    public double calculaEmprestimo() {
        return Math.max(0.75 * salario, 1000.00);
    }
}
