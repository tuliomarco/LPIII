package Lista10.Questao02;

import java.util.Date;

class ChefeDeDepartamento extends Funcionario {
    private String departamento;
    private Date promocaoChefe;

    public ChefeDeDepartamento(String nome, long id, Date nascimento, Date admissao, double salario,
            String departamento, Date promocaoChefe) {
        super(nome, id, nascimento, admissao, salario);
        this.departamento = departamento;
        this.promocaoChefe = promocaoChefe;
    }

    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento + "\nPromoção para Chefe: " + promocaoChefe;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public double calculaEmprestimo() {
        return 3 * qualSalario();
    }
}
