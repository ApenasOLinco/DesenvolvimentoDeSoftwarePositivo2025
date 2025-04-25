package principios_poo.sistema_biblioteca;

public class DVD extends ItemBiblioteca {
    private String categoria;
    private int duracaoMinutos;

    public DVD(String titulo, int anoPublicacao, String categoria, int duracaoMinutos) {
        super(titulo, anoPublicacao);
        this.categoria = categoria;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void mostrarDetalhes() {
        String detalhes = """
                DVD {
                    titulo: %s,
                    anoPublicacao: %d,
                    categoria: %s,
                    duracaoMinutos: %d
                }
                """.formatted(
                this.titulo,
                this.anoPublicacao,
                this.categoria,
                this.duracaoMinutos
        );

        System.out.println(detalhes);
    }

}
