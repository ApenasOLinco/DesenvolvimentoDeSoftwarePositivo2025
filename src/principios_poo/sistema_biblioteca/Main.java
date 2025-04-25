package principios_poo.sistema_biblioteca;

public class Main {
    public static void main(String[] args) {
        ItemBiblioteca itemBiblioteca = new ItemBiblioteca("Linco", 2003);
        Livro livro = new Livro("O livro do Linco", 2047, "Linco", 2);
        DVD dvd = new DVD("DVD do Linco", 2047, "Comédia", 1);

        itemBiblioteca.mostrarDetalhes();
        livro.mostrarDetalhes();
        dvd.mostrarDetalhes();
    }
}
