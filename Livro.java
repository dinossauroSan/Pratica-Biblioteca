public class Livro {
    String titulo;
    String autor;
    String isbn;
    boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true; // Todo livro novo começa disponível
    }
}