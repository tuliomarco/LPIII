package Lista09;

public class Ponto3DCliente {
    public static void main(String[] args) {
        Ponto3DComposicao ponto3DComp = new Ponto3DComposicao(1, 2, 3);
        System.out.println("Composição - Ponto3D: " + ponto3DComp);
        System.out.println("Está na origem? " + ponto3DComp.isOrigin());
        System.out.println("Distância até (4, 5, 6): " + ponto3DComp.distance(4, 5, 6));

        Ponto2D ponto2DAgreg = new Ponto2D(4, 5);
        Ponto3DAgregacao ponto3DAgreg = new Ponto3DAgregacao(ponto2DAgreg, 6);
        System.out.println("\nAgregação - Ponto3D: " + ponto3DAgreg);
        System.out.println("Está na origem? " + ponto3DAgreg.isOrigin());
        System.out.println("Distância até (7, 8, 9): " + ponto3DAgreg.distance(7, 8, 9));

        Ponto3DHeranca ponto3DHeranca = new Ponto3DHeranca(7, 8, 9);
        System.out.println("\nHerança - Ponto3D: " + ponto3DHeranca);
        System.out.println("Está na origem? " + ponto3DHeranca.isOrigin());
        System.out.println("Distância até (1, 2, 3): " + ponto3DHeranca.distance(1, 2, 3));
    }
}