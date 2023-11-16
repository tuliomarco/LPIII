package Lista07;

public class Contato {
    private String nome, email, telefone, dataNascimento;
    private static int totalContatos = 0; 

    public Contato() {
        this("", "");
    }

    public Contato(String nome, String telefone) {
        this(nome, "", telefone, "");
    }

    public Contato(String nome, String email, String telefone) {
        this(nome, email, telefone, "");
    }

    public Contato(String nome, String email, String telefone, String dataNascimento) {
        if (nome == null || nome.isEmpty() || email == null || email.isEmpty() || telefone == null || telefone.isEmpty() || dataNascimento == null || dataNascimento.isEmpty()) {
            System.out.println("Todos os campos devem ser preenchidos.");
        }

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        totalContatos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("O email não pode ser nulo ou vazio.");
        }
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            System.out.println("O telefone não pode ser nulo ou vazio.");
        }
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (dataNascimento == null || dataNascimento.isEmpty()) {
            System.out.println("A data de nascimento não pode ser nula ou vazia.");
        }
        this.dataNascimento = dataNascimento;
    }

    public static void mostrarNumeroContatos() {
        System.out.println("Número total de contatos na agenda: " + totalContatos);
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
        Contato contato1 = new Contato();
        Contato contato2 = new Contato("João", "joao@email.com", "(73) 9 8002-8922", "16/10/1990");

        System.out.println(contato1.getNome());
        System.out.println(contato2.getNome());
        
        Contato.mostrarNumeroContatos();
    }
}
