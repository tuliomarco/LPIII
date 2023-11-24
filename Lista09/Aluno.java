package Lista09;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Aluno {
    protected String nome;
    protected String matricula;
    protected LocalDate dataAdmissao;
    protected int semestre;
    protected String tipoCurso;
    protected double mensalidadeBase = 700.00;

    public Aluno(String nome, String matricula, LocalDate dataAdmissao, int semestre, String tipoCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.semestre = semestre;
        this.tipoCurso = tipoCurso;
    }

    public boolean isRegular() {
        LocalDate dataAtual = LocalDate.now();
        long mesesDeDiferenca = ChronoUnit.MONTHS.between(dataAdmissao, dataAtual);
        return mesesDeDiferenca <= semestre;
    }

    public double calcularMensalidade() {
        double mensalidade = mensalidadeBase;

        if (!isRegular()) 
            mensalidade *= 1.2; 

        if ("Engenharias".equals(tipoCurso)) {
            mensalidade *= 1.2; 
        } else if ("Computação".equals(tipoCurso)) {
            mensalidade *= 1.1; 
        } else if ("Letras".equals(tipoCurso)) {
            mensalidade *= 1.05;
        }

        return mensalidade;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Semestre: " + semestre);
        System.out.println("Tipo de Curso: " + tipoCurso);
        System.out.println("Mensalidade: R$" + calcularMensalidade());
    }
}
