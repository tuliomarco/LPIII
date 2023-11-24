package Lista09;

public class Cilindro extends FiguraTridimensional {
    public Cilindro(double raio, double altura) {
        super(raio, altura);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Cilindro:");
        super.imprimirDados();
    }

    @Override
    public double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }

    @Override
    public double calcularAreaSuperficial() {
        return 2 * Math.PI * raio * (raio + altura);
    }
}

