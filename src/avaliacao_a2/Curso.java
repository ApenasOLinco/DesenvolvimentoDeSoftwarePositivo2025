package avaliacao_a2;

public class Curso {
    public final String nome;

    public final int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void mostrarInformacoes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return """
                Curso:
                    Nome: %s
                    Carga Horária: %d horas
                """
                .formatted(
                        nome,
                        cargaHoraria
                );
    }
}
