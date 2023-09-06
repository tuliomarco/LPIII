import java.util.Random;

public class Craps {
    public static void main(String[] args) {
        Random random = new Random();
        int d1 = random.nextInt(6) + 1, d2 = random.nextInt(6) + 1, sum = d1 + d2;

        System.out.printf("Dado 1: %d, Dado 2: %d\n", d1, d2);
        System.out.printf("Ponto: %d\n", sum);

        if (sum == 7 || sum == 11) System.out.println("Você venceu :-)");
        else if (sum == 2 || sum == 3 || sum == 12) System.out.println("Você perdeu :-(");
        else {
            System.out.println('\n');
            System.out.println("Iniciando estágio 2");

            int point = sum, round = 1;

            while (true) {
                d1 = random.nextInt(6) + 1;
                d2 = random.nextInt(6) + 1;
                sum = d1 + d2;
                round++;

                System.out.printf("\nDado 1: %d, Dado 2: %d\n", d1, d2);
                System.out.printf("Jogada %d: %d\n", round, sum);

                if (sum == point) {
                    System.out.println("\nVocê ganhou :-)");
                    break;
                } else if (sum == 7) {
                    System.out.println("\nVocê perdeu :-(");
                    break;
                }
            }
        }
    }
}
