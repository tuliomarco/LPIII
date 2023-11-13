package Lista06;

public class Ponto2D {
    private final double x, y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void imprimirPonto() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public boolean isEixoX() {
        return y == 0;
    }

    public boolean isEixoY() {
        return x == 0;
    }

    public boolean isEixos() {
        return x == 0 && y == 0;
    }

    public int quadrante() {
        if (isEixos()) {
            return 0;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public float distance(Ponto2D outroPonto) {
        double deltaX = outroPonto.getX() - x;
        double deltaY = outroPonto.getY() - y;
        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public float distance() {
        return distance(new Ponto2D());
    }

    public float distance(float x, float y) {
        return distance(new Ponto2D(x, y));
    }

    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(3, 4);
        Ponto2D ponto2 = new Ponto2D(-2, 5);

        ponto1.imprimirPonto();
        ponto2.imprimirPonto();

        System.out.println("Está no eixo X? = " + ponto1.isEixoX());
        System.out.println("Está no eixo Y? = " + ponto2.isEixoY());
        System.out.println("Está nos eixos? = " + ponto1.isEixos());

        System.out.println("Quadrante do ponto 1: " + ponto1.quadrante());
        System.out.println("Quadrante do ponto 2: " + ponto2.quadrante());

        System.out.println("Distância entre os pontos: " + ponto1.distance(ponto2));
    }
}
