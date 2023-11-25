package Lista10.Questao04;

import Lista07.Data;

public class ContatoPessoaFisica extends Contato {
    private String cpf;
    private Data dataAniversario;

    public ContatoPessoaFisica(String nome, String endereco, String telefone, String email, String cpf, Data dataAniversario) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.dataAniversario = dataAniversario;
    }

    public String getCpf() {
        return cpf;
    }

    public Data getDataAniversario() {
        return dataAniversario;
    }

    @Override
    public String getIdentificador() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCPF: " + cpf +
               "\nData de Aniversário: " + Data.dayToPrintShort(dataAniversario);
    }
}

