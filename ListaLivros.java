public class ListaLivros {
    private No inicio; // O primeiro nó da lista (a cabeça)
    private String criterioOrdenacao; // "titulo" ou "autor"

    public ListaLivros(String criterio) {
        this.inicio = null;
        this.criterioOrdenacao = criterio;
    }

    public void adicionarLivro(Livro novoLivro) {
        No novoNo = new No(novoLivro);

    // Caso 1: A lista está vazia ou o novo livro vem antes do primeiro
        if (inicio == null || deveVirAntes(novoLivro, inicio.livro)) {
            novoNo.proximo = inicio;
            inicio = novoNo;
        } 
        else {
            // Caso 2: Procurar a posição correta no meio ou no fim
            No atual = inicio;
            No anterior = null;

            while (atual != null && !deveVirAntes(novoLivro, atual.livro)) {
                anterior = atual;
                atual = atual.proximo;
            }

            // Faz o "encaixe"
            novoNo.proximo = atual;
            anterior.proximo = novoNo;
        }
    }
    private boolean deveVirAntes(Livro novo, Livro existente) {
        if (criterioOrdenacao.equalsIgnoreCase("titulo")) {
            return novo.titulo.compareToIgnoreCase(existente.titulo) < 0;
        } else {
            return novo.autor.compareToIgnoreCase(existente.autor) < 0;
        }
    }

    public boolean buscarPorTitulo(String tituloBuscado) {
        No atual = inicio; // Começa na cabeça da lista

        while (atual != null) {
            if (atual.livro.titulo.equalsIgnoreCase(tituloBuscado)) {
                return true; // Encontrou o livro
            }
            atual = atual.proximo; // Pula para o próximo vagão
        }
        return false; // Chegou no fim e não achou
    }

    public void exibirLivrosPorAutor(String autorBuscado) {
        No atual = inicio;
        boolean encontrou = false;

        System.out.println("Livros de " + autorBuscado + ":");
        while (atual != null) {
            if (atual.livro.autor.equalsIgnoreCase(autorBuscado)) {
                System.out.println("- " + atual.livro.titulo + " (ISBN: " + atual.livro.isbn + ")");
                encontrou = true;
            }
            atual = atual.proximo;
        }

        if (!encontrou) {
            System.out.println("Nenhum livro encontrado para este autor.");
        }
    }

    public void alterarDisponibilidade(String isbn, boolean novoStatus) {
        No atual = inicio;
        while (atual != null) {
            if (atual.livro.isbn.equals(isbn)) {
                atual.livro.disponivel = novoStatus;
                System.out.println("Status do livro '" + atual.livro.titulo + "' atualizado.");
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Livro com ISBN " + isbn + " não encontrado.");
    }

    public void imprimirLista() {
        No atual = inicio;
        if (atual == null) {
            System.out.println("A biblioteca está vazia.");
            return;
        }
        while (atual != null) {
            String status = atual.livro.disponivel ? "[Disponível]" : "[Emprestado]";
            System.out.println(atual.livro.titulo + " | " + atual.livro.autor + " | " + status);
            atual = atual.proximo;
        }
    }
    
    public void removerLivro(String isbn) {
        // 1. Caso a lista esteja vazia
        if (inicio == null) {
            System.out.println("A biblioteca está vazia. Nada para remover.");
            return;
        }

        // 2. Caso especial: O livro a ser removido é o PRIMEIRO da lista
        if (inicio.livro.isbn.equals(isbn)) {
            inicio = inicio.proximo; // A cabeça da lista agora aponta para o segundo
            System.out.println("Livro removido com sucesso.");
            return;
        }

        // 3. Caso Geral: Procurar no meio ou no fim
        No atual = inicio;
        No anterior = null;

        while (atual != null && !atual.livro.isbn.equals(isbn)) {
            anterior = atual;
            atual = atual.proximo;
        }

        // Se saiu do loop e o atual é null, o livro não existe
        if (atual == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        } else {
            // Encontrou o livro. O anterior "pula" o atual
            anterior.proximo = atual.proximo;
            System.out.println("Livro '" + atual.livro.titulo + "' removido.");
        }
    }

}