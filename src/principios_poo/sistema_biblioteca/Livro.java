package principios_poo.sistema_biblioteca;

public class Livro extends ItemBiblioteca {

    private String autor;
    private int numPaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int numPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDetalhes() {
        String detalhes = """
                Livro {
                    titulo: %s,
                    anoPublicacao: %d,
                    autor: %s,
                    numPaginas: %d
                }
                """.formatted(
                this.titulo,
                this.anoPublicacao,
                this.autor,
                this.numPaginas
        );

        System.out.println(detalhes);
    }
}
