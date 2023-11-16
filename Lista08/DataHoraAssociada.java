package Lista08;

import Lista07.Data;
import Lista07.Time;

public class DataHoraAssociada {
    private Data data;
    private Time hora;

    public DataHoraAssociada(Data data, Time hora) {
        this.data = data;
        this.hora = hora;
    }

    public String toString() {
        return data.toString() + " " + hora.toString();
    }

    public boolean isEqual(DataHoraAssociada outroObjeto) {
        return this.data.howManyDays(outroObjeto.data) == 0 && this.hora.cron(outroObjeto.hora) == 0;
    }

    public boolean isGreather(DataHoraAssociada outroObjeto) {
        if (this.data.howManyDays(outroObjeto.data) == 0) {
            return this.hora.cron(outroObjeto.hora) > 0;
        } else {
            return this.data.howManyDays(outroObjeto.data) > 0;
        }
    }

    public boolean isLower(DataHoraAssociada outroObjeto) {
        if (this.data.howManyDays(outroObjeto.data) == 0) {
            return this.hora.cron(outroObjeto.hora) < 0;
        } else {
            return this.data.howManyDays(outroObjeto.data) < 0;
        }
    }

    public static void main(String[] args) {
        Data data1 = new Data(1, 1, 2023);
        Time hora1 = new Time(12, 30, 0);
        DataHoraAssociada dh1 = new DataHoraAssociada(data1, hora1);

        Data data2 = new Data(1, 1, 2023);
        Time hora2 = new Time(15, 45, 0);
        DataHoraAssociada dh2 = new DataHoraAssociada(data2, hora2);

        // Testando os métodos
        System.out.println("DataHora 1: " + dh1.toString());
        System.out.println("DataHora 2: " + dh2.toString());

        System.out.println("São iguais? " + dh1.isEqual(dh2));
        System.out.println("DataHora 1 é maior? " + dh1.isGreather(dh2));
        System.out.println("DataHora 1 é menor? " + dh1.isLower(dh2));
    }
}
