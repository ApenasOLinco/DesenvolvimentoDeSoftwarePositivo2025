package avaliacao_a2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarInformacoes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return """
                Pessoa:
                    Nome: %s
                    Idade: %d
                """.formatted(nome, idade);
    }
}
