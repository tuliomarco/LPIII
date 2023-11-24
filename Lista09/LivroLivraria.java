package Lista09;

class LivroLivraria extends Livro {
    private double preco;
    private int estoque;

    public LivroLivraria(String titulo, int anoPublicacao, String autor, int nroPaginas, double preco, int estoque) {
        super(titulo, anoPublicacao, autor, nroPaginas);
        this.preco = preco;
        this.estoque = estoque;
    }

    public void sell() {
        if (estoque > 0) {
            estoque--;
            System.out.println("Livro vendido com sucesso!");
        } else {
            System.out.println("Livro fora de estoque.");
        }
    }

    public boolean isAvailable() {
        return estoque > 0;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += " | Preço: " + preco + " | Estoque: " + estoque;
        return info;
    }
}
