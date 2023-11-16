package Lista08;

import Lista07.Data;
import Lista07.Time;

public class DataHora {
    private Data data;
    private Time hora;

    public DataHora(Data data, Time hora) {
        this.data = data;
        this.hora = hora;
    }

    public String toString() {
        return data.toString() + " " + hora.toString();
    }

    public boolean isEqual(DataHora outroObjeto) {
        return this.data.howManyDays(outroObjeto.data) == 0 && this.hora.cron(outroObjeto.hora) == 0;
    }

    public boolean isGreather(DataHora outroObjeto) {
        if (this.data.howManyDays(outroObjeto.data) == 0) {
            return this.hora.cron(outroObjeto.hora) > 0;
        } else {
            return this.data.howManyDays(outroObjeto.data) > 0;
        }
    }

    public boolean isLower(DataHora outroObjeto) {
        if (this.data.howManyDays(outroObjeto.data) == 0) {
            return this.hora.cron(outroObjeto.hora) < 0;
        } else {
            return this.data.howManyDays(outroObjeto.data) < 0;
        }
    }
}