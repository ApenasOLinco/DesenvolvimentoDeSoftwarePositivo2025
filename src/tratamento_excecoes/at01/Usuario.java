package tratamento_excecoes.at01;

public class Usuario {
    private String nome, email;

    private int idade;

    public Usuario(String nome, String email, int idade) {
        String[] erros = new String[3];
        int numErros = 0;

        if(nome.length() < 3) {
            erros[numErros ++] = "O nome contém poucos caracteres! O mínimo é 3.";
        }

        if(!email.contains("@")) {
            erros[numErros ++] = "O e-mail fornecido não possui formato correto.";
        }

        if(idade < 18 || idade > 99) {
            erros[numErros] = "Idade fora da faixa permitida!";
        }

        if(numErros > 0) {
            throw new IllegalArgumentException(String.join("\n", erros).replaceAll("null",""));
        }

        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
