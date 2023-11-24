package Lista09;

import java.time.LocalDate;

class AlunoPosgraduacao extends Aluno {
    private String orientador;
    private String tituloProjeto;
    private char nivel;

    public AlunoPosgraduacao(String nome, String matricula, LocalDate dataAdmissao, int semestre,
                             String tipoCurso, String orientador, String tituloProjeto, char nivel) {
        super(nome, matricula, dataAdmissao, semestre, tipoCurso);
        this.orientador = orientador;
        this.tituloProjeto = tituloProjeto;
        this.nivel = nivel;
    }

    @Override
    public boolean isRegular() {
        if (nivel == 'M') {
            return super.isRegular() && semestre <= 24;
        } else if (nivel == 'D') {
            return super.isRegular() && semestre <= 48;
        }
        return false;
    }

    public String getOrientador() {
        return orientador;
    }
    public String getTituloProjeto() {
        return tituloProjeto;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Orientador: " + getOrientador());
        System.out.println("Título do Projeto: " + getTituloProjeto());
    }
}
