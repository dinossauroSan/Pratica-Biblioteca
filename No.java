public class No {
    Livro livro;
    No proximo; // O "ponteiro" para o próximo nó da lista

    public No(Livro livro) {
        this.livro = livro;
        this.proximo = null;
    }
}