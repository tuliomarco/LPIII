package Lista05;

public class Lampada {
    private String estadoDaLampada, marca;
    private double preco;
    private int luminosidade;

    public Lampada() {
        this("apagado", 0.0, 0, "Desconhecida");
    }

    public Lampada(String estadoDaLampada, double preco, int luminosidade, String marca) {
        this.estadoDaLampada = estadoDaLampada;
        this.preco = preco;
        this.luminosidade = luminosidade;
        this.marca = marca;
    }
    
    public void acende() {
        this.estadoDaLampada = "aceso";
        this.luminosidade = 100;
    }

    public void apaga() {
        this.estadoDaLampada = "apagado";
        this.luminosidade = 0;
    }

    public void setEstadoDaLampada(String estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }

    public String getEstadoDaLampada() {
        return estadoDaLampada;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setLuminosidade(int luminosidade) {
        if (luminosidade >= 0 && luminosidade <= 100) {
            this.luminosidade = luminosidade;
            this.estadoDaLampada = "meia-luz";
        } else {
            System.out.println("Luminosidade fora do intervalo (0 a 100%).");
        }
    }

    public int getLuminosidade() {
        return luminosidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void mostraEstado() {
        System.out.println("Estado da Lâmpada: " + estadoDaLampada);
        System.out.println("Luminosidade: " + luminosidade + "%");
        System.out.println("Preço: R$" + preco);
        System.out.println("Marca: " + marca);
    }

    public boolean estaLigada() {
        return "aceso".equals(estadoDaLampada);
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.setMarca("ExemploMarca");
        lampada.setPreco(19.99);
        lampada.acende();

        lampada.mostraEstado();
        System.out.println("Está ligada? " + lampada.estaLigada());

        lampada.apaga();
        lampada.mostraEstado();
        System.out.println("Está ligada? " + lampada.estaLigada());

        lampada.setLuminosidade(50);
        lampada.mostraEstado();
    }
}