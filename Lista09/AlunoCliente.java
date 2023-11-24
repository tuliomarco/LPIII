package Lista09;

import java.time.LocalDate;
import java.time.Month;

public class AlunoCliente {
        public static void main(String[] args) {
        LocalDate dataAdmissao = LocalDate.of(2022, Month.JANUARY, 1);

        Aluno alunoGraduacao = new Aluno("João", "123", dataAdmissao, 6, "Engenharias");
        System.out.println("Aluno de Graduação:");
        alunoGraduacao.imprimirDados();
        System.out.println();

        AlunoMestrado alunoMestrado = new AlunoMestrado("Maria", "456", dataAdmissao,
                12, "Computação", "Dr. Silva", "Projeto XYZ");
        System.out.println("Aluno de Mestrado:");
        alunoMestrado.imprimirDados();
        System.out.println();

        AlunoDoutorado alunoDoutorado = new AlunoDoutorado("Carlos", "789", dataAdmissao,
                24, "Letras", "Dra. Souza", "Projeto ABC");
        System.out.println("Aluno de Doutorado:");
        alunoDoutorado.imprimirDados();
    }
}
