package Lista08;

import Lista07.Data;
import Lista07.Time;

public class DataHoraAgregada {
    private Data data;
    private Time hora;

    public DataHoraAgregada(int dia, int mes, int ano, int horas, int minutos, int segundos) {
        this.data = new Data(dia, mes, ano);
        this.hora = new Time(horas, minutos, segundos);
    }

    public String toString() {
        return data.toString() + " " + hora.toString();
    }

    public boolean isEqual(DataHoraAgregada outroObjeto) {
        return this.data.howManyDays(outroObjeto.data) == 0 && this.hora.cron(outroObjeto.hora) == 0;
    }

    public boolean isGreather(DataHoraAgregada outroObjeto) {
        if (this.data.howManyDays(outroObjeto.data) == 0) {
            return this.hora.cron(outroObjeto.hora) > 0;
        } else {
            return this.data.howManyDays(outroObjeto.data) > 0;
        }
    }

    public boolean isLower(DataHoraAgregada outroObjeto) {
        if (this.data.howManyDays(outroObjeto.data) == 0) {
            return this.hora.cron(outroObjeto.hora) < 0;
        } else {
            return this.data.howManyDays(outroObjeto.data) < 0;
        }
    }

    public static void main(String[] args) {
        DataHoraAgregada dh1 = new DataHoraAgregada(1, 1, 2023, 12, 30, 0);
        DataHoraAgregada dh2 = new DataHoraAgregada(1, 1, 2023, 15, 45, 0);

        System.out.println("DataHora 1: " + dh1.toString());
        System.out.println("DataHora 2: " + dh2.toString());

        System.out.println("São iguais? " + dh1.isEqual(dh2));
        System.out.println("DataHora 1 é maior? " + dh1.isGreather(dh2));
        System.out.println("DataHora 1 é menor? " + dh1.isLower(dh2));
    }
}
