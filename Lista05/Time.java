package Lista05;

public class Time {
    private int horas;
    private int minutos;
    private int segundos;

    public Time(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public boolean isAm() {
        return horas < 12;
    }

    public int cron(Time outraHora) {
        int thisSegundos = horas * 3600 + minutos * 60 + segundos;
        int outraHoraSegundos = outraHora.horas * 3600 + outraHora.minutos * 60 + outraHora.segundos;

        if (outraHoraSegundos < thisSegundos) {
            outraHoraSegundos += 24 * 3600;
        }

        return outraHoraSegundos - thisSegundos;
    }

    public void adicionarSegundos(int segundos) {
        int totalSegundos = horas * 3600 + minutos * 60 + this.segundos + segundos;
        horas = totalSegundos / 3600 % 24;
        totalSegundos %= 3600;
        minutos = totalSegundos / 60;
        this.segundos = totalSegundos % 60;
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

    public static void main(String[] args) {
        Time horaAtual = new Time(10, 30, 15);

        System.out.println("É AM? " + horaAtual.isAm());

        Time outraHora = new Time(14, 45, 30);
        int segundosPassados = horaAtual.cron(outraHora);
        System.out.println("Segundos passados: " + segundosPassados);

        horaAtual.adicionarSegundos(500);
        System.out.println("Nova hora: " + horaAtual.getHoras() + ":" + horaAtual.getMinutos() + ":" + horaAtual.getSegundos());
    }
}
