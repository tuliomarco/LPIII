package Lista03;

public class Data {

  int dia, mes, ano;

  Data(int d, int m, int a) {
    if (dataValida(d, m, a)) {
      dia = d;
      mes = m;
      ano = a;
    } else {
      dia = 0;
      mes = 0;
      ano = 0;
    }
  }

  public boolean dataValida(int d, int m, int a) {
    if (m < 1 || m > 12) {
        System.out.println("Mês inválido. O mês deve estar entre 1 e 12.");
        return false;
    }
    if (m == 2) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) { 
            if (d < 1 || d > 29) {
                System.out.println("Dia inválido para fevereiro em ano bissexto. O dia deve estar entre 1 e 29.");
                return false;
            }
        } else {
            if (d < 1 || d > 28) {
                System.out.println("Dia inválido para fevereiro. O dia deve estar entre 1 e 28.");
                return false;
            }
        }
    } else if (m == 4 || m == 6 || m == 9 || m == 11) { 
        if (d < 1 || d > 30) {
            System.out.println("Dia inválido para o mês. O dia deve estar entre 1 e 30.");
            return false;
        }
    } else { 
        if (d < 1 || d > 31) {
            System.out.println("Dia inválido para o mês. O dia deve estar entre 1 e 31.");
            return false;
        }
    }
    return true;
}

  public void mostraData() {
    String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);
    System.out.println(dataFormatada);
  }

  public String diaDaSemana() {
    int a = ano;
    int m = mes;
    if (m < 3) {
        m += 12;
        a--;
    }
    int K = a % 100;
    int J = a / 100;

    int h = (dia + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - (2 * J)) % 7;

    String[] diasDaSemana = {"Sábado", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};

    return diasDaSemana[h];
}
  public static void main(String args[]) {
    Data data = new Data(4, 10, 2023);
    data.mostraData();
    System.out.println("Dia da semana: " + data.diaDaSemana());
  }
}
