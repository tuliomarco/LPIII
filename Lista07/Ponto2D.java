package Lista07;

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

    public static float distance(Ponto2D P1, Ponto2D P2) {
        double deltaX = P2.getX() - P1.getX();
        double deltaY = P2.getY() - P1.getY();
        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static float distance(Ponto2D P) {
        return distance(new Ponto2D(), P);
    }

    public static int quadrante(Ponto2D P) {
        if (P.isEixos()) {
            return 0;
        } else if (P.getX() > 0 && P.getY() > 0) {
            return 1;
        } else if (P.getX() < 0 && P.getY() > 0) {
            return 2;
        } else if (P.getX() < 0 && P.getY() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(3, 4);
        Ponto2D ponto2 = new Ponto2D(-2, 5);

        ponto1.imprimirPonto();
        ponto2.imprimirPonto();

        System.out.println("Distância entre os pontos: " + Ponto2D.distance(ponto1, ponto2));
        System.out.println("Distância do ponto 1 à origem: " + Ponto2D.distance(ponto1));
        System.out.println("Quadrante do ponto 2: " + Ponto2D.quadrante(ponto2));
    }
}
