import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        

        ListaLivros biblioteca = new ListaLivros("titulo");

        System.out.println("--- Adicionando Livros (Ordenação por Título) ---");
        
        
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", "001"));
        biblioteca.adicionarLivro(new Livro("A Hora da Estrela", "Clarice Lispector", "002"));
        biblioteca.adicionarLivro(new Livro("O Alquimista", "Paulo Coelho", "003"));
        biblioteca.adicionarLivro(new Livro("Capitães da Areia", "Jorge Amado", "004"));
        
        // --- Literatura Brasileira e Clássicos ---
        biblioteca.adicionarLivro(new Livro("Memórias Postumas de Bras Cubas", "Machado de Assis", "005"));
        biblioteca.adicionarLivro(new Livro("Quincas Borba", "Machado de Assis", "006"));
        biblioteca.adicionarLivro(new Livro("O Guarani", "José de Alencar", "007"));
        biblioteca.adicionarLivro(new Livro("Iracema", "José de Alencar", "008"));
        biblioteca.adicionarLivro(new Livro("Senhora", "José de Alencar", "009"));
        biblioteca.adicionarLivro(new Livro("Grande Sertao: Veredas", "Guimarães Rosa", "010"));
        biblioteca.adicionarLivro(new Livro("Primeiras Estórias", "Guimarães Rosa", "011"));
        biblioteca.adicionarLivro(new Livro("Vidas Secas", "Graciliano Ramos", "012"));
        biblioteca.adicionarLivro(new Livro("S. Bernardo", "Graciliano Ramos", "013"));
        biblioteca.adicionarLivro(new Livro("Angústia", "Graciliano Ramos", "014"));
        biblioteca.adicionarLivro(new Livro("O Cortiço", "Aluísio Azevedo", "015"));
        biblioteca.adicionarLivro(new Livro("Auto da Compadecida", "Ariano Suassuna", "016"));
        biblioteca.adicionarLivro(new Livro("O Santo e a Porca", "Ariano Suassuna", "017"));
        biblioteca.adicionarLivro(new Livro("Morte e Vida Severina", "João Cabral de Melo Neto", "018"));
        biblioteca.adicionarLivro(new Livro("Laços de Família", "Clarice Lispector", "019"));
        biblioteca.adicionarLivro(new Livro("A Paixao Segundo G.H.", "Clarice Lispector", "020"));
        /* 
        biblioteca.adicionarLivro(new Livro("Felicidade Clandestina", "Clarice Lispector", "021"));
        biblioteca.adicionarLivro(new Livro("Tieta do Agreste", "Jorge Amado", "022"));
        biblioteca.adicionarLivro(new Livro("Gabriela, Cravo e Canela", "Jorge Amado", "023"));
        biblioteca.adicionarLivro(new Livro("Dona Flor e Seus Dois Maridos", "Jorge Amado", "024"));

        // --- Literatura Mundial ---
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", "025"));
        biblioteca.adicionarLivro(new Livro("A Revoluçao dos Bichos", "George Orwell", "026"));
        biblioteca.adicionarLivro(new Livro("Admirável Mundo Novo", "Aldous Huxley", "027"));
        biblioteca.adicionarLivro(new Livro("Fahrenheit 451", "Ray Bradbury", "028"));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "029"));
        biblioteca.adicionarLivro(new Livro("O Hobbit", "J.R.R. Tolkien", "030"));
        biblioteca.adicionarLivro(new Livro("Cem Anos de Solidao", "Gabriel García Márquez", "031"));
        biblioteca.adicionarLivro(new Livro("O Amor nos Tempos do Cólera", "Gabriel García Márquez", "032"));
        biblioteca.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes", "033"));
        biblioteca.adicionarLivro(new Livro("Hamlet", "William Shakespeare", "034"));
        biblioteca.adicionarLivro(new Livro("Romeu e Julieta", "William Shakespeare", "035"));
        biblioteca.adicionarLivro(new Livro("Macbeth", "William Shakespeare", "036"));
        biblioteca.adicionarLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "037"));
        biblioteca.adicionarLivro(new Livro("Crime e Castigo", "Fiódor Dostoiévski", "038"));
        biblioteca.adicionarLivro(new Livro("Os Irmãos Karamazov", "Fiódor Dostoiévski", "039"));
        biblioteca.adicionarLivro(new Livro("O Idiota", "Fiódor Dostoiévski", "040"));
        biblioteca.adicionarLivro(new Livro("Orgulho e Preconceito", "Jane Austen", "041"));
        biblioteca.adicionarLivro(new Livro("Razao e Sensibilidade", "Jane Austen", "042"));
        biblioteca.adicionarLivro(new Livro("Persuasao", "Jane Austen", "043"));
        biblioteca.adicionarLivro(new Livro("O Morro dos Ventos Uivantes", "Emily Brontë", "044"));
        biblioteca.adicionarLivro(new Livro("Jane Eyre", "Charlotte Brontë", "045"));
        biblioteca.adicionarLivro(new Livro("Moby Dick", "Herman Melville", "046"));
        biblioteca.adicionarLivro(new Livro("O Grande Gatsby", "F. Scott Fitzgerald", "047"));
        biblioteca.adicionarLivro(new Livro("Ulysses", "James Joyce", "048"));
        biblioteca.adicionarLivro(new Livro("A Metamorfose", "Franz Kafka", "049"));
        biblioteca.adicionarLivro(new Livro("O Processo", "Franz Kafka", "050"));
        biblioteca.adicionarLivro(new Livro("Em Busca do Tempo Perdido", "Marcel Proust", "051"));
        biblioteca.adicionarLivro(new Livro("O Estrangeiro", "Albert Camus", "052"));
        biblioteca.adicionarLivro(new Livro("A Peste", "Albert Camus", "053"));
        biblioteca.adicionarLivro(new Livro("Ensaio Sobre a Cegueira", "José Saramago", "054"));
        biblioteca.adicionarLivro(new Livro("O Evangelho Segundo Jesus Cristo", "José Saramago", "055"));
        biblioteca.adicionarLivro(new Livro("O Retrato de Dorian Gray", "Oscar Wilde", "056"));
        biblioteca.adicionarLivro(new Livro("A Importancia de Ser Prudente", "Oscar Wilde", "057"));
        biblioteca.adicionarLivro(new Livro("Frankenstein", "Mary Shelley", "058"));
        biblioteca.adicionarLivro(new Livro("Drácula", "Bram Stoker", "059"));
        biblioteca.adicionarLivro(new Livro("O Médico e o Monstro", "Robert Louis Stevenson", "060"));
        biblioteca.adicionarLivro(new Livro("A Ilha do Tesouro", "Robert Louis Stevenson", "061"));
        biblioteca.adicionarLivro(new Livro("Alice no País das Maravilhas", "Lewis Carroll", "062"));
        biblioteca.adicionarLivro(new Livro("Através do Espelho", "Lewis Carroll", "063"));
        biblioteca.adicionarLivro(new Livro("As Crônicas de Nárnia", "C.S. Lewis", "064"));
        biblioteca.adicionarLivro(new Livro("Cartas de um Diabo a seu Aprendiz", "C.S. Lewis", "065"));
        biblioteca.adicionarLivro(new Livro("Paraíso Perdido", "John Milton", "066"));
        biblioteca.adicionarLivro(new Livro("A Divina Comédia", "Dante Alighieri", "067"));
        biblioteca.adicionarLivro(new Livro("Fausto", "Johann Wolfgang von Goethe", "068"));
        biblioteca.adicionarLivro(new Livro("Os Miseráveis", "Victor Hugo", "069"));
        biblioteca.adicionarLivro(new Livro("O Corcunda de Notre-Dame", "Victor Hugo", "070"));
        biblioteca.adicionarLivro(new Livro("O Conde de Monte Cristo", "Alexandre Dumas", "071"));
        biblioteca.adicionarLivro(new Livro("Os Três Mosqueteiros", "Alexandre Dumas", "072"));
        biblioteca.adicionarLivro(new Livro("Guerra e Paz", "Liev Tolstói", "073"));
        biblioteca.adicionarLivro(new Livro("Anna Karenina", "Liev Tolstói", "074"));
        biblioteca.adicionarLivro(new Livro("Lolita", "Vladimir Nabokov", "075"));

        // --- Contemporâneos e Suspense ---
        biblioteca.adicionarLivro(new Livro("O Código Da Vinci", "Dan Brown", "076"));
        biblioteca.adicionarLivro(new Livro("Anjos e Demônios", "Dan Brown", "077"));
        biblioteca.adicionarLivro(new Livro("A Menina que Roubava Livros", "Markus Zusak", "078"));
        biblioteca.adicionarLivro(new Livro("O Caçador de Pipas", "Khaled Hosseini", "079"));
        biblioteca.adicionarLivro(new Livro("A Cidade do Sol", "Khaled Hosseini", "080"));
        biblioteca.adicionarLivro(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "081"));
        biblioteca.adicionarLivro(new Livro("Harry Potter e a Camara Secreta", "J.K. Rowling", "082"));
        biblioteca.adicionarLivro(new Livro("O Iluminado", "Stephen King", "083"));
        biblioteca.adicionarLivro(new Livro("It: A Coisa", "Stephen King", "084"));
        biblioteca.adicionarLivro(new Livro("Misery", "Stephen King", "085"));
        biblioteca.adicionarLivro(new Livro("Sherlock Holmes: Um Estudo em Vermelho", "Arthur Conan Doyle", "086"));
        biblioteca.adicionarLivro(new Livro("O Cao dos Baskerville", "Arthur Conan Doyle", "087"));
        biblioteca.adicionarLivro(new Livro("E Não Sobrou Nenhum", "Agatha Christie", "088"));
        biblioteca.adicionarLivro(new Livro("Assassinato no Expresso Oriente", "Agatha Christie", "089"));

        // --- Programação e Ciência (Para o seu perfil técnico) ---
        biblioteca.adicionarLivro(new Livro("Código Limpo", "Robert C. Martin", "090"));
        biblioteca.adicionarLivro(new Livro("Arquitetura Limpa", "Robert C. Martin", "091"));
        biblioteca.adicionarLivro(new Livro("O Codificador Limpo", "Robert C. Martin", "092"));
        biblioteca.adicionarLivro(new Livro("Algoritmos: Teoria e Prática", "Thomas Cormen", "093"));
        biblioteca.adicionarLivro(new Livro("Estruturas de Dados e Algoritmos em Java", "Robert Lafore", "094"));
        biblioteca.adicionarLivro(new Livro("Design Patterns", "Erich Gamma", "095"));
        biblioteca.adicionarLivro(new Livro("Refatoraçao", "Martin Fowler", "096"));
        biblioteca.adicionarLivro(new Livro("Uma Breve História do Tempo", "Stephen Hawking", "097"));
        biblioteca.adicionarLivro(new Livro("Cosmos", "Carl Sagan", "098"));
        biblioteca.adicionarLivro(new Livro("O Mundo Assombrado pelos Demônios", "Carl Sagan", "099"));
        biblioteca.adicionarLivro(new Livro("Sapiens", "Yuval Noah Harari", "100"));
        biblioteca.adicionarLivro(new Livro("Homo Deus", "Yuval Noah Harari", "101"));
        biblioteca.adicionarLivro(new Livro("A Arte da Guerra", "Sun Tzu", "102"));
        biblioteca.adicionarLivro(new Livro("O Príncipe", "Nicolau Maquiavel", "103"));
        biblioteca.adicionarLivro(new Livro("Meditacoes", "Marco Aurélio", "104"));
        */
       Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========== MENU DA BIBLIOTECA ==========");
            System.out.println("1. Imprimir lista completa");
            System.out.println("2. Buscar por autor");
            System.out.println("3. Buscar por título");
            System.out.println("4. Emprestar livro (por ISBN)");
            System.out.println("5. Devolver livro (por ISBN)");
            System.out.println("6. Remover livro (por ISBN)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Acervo Completo ---");
                    biblioteca.imprimirLista();
                    break;

                case 2:
                    System.out.print("Digite o nome do autor: ");
                    String autor = sc.nextLine();
                    biblioteca.exibirLivrosPorAutor(autor);
                    break;

                case 3:
                    System.out.print("Digite o título do livro: ");
                    String titulo = sc.nextLine();
                    boolean existe = biblioteca.buscarPorTitulo(titulo);
                    System.out.println(existe ? "O livro está no acervo." : "Livro não encontrado.");
                    break;

                case 4:
                    System.out.print("Digite o ISBN para EMPRÉSTIMO: ");
                    String isbnEmp = sc.nextLine();
                    biblioteca.alterarDisponibilidade(isbnEmp, false);
                    break;

                case 5:
                    System.out.print("Digite o ISBN para DEVOLUÇÃO: ");
                    String isbnDev = sc.nextLine();
                    biblioteca.alterarDisponibilidade(isbnDev, true);
                    break;

                case 6:
                    System.out.print("Digite o ISBN do livro a ser REMOVIDO: ");
                    String isbnRem = sc.nextLine();
                    biblioteca.removerLivro(isbnRem);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();

        
        /* 
        biblioteca.imprimirLista();

        System.out.println("\n--- Testando Buscas ---");
        
        // Busca por Título
        String buscaTitulo = "Dom Casmurro";
        System.out.println("Existe '" + buscaTitulo + "'? " + biblioteca.buscarPorTitulo(buscaTitulo));

        // Busca por Autor
        biblioteca.exibirLivrosPorAutor("Clarice Lispector");

        System.out.println("\n--- Testando Empréstimo ---");
        
        // Emprestando o livro pelo ISBN
        biblioteca.alterarDisponibilidade("001", false);
        biblioteca.imprimirLista();

        System.out.println("\n--- Testando Devolução ---");
        biblioteca.alterarDisponibilidade("001", true);
        biblioteca.imprimirLista();

        System.out.println("\n--- Testando Remoção ---");
        // Vamos remover o livro de ISBN 002 (A Hora da Estrela)
        biblioteca.removerLivro("002");

        // Imprimir para ver se a lista pulou do primeiro para o terceiro livro
        biblioteca.imprimirLista();
    */
    }
}