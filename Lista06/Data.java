package Lista06;

public class Data {
    private int dia, mes, ano;

    public Data() {
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        if (verificarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. A data não foi alterada.");
        }
    }

    public Data(Data outraData) {
        this(outraData.getDia(), outraData.getMes(), outraData.getAno());
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

    public boolean isPrevious(Data outraData) {
        if (ano < outraData.ano) return true;
        if (ano == outraData.ano) {
            if (mes < outraData.mes) return true;
            if (mes == outraData.mes) {
                return dia < outraData.dia;
            }
        }
        return false;
    }
    
    public String dayOfWeek() {
        int q = dia;
        int m = (mes - 3 + 12 * ((mes - 3) / 10)) + 1;
        int K = ano % 100;
        int J = ano / 100;
    
        int h = (q + 13 * (m + 1) / 5 + K + K / 4 + J / 4 - 2 * J) % 7;
    
        String[] daysOfWeek = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" };
    
        return daysOfWeek[h];
    }

    public int howManyDays(Data outraData) {
        int thisDay = ano * 365 + mes * 30 + dia;
        int otherDay = outraData.getAno() * 365 + outraData.getMes() * 30 + outraData.getDia();

        return otherDay - thisDay;
    }

    public int howManyDays(int day, int month, int year) {
        Data outraData = new Data(day, month, year);
        return howManyDays(outraData);
    }

    public void setData(int dia, int mes, int ano) {
        if (verificarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. A data não foi alterada.");
        }
    }

    public void setData(Data outraData) {
        this.dia = outraData.getDia();
        this.mes = outraData.getMes();
        this.ano = outraData.getAno();
    }

    public static void main(String[] args) {
        Data currentDate = new Data(25, 10, 2023);

        Data anotherDate = new Data(20, 10, 2023);
        System.out.println("É anterior? " + currentDate.isPrevious(anotherDate));

        Data futureDate = new Data(30, 10, 2023);
        int daysPassed = currentDate.howManyDays(futureDate);
        System.out.println("Dias passados: " + daysPassed);

        System.out.println("Dia da semana: " + currentDate.dayOfWeek());
        
        Data copyDate = new Data(currentDate);
        System.out.println("Cópia da data atual: ");
        copyDate.imprimirData();
    }
}
