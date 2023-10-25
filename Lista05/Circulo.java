package Lista05;

public class Circulo {
    private double x, y, raio;

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public void validaCirculo() {
        if (raio <= 0) {
            System.out.println("O raio do círculo deve ser maior que zero.");
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRaio() {
        return raio;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
        validaCirculo();
    }

    public void imprimirCirculo() {
        System.out.println("Centro: (" + x + ", " + y + ")");
        System.out.println("Raio: " + raio);
    }

    public boolean estaDentro(Ponto2D ponto) {
        double distancia = Math.sqrt(Math.pow(ponto.getX() - x, 2) + Math.pow(ponto.getY() - y, 2));
        return distancia <= raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public boolean eMaiorQue(Circulo outroCirculo) {
        return this.area() > outroCirculo.area();
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(0, 0, 5);
        Ponto2D ponto = new Ponto2D(2, 3);

        circulo.imprimirCirculo();
        ponto.imprimirPonto();

        System.out.println("O ponto está dentro do círculo? " + circulo.estaDentro(ponto));
    }
}
