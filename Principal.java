import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        // Filme
        Filme duna = new Filme(1, "Duna", "Denis Villeneuve", 2021, "Ficcao",
                Arrays.asList("Timothée Chalamet", "Zendaya", "Rebecca Ferguson", "Oscar Isaac"), 136);

        // Filme
        Filme duna2 = new Filme(2, "Duna: Parte 2", "Denis Villeneuve", 2024, "Ficcao",
                Arrays.asList("Timothée Chalamet", "Zendaya", "Rebecca Ferguson", "Oscar Isaac"), 165);

        // Filme
        Filme deadPool = new Filme(3, "Dead Pool 2", "David Leitch", 2018, "Acao, Comedia",
                Arrays.asList("Ryan Reynolds", "Josh Brolin", "Zazie Beetz"), 119);

        // Serie
        Serie houseOfDragons = new Serie(1, "House Of The Dragon", "Ryan Condal", 2024, "Acao, fantasia",
                Arrays.asList("Paddy Considine", "Matt Smith", "Emma D'Arcy"), 72);

        // Usuario
        Usuario user1 = new Usuario(1, "Fulano de tal", "fulano@email.com", "Cartao Credito", "123456");

        // Usuario
        Usuario user2 = new Usuario(2, "Beltrano de tal", "beltrano@email.com", "Cartao Debito", "456123");

        // Adicionar favoritos
        user1.adicionarFavoritos(houseOfDragons);
        user1.adicionarFavoritos(duna);
        user1.adicionarFavoritos(duna2);
        user1.adicionarFavoritos(deadPool);

        user2.adicionarFavoritos(houseOfDragons);
        user2.adicionarFavoritos(duna);
        user2.adicionarFavoritos(duna2);
        user2.adicionarFavoritos(deadPool);

        user2.removerFavoritos(houseOfDragons);
        user2.removerFavoritos(duna);

        // Mostrar detalhes do user 1
        System.out.println(" ================ STREAMFLIX ==================");
        System.out.println("Detalhes do usuario: ");
        System.out.println(user1.exibir());
        System.out.println();

        System.out.println(" ================ ");
        System.out.println("Favoritos do usuario: ");
        System.out.println(" ================ ");

        for (Video video : user1.getFavoritos()) {
            System.out.println(video.exibir());
        }

        // Mostrar detalhes do user 2
        System.out.println(" ================ STREAMFLIX ==================");
        System.out.println("Detalhes do usuario: ");
        System.out.println(user2.exibir());
        System.out.println();

        System.out.println(" ================ ");
        System.out.println("Favoritos do usuario: ");
        System.out.println(" ================ ");

        for (Video video : user2.getFavoritos()) {
            System.out.println(video.exibir());
        }
    }

}
