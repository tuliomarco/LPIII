package Lista09;

public class Cone extends FiguraTridimensional {
    public Cone(double raio, double altura) {
        super(raio, altura);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Cone:");
        super.imprimirDados();
    }

    @Override
    public double calcularVolume() {
        return (1.0 / 3.0) * Math.PI * raio * raio * altura;
    }

    @Override
    public double calcularAreaSuperficial() {
        double lado = Math.sqrt(raio * raio + altura * altura);
        return Math.PI * raio * (raio + lado);
    }
}
