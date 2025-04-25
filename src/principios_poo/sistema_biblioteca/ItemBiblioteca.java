package principios_poo.sistema_biblioteca;

public class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void mostrarDetalhes() {
        String detalhes = """
                ItemBiblioteca {
                    titulo: %s,
                    anoPublicacao: %d
                }
                """.formatted(
                this.titulo,
                this.anoPublicacao
        );

        System.out.println(detalhes);
    }
}
