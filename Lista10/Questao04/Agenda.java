package Lista10.Questao04;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
            System.out.println("---------------");
        }
    }

    public Contato buscarContatoPorIdentificador(String identificador) {
        for (Contato contato : contatos) {
            if (identificador.equals(contato.getIdentificador())) {
                return contato;
            }
        }
        return null;
    }
}

