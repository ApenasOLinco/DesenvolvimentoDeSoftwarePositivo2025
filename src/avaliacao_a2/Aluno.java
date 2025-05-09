package avaliacao_a2;

public class Aluno extends Pessoa {

    public final String matricula;

    private final Curso curso;

    private final double nota1, nota2;

    private final double media;

    public Aluno(String nome, int idade, String matricula, Curso curso, double nota1, double nota2) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;

        media = (nota1 + nota2) / 2.0;
    }

    @Override
    public String toString() {
        String informacoesSuper = super.toString();

        return informacoesSuper.replace("Pessoa", "Aluno")
                .concat("""
                            Matrícula: %s
                        
                            %s
                            Média: %.1f
                            Situação: %s
                        """.formatted(
                        matricula,
                        curso,
                        media,
                        media >= 7.0 ? "APROVADO" : "REPROVADO"
                ));
    }
}