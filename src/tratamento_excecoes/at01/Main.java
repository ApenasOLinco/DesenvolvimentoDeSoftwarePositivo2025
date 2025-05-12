package tratamento_excecoes.at01;

public class Main {
    public static void main(String[] args) {
        try {
            Usuario usuario1 = new Usuario("Li", "lli.com", 221); // Erro no nome
        }
        catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
