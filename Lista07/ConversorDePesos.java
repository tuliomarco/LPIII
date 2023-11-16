package Lista07;

public class ConversorDePesos {

    public static double gramasParaQuilogramas(double gramas) {
        return gramas / 1000;
    }

    public static double gramasParaLibras(double gramas) {
        return gramas / 453.592;
    }

    public static double gramasParaOncas(double gramas) {
        return gramas / 28.3495;
    }

    public static double quilogramasParaGramas(double quilogramas) {
        return quilogramas * 1000;
    }

    public static double quilogramasParaLibras(double quilogramas) {
        return quilogramas * 2.20462;
    }

    public static double quilogramasParaOncas(double quilogramas) {
        return quilogramas * 35.274;
    }

    public static double librasParaGramas(double libras) {
        return libras * 453.592;
    }

    public static double librasParaQuilogramas(double libras) {
        return libras / 2.20462;
    }

    public static double librasParaOncas(double libras) {
        return libras * 16;
    }

    public static double oncasParaGramas(double oncas) {
        return oncas * 28.3495;
    }

    public static double oncasParaQuilogramas(double oncas) {
        return oncas / 35.274;
    }

    public static double oncasParaLibras(double oncas) {
        return oncas / 16;
    }

    public static void main(String[] args) {
        double pesoEmGramas = 1000;

        double pesoEmQuilogramas = gramasParaQuilogramas(pesoEmGramas);
        double pesoEmLibras = gramasParaLibras(pesoEmGramas);
        double pesoEmOncas = gramasParaOncas(pesoEmGramas);

        System.out.println(pesoEmGramas + " gramas equivalem a:");
        System.out.println(pesoEmQuilogramas + " quilogramas.");
        System.out.println(pesoEmLibras + " libras.");
        System.out.println(pesoEmOncas + " onças.");

        double pesoEmQuilogramas2 = 2;
        double pesoEmGramas2 = quilogramasParaGramas(pesoEmQuilogramas2);
        double pesoEmLibras2 = quilogramasParaLibras(pesoEmQuilogramas2);
        double pesoEmOncas2 = quilogramasParaOncas(pesoEmQuilogramas2);

        System.out.println(pesoEmQuilogramas2 + " quilogramas equivalem a:");
        System.out.println(pesoEmGramas2 + " gramas.");
        System.out.println(pesoEmLibras2 + " libras.");
        System.out.println(pesoEmOncas2 + " onças.");
    }
}
