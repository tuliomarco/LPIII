package Lista09;

import java.time.LocalDate;

class LivroBiblioteca extends Livro {
    private boolean emprestado;
    private LocalDate dataDevolucao;

    public LivroBiblioteca(String titulo, int anoPublicacao, String autor, int nroPaginas) {
        super(titulo, anoPublicacao, autor, nroPaginas);
        this.emprestado = false;
        this.dataDevolucao = null;
    }

    public boolean isAvailable() {
        return !emprestado;
    }

    public void borrow() {
        if (!emprestado) {
            emprestado = true;
            
            LocalDate hoje = LocalDate.now();
            this.dataDevolucao = hoje.plusDays(7);
            
            System.out.println("Livro emprestado com sucesso! Data de devolução: " + this.dataDevolucao);
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    @Override
    public String toString() {
        String info = super.toString();
        if (emprestado) {
            info += " | Emprestado até: " + dataDevolucao;
        }
        return info;
    }
}