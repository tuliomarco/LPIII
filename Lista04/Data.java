package Lista04;

public class Data { 
    private int dia, mes, ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }

    public void inicializarData(int dia, int mes, int ano) {
        if (verificarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. A data não foi alterada.");
        }
    }

    public boolean verificarData(int dia, int mes, int ano) {
        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return dia >= 1 && dia <= 29;
                } else {
                    return dia >= 1 && dia <= 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return dia >= 1 && dia <= 30;
            } else {
                return dia >= 1 && dia <= 31;
            }
        }
        return false;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        if (verificarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido. O dia não foi alterado.");
        }
    }

    public void setMes(int mes) {
        if (verificarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. O mês não foi alterado.");
        }
    }

    public void setAno(int ano) {
        if (verificarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. O ano não foi alterado.");
        }
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }

    public void imprimirDataExtenso() {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        System.out.printf("%02d de %s de %04d%n", dia, meses[mes - 1], ano);
    }

    public static void main(String[] args) {
        Data data = new Data();
        data.inicializarData(16, 10, 2022);
        System.out.print("Data no formato dd/mm/yyyy: ");
        data.imprimirData();
        System.out.print("Data no formato por extenso: ");
        data.imprimirDataExtenso();
    }
}
