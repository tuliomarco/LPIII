package Lista07;

import java.time.LocalTime;

public class Time {

  private int horas;
  private int minutos;
  private int segundos;

  public Time() {
    this(0);
  }

  public Time(int horas) {
    this(horas, 0);
  }

  public Time(int horas, int minutos) {
    this(horas, minutos, 0);
  }

  public Time(int horas, int minutos, int segundos) {
    this.horas = horas % 24;
    this.minutos = minutos % 60;
    this.segundos = segundos % 60;
  }

  public Time(Time outroTempo) {
    this(outroTempo.horas, outroTempo.minutos, outroTempo.segundos);
  }

  public boolean isAm() {
    return horas < 12;
  }

  public int cron(Time outraHora) {
    int thisSegundos = horas * 3600 + minutos * 60 + segundos;
    int outraHoraSegundos =
      outraHora.horas * 3600 + outraHora.minutos * 60 + outraHora.segundos;

    if (outraHoraSegundos < thisSegundos) {
      outraHoraSegundos += 24 * 3600;
    }

    return outraHoraSegundos - thisSegundos;
  }

  public void addTime(int segundos) {
    int totalSegundos =
      this.horas * 3600 + this.minutos * 60 + this.segundos + segundos;
    this.horas = totalSegundos / 3600 % 24;
    totalSegundos %= 3600;
    this.minutos = totalSegundos / 60;
    this.segundos = totalSegundos % 60;
  }

  public void addTime(int minutos, int segundos) {
    addTime(minutos * 60 + segundos);
  }

  public void addTime(int horas, int minutos, int segundos) {
    addTime(horas * 3600 + minutos * 60 + segundos);
  }

  public void addTime(Time outroTempo) {
    addTime(outroTempo.horas, outroTempo.minutos, outroTempo.segundos);
  }

  public int getHoras() {
    return horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public static Time diffTime(Time t1, Time t2) {
    int difSegundos = t1.cron(t2);
    return new Time(difSegundos / 3600, (difSegundos % 3600) / 60, difSegundos % 60);
}

public static Time diffTime(Time t) {
    LocalTime atual = LocalTime.now();
    int difSegundos = t.cron(new Time(atual.getHour(),
            atual.getMinute(), atual.getSecond()));
    return new Time(difSegundos / 3600, (difSegundos % 3600) / 60, difSegundos % 60);
}

public static boolean isAm(Time t) {
    return t.isAm();
}

public static boolean isPm(Time t) {
    return !t.isAm();
}

public static void main(String[] args) {
    Time hora = new Time(10, 30, 15);
    Time outraHora = new Time(10, 30, 15);

    Time diferenca = Time.diffTime(hora, outraHora);
    System.out.println("Diferença entre as horas: " + diferenca.getHoras() + ":" +
            diferenca.getMinutos() + ":" + diferenca.getSegundos());

    Time diferencaAtual = Time.diffTime(hora);
    System.out.println("Diferença com a hora atual: " + diferencaAtual.getHoras() + ":" +
            diferencaAtual.getMinutos() + ":" + diferencaAtual.getSegundos());

    System.out.println("É AM? " + Time.isAm(hora));
    System.out.println("É PM? " + Time.isPm(hora));
}
}
