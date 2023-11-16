package Lista08;

import Lista07.Ponto2D;

public class Triangulo {
    private Ponto2D pontoA;
    private Ponto2D pontoB;
    private Ponto2D pontoC;

    public Triangulo(Ponto2D pontoA, Ponto2D pontoB, Ponto2D pontoC) {
        if (naoEstaoAlinhados(pontoA, pontoB, pontoC)) {
            this.pontoA = pontoA;
            this.pontoB = pontoB;
            this.pontoC = pontoC;
        } else {
            throw new IllegalArgumentException("Os pontos estão alinhados. Não é possível formar um triângulo.");
        }
    }

    private boolean naoEstaoAlinhados(Ponto2D pontoA, Ponto2D pontoB, Ponto2D pontoC) {
        return (pontoA.getX() * (pontoB.getY() - pontoC.getY()) +
                pontoB.getX() * (pontoC.getY() - pontoA.getY()) +
                pontoC.getX() * (pontoA.getY() - pontoB.getY())) != 0;
    }

    public void imprimeTriangulo() {
        System.out.println("Triângulo formado pelos pontos:");
        pontoA.imprimirPonto();
        pontoB.imprimirPonto();
        pontoC.imprimirPonto();
    }

    public boolean isTrianguloRetangulo() {
        double lado1 = Ponto2D.distance(pontoA, pontoB);
        double lado2 = Ponto2D.distance(pontoA, pontoC);
        double lado3 = Ponto2D.distance(pontoB, pontoC);

        double maiorLado = Math.max(Math.max(lado1, lado2), lado3);

        if (maiorLado == lado1) {
            return Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2);
        } else if (maiorLado == lado2) {
            return Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2);
        } else {
            return Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2);
        }
    }

    public boolean isTrianguloIsosceles() {
        double lado1 = Ponto2D.distance(pontoA, pontoB);
        double lado2 = Ponto2D.distance(pontoA, pontoC);
        double lado3 = Ponto2D.distance(pontoB, pontoC);

        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    public boolean isTrianguloEquilatero() {
        double lado1 = Ponto2D.distance(pontoA, pontoB);
        double lado2 = Ponto2D.distance(pontoA, pontoC);
        double lado3 = Ponto2D.distance(pontoB, pontoC);

        return lado1 == lado2 && lado1 == lado3;
    }

    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(0, 0);
        Ponto2D ponto2 = new Ponto2D(3, 0);
        Ponto2D ponto3 = new Ponto2D(0, 4);

        Triangulo triangulo = new Triangulo(ponto1, ponto2, ponto3);

        triangulo.imprimeTriangulo();
        System.out.println("É um triângulo retângulo? " + triangulo.isTrianguloRetangulo());
        System.out.println("É um triângulo isósceles? " + triangulo.isTrianguloIsosceles());
        System.out.println("É um triângulo equilátero? " + triangulo.isTrianguloEquilatero());
    }
}
