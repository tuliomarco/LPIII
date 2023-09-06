import java.util.Scanner;

public class Multimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];
        double sum = (double) 0, vSum = (double) 0, average, variance;

        for (int i = 0; i < values.length; i++) {
            System.out.printf("Digite a %dª medição de temperatura: ", i + 1);
            values[i] = scanner.nextDouble();
            sum += values[i];
        }

        average = sum / values.length;

        System.out.printf("\nTEMPERATURAS:\n");
        for (int i = 0; i < values.length; i++) {
            double v = values[i] < average ? average - values[i] : values[i] - average;
            vSum += v * v;

            System.out.print(values[i] +  "\t");
        }

        variance = vSum / values.length;
        System.out.printf("\nVALOR MÉDIO: %.2f\n", average);
        System.out.printf("DESVIO PADRÃO: %.2f\n", Math.sqrt(variance));
        System.out.print("ESTADO DO MULTÍMETRO: " + (Math.sqrt(variance) > 0.1 * average ? "Com problemas" : "Funcionando!"));

        scanner.close();
    }
}
