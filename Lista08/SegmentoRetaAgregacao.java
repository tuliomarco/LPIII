package Lista08;

import Lista07.Ponto2D;

public class SegmentoRetaAgregacao {
    private Ponto2D pontoInicial;
    private Ponto2D pontoFinal;
    private double dimensao;

    public SegmentoRetaAgregacao(Ponto2D pontoInicial, Ponto2D pontoFinal) {
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
        this.dimensao = calculaDimensao();
    }

    private double calculaDimensao() {
        return Ponto2D.distance(pontoInicial, pontoFinal);
    }

    public void imprimeSegmentoReta() {
        System.out.println("O segmento de reta inicia no ponto (" + pontoInicial.getX() +
                ", " + pontoInicial.getY() + ") e finaliza no ponto (" +
                pontoFinal.getX() + ", " + pontoFinal.getY() + ") com dimensão " +
                dimensao + ".");
    }

    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(3, 4);
        Ponto2D ponto2 = new Ponto2D(-2, 5);

        SegmentoRetaAgregacao segmento = new SegmentoRetaAgregacao(ponto1, ponto2);
        segmento.imprimeSegmentoReta();
    }
}
