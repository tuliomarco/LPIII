package Lista06;

public class Contato {
    private String nome, email, telefone, dataNascimento;

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
        System.out.println("Contato 1:");
        contato1.imprimirContato();
        System.out.println("Idade: " + contato1.calcularIdade() + " anos");
        System.out.println();

        Contato contato2 = new Contato("Maria", "(55) 9 1234-5678");
        System.out.println("Contato 2:");
        contato2.imprimirContato();
        System.out.println("Idade: " + contato2.calcularIdade() + " anos");
        System.out.println();

        Contato contato3 = new Contato("Carlos", "carlos@email.com", "(33) 9 8765-4321");
        System.out.println("Contato 3:");
        contato3.imprimirContato();
        System.out.println("Idade: " + contato3.calcularIdade() + " anos");
        System.out.println();

        Contato contato4 = new Contato("Ana", "ana@email.com", "(44) 9 5555-5555", "25/05/1985");
        System.out.println("Contato 4:");
        contato4.imprimirContato();
        System.out.println("Idade: " + contato4.calcularIdade() + " anos");
    }
}
