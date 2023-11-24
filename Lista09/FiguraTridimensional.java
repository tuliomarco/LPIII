package Lista09;

public class FiguraTridimensional {
    protected double raio;
    protected double altura;

    public FiguraTridimensional(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public void imprimirDados() {
        System.out.println("Raio: " + raio);
        System.out.println("Altura: " + altura);
    }

    public double calcularVolume() {
        return 0.0;
    }

    public double calcularAreaSuperficial() {
        return 0.0;
    }
}
