package Lista07;

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
    
        String[] diasDaSemana = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" };
    
        return diasDaSemana[h];
    }

    public int howManyDays(Data outraData) {
        int diaAtual = ano * 365 + mes * 30 + dia;
        int outroDia = outraData.getAno() * 365 + outraData.getMes() * 30 + outraData.getDia();

        return outroDia - diaAtual;
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

    public static int howManyDaysUntilEndYear(Data d) {
        int diasDoAno = Data.isBisexto(d) ? 366 : 365;
        int diasPassados = d.howManyDays(new Data(31, 12, d.getAno()));
        return diasDoAno - diasPassados;
    }

    public static int howManyDaysUntilNextMonth(Data d) {
        int proximoMes = (d.getMes() % 12) + 1;
        int proximoMesPrimeiro = 1;
        int proximoMesAno = (d.getMes() == 12) ? d.getAno() + 1 : d.getAno();

        Data proximoMesDate = new Data(proximoMesPrimeiro, proximoMes, proximoMesAno);
        return d.howManyDays(proximoMesDate);
    }

    public static boolean isBisexto(Data d) {
        return (d.getAno() % 4 == 0 && d.getAno() % 100 != 0) || (d.getAno() % 400 == 0);
    }

    public static String dayOfWeek(Data d) {
        int q = d.getDia();
        int m = (d.getMes() - 3 + 12 * ((d.getMes() - 3) / 10)) + 1;
        int K = d.getAno() % 100;
        int J = d.getAno() / 100;

        int h = (q + 13 * (m + 1) / 5 + K + K / 4 + J / 4 - 2 * J) % 7;

        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        return diasDaSemana[h];
    }

    public static String dayToPrintShort(Data d) {
        return String.format("%02d/%02d/%04d", d.getDia(), d.getMes(), d.getAno());
    }

    public static String dayToPrintLong(Data d) {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        return String.format("%02d de %s de %04d", d.getDia(), meses[d.getMes() - 1], d.getAno());
    }

    public static void main(String[] args) {
        Data data1 = new Data(20, 2, 2022);
        Data data2 = new Data(31, 12, 2022);
        Data data3 = new Data(1, 1, 2023);

        // Testando os métodos estáticos
        System.out.println("Dias até o final do ano de data1: " + Data.howManyDaysUntilEndYear(data1));
        System.out.println("Dias até o primeiro dia do próximo mês de data2: " + Data.howManyDaysUntilNextMonth(data2));
        System.out.println("Ano de data3 é bissexto? " + Data.isBisexto(data3));

        System.out.println("Dia da semana de data1: " + Data.dayOfWeek(data1));
        System.out.println("Representação curta de data2: " + Data.dayToPrintShort(data2));
        System.out.println("Representação longa de data3: " + Data.dayToPrintLong(data3));
    }
}
