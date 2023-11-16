package Lista08;

import Lista07.Ponto2D;

public class SegmentoRetaComposicao {
    private Ponto2D pontoInicial;
    private Ponto2D pontoFinal;
    private double dimensao;

    public SegmentoRetaComposicao(double x1, double y1, double x2, double y2) {
        this.pontoInicial = new Ponto2D(x1, y1);
        this.pontoFinal = new Ponto2D(x2, y2);
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
        SegmentoRetaComposicao segmento = new SegmentoRetaComposicao(3, 4, -2, 5);
        segmento.imprimeSegmentoReta();
    }
}
