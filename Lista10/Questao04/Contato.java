package Lista10.Questao04;

public class Contato {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Contato(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nEndereço: " + endereco +
               "\nTelefone: " + telefone +
               "\nEmail: " + email;
    }

    public String getIdentificador() {
        return null;
    }
}

