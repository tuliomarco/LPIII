package Lista06;

public class RoboSimples {
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private String direcaoAtual;

    RoboSimples(String nome, int px, int py, String d) {
        validaRobo(nome, d);
        nomeDoRobo = nome;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }

    RoboSimples(String nome) {
        this(nome, 0, 0, "N");
    }

    RoboSimples() {
        this("Wally");
    }

    // Adiciona validação do nome e direção
    private void validaRobo(String nome, String direcao) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome do robô não pode ser nulo.");
        }

        if (direcao != "N" && direcao != "S" && direcao != "E" && direcao != "O"
                && direcao != "NE" && direcao != "NO" && direcao != "SE" && direcao != "SO") {
            throw new IllegalArgumentException("Direção do robô inválida.");
        }
    }

    public void move() {
        move(1);
    }

    public void move(int passos) {
        if (direcaoAtual == "N") posicaoYAtual += passos;
        else if (direcaoAtual == "S") posicaoYAtual -= passos;
        else if (direcaoAtual == "E") posicaoXAtual += passos;
        else if (direcaoAtual == "O") posicaoXAtual -= passos;
        else if (direcaoAtual == "NE") {
            posicaoXAtual += passos;
            posicaoYAtual += passos;
        } else if (direcaoAtual == "NO") {
            posicaoXAtual -= passos;
            posicaoYAtual += passos;
        } else if (direcaoAtual == "SE") {
            posicaoXAtual += passos;
            posicaoYAtual -= passos;
        } else if (direcaoAtual == "SO") {
            posicaoXAtual -= passos;
            posicaoYAtual -= passos;
        }
    }

    public void mudaDirecao(String novaDirecao) {
        validaRobo(nomeDoRobo, novaDirecao);
        direcaoAtual = novaDirecao;
    }

    public String toString() {
        String str = "\nNome do robô: " + nomeDoRobo + "\n";
        str += "Posição do robô: (" + posicaoXAtual + ", " + posicaoYAtual + ")\n";
        str += "Direção do robô: " + direcaoAtual;

        return str;
    }

    public boolean verificaColisao(RoboSimples outroRobo) {
        return posicaoXAtual == outroRobo.posicaoXAtual && posicaoYAtual == outroRobo.posicaoYAtual;
    }

    public static void main(String[] args) {
        RoboSimples robo1 = new RoboSimples();
        System.out.println(robo1.toString());

        RoboSimples robo2 = new RoboSimples("Robo2");
        System.out.println(robo2.toString());

        RoboSimples robo3 = new RoboSimples("Robo3", 3, 5, "E");
        System.out.println(robo3.toString());

        robo3.move(2);
        System.out.println(robo3.toString());

        robo3.mudaDirecao("S");
        System.out.println(robo3.toString());

        robo3.mudaDirecao("NE");
        robo3.move(1);
        System.out.println(robo3.toString());

        RoboSimples robo4 = new RoboSimples("Robo4", 3, 6, "O");
        System.out.println("Colisão com robo3? " + robo3.verificaColisao(robo4));
    }
}
