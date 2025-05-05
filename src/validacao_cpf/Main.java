package validacao_cpf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String cpf = "2221.333.666-38".replaceAll("[.-]", "");
        System.out.println(cpf);

        if(cpf.length() != 11) {
            System.err.println("Cpf inválido.");
            System.exit(1);
        }

        // Todos os dígitos iguais
        if (cpf.chars().allMatch(i -> i == cpf.charAt(0))) {
            System.err.println("CPF inválido (Dígitos Iguais).");
            System.exit(1);
        }

        /*
            Primeiro dígito verificador
         */
        int digitoVerificador1 = getDigitoVerificador(cpf.substring(0, 9));

        if (digitoVerificador1 != cpf.charAt(9) - '0') {
            System.err.println("Cpf inválido.");
            System.exit(1);
        }

        /*
            Segundo dígito verificador
         */
        int digitoVerificador2 = getDigitoVerificador(cpf.substring(0, 10));

        if (digitoVerificador2 != cpf.charAt(10) - '0') {
            System.err.println("Cpf inválido.");
            System.exit(1);
        }

        System.out.println("Cpf válido.");
    }

    private static int getDigitoVerificador(String cpf) {
        int[] multiplicacao = new int[cpf.length()];

        for (int i = 0; i < cpf.length(); i++) {
            int peso = cpf.length() + 1 - i;
            multiplicacao[i] = peso * (cpf.charAt(i) - '0');
        }

        int somatoria = Arrays.stream(multiplicacao).sum();
        int resto = somatoria % 11;

        return (11 - resto) > 9
                ? 0
                : (11 - resto);
    }
}