package Lista09;

class Livro {
    protected String titulo;
    protected int anoPublicacao;
    protected String autor;
    protected int nroPaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int nroPaginas) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Ano de Publicação: " + anoPublicacao + " | Número de Páginas: " + nroPaginas;
    }

    public boolean isOlder(int anotherYear) {
        return anoPublicacao < anotherYear;
    }
}