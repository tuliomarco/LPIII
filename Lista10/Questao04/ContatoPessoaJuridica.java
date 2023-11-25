package Lista10.Questao04;

public class ContatoPessoaJuridica extends Contato {
    private String cnpj;
    private double faturamento;

    public ContatoPessoaJuridica(String nome, String endereco, String telefone, String email, String cnpj, double faturamento) {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getFaturamento() {
        return faturamento;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCNPJ: " + cnpj +
               "\nFaturamento: " + faturamento;
    }
}
