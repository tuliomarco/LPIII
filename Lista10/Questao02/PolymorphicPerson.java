package Lista10.Questao02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolymorphicPerson {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(); 
        pessoas.add(new Pessoa("João", 1, new Date())); 
        pessoas.add(new Funcionario("Maria", 2, new Date(), new Date(), 2000.00));
        pessoas.add(new ChefeDeDepartamento("Carlos", 3, new Date(), new Date(), 3000.00,
                "Recursos Humanos", new Date()));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Cálculo de empréstimo para " + pessoa.getClass().getSimpleName() + ":\n" + pessoa.calculaEmprestimo());
        }
    }
}

