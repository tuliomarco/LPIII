package Lista04;

public class Contato {
    private String nome, email, telefone, dataNascimento;

    public Contato() {
        this.nome = "";
        this.email = "";
        this.telefone = "";
        this.dataNascimento = "";
    }

    public void inicializarContato(String nome, String email, String telefone, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public int calcularIdade() {
        if (dataNascimento == null || dataNascimento.isEmpty()) {
            return 0; 
        }
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int anoNascimento = Integer.parseInt(dataNascimento.substring(dataNascimento.lastIndexOf('/') + 1));
        
        return anoAtual - anoNascimento;
    }

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.inicializarContato("João", "joao@email.com", "(73) 9 8002-8922", "16/10/1990");

        contato.imprimirContato();
        System.out.println("Idade: " + contato.calcularIdade() + " anos");
    }
}
