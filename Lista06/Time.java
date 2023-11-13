package Lista06;

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
        int outraHoraSegundos = outraHora.horas * 3600 + outraHora.minutos * 60 + outraHora.segundos;

        if (outraHoraSegundos < thisSegundos) {
            outraHoraSegundos += 24 * 3600;
        }

        return outraHoraSegundos - thisSegundos;
    }

    public void addTime(int segundos) {
        int totalSegundos = this.horas * 3600 + this.minutos * 60 + this.segundos + segundos;
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
    
    public static void main(String[] args) {
        Time horaAtual = new Time(10, 30, 15);

        System.out.println("É AM? " + horaAtual.isAm());

        Time outraHora = new Time(14, 45, 30);
        int segundosPassados = horaAtual.cron(outraHora);
        System.out.println("Segundos passados: " + segundosPassados);

        horaAtual.addTime(500);
        System.out.println("Nova hora: " + horaAtual.getHoras() + ":" + horaAtual.getMinutos() + ":" + horaAtual.getSegundos());

        Time tempoSemParametros = new Time();
        System.out.println("Tempo sem parâmetros: " + tempoSemParametros.getHoras() + ":" +
                tempoSemParametros.getMinutos() + ":" + tempoSemParametros.getSegundos());

        Time tempoComHora = new Time(8);
        System.out.println("Tempo com hora: " + tempoComHora.getHoras() + ":" +
                tempoComHora.getMinutos() + ":" + tempoComHora.getSegundos());

        Time tempoComHoraMinutos = new Time(4, 30);
        System.out.println("Tempo com hora e minutos: " + tempoComHoraMinutos.getHoras() + ":" +
                tempoComHoraMinutos.getMinutos() + ":" + tempoComHoraMinutos.getSegundos());

        Time tempoComHoraMinutosSegundos = new Time(1, 15, 45);
        System.out.println("Tempo com hora, minutos e segundos: " + tempoComHoraMinutosSegundos.getHoras() + ":" +
                tempoComHoraMinutosSegundos.getMinutos() + ":" + tempoComHoraMinutosSegundos.getSegundos());

        Time tempoCopia = new Time(horaAtual);
        System.out.println("Cópia do tempo atual: " + tempoCopia.getHoras() + ":" +
                tempoCopia.getMinutos() + ":" + tempoCopia.getSegundos());
    }
}

