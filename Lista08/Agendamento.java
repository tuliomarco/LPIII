package Lista08;

import Lista07.Contato;
import Lista07.Data;
import Lista07.Time;

public class Agendamento {
    private Data data;
    private Time horario;
    private Contato contato;

    public Agendamento(Data data, Time horario, Contato contato) {
        this.data = data;
        this.horario = horario;
        this.contato = contato;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void imprimirAgendamento() {
        System.out.println("Data: " + Data.dayToPrintShort(data));
        System.out.println("Horário: " + horario.getHoras() + ":" + horario.getMinutos() + ":" + horario.getSegundos());
        System.out.println("Contato: " + contato.getNome());
    }

    public static void main(String[] args) {
        // Criando instâncias das classes necessárias
        Data dataAgendamento = new Data(25, 11, 2023);
        Time horarioAgendamento = new Time(14, 30, 0);
        Contato contatoAgendamento = new Contato("Maria", "maria@email.com", "(11) 98765-4321", "05/03/1995");

        // Criando o agendamento
        Agendamento agendamento = new Agendamento(dataAgendamento, horarioAgendamento, contatoAgendamento);

        // Imprimindo o agendamento
        agendamento.imprimirAgendamento();
    }
}
