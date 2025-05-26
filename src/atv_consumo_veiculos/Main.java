package atv_consumo_veiculos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    private static final Path CAMINHO_CARROSTXT = Path.of("src/atv_consumo_veiculos/carros.txt");
    private static final Path CAMINHO_RELATORIOTXT = Path.of("src/atv_consumo_veiculos/relatorio.txt");
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        if (!Files.exists(CAMINHO_CARROSTXT)) {
            Files.createFile(CAMINHO_CARROSTXT);
        }

        if (!Files.exists(CAMINHO_RELATORIOTXT)) {
            Files.createFile(CAMINHO_RELATORIOTXT);
        }


        System.out.println("Insira o preço do combustivel");
        float precoCombustivel = s.nextFloat();

        var linhas = Files.readAllLines(CAMINHO_CARROSTXT);

        var outPadrao = System.out;
        OutputStream arquivoOut = Files.newOutputStream(CAMINHO_RELATORIOTXT, StandardOpenOption.TRUNCATE_EXISTING);
        System.setOut(new PrintStream(arquivoOut));

        System.out.println("RELATÓRIO");

        for (var linha : linhas) {
            System.out.println("---------------------------------");
            var split = linha.split(";");
            var fabricante = split[0];
            var modelo = split[1];
            var consumoMedio = Float.parseFloat(split[2]);

            var litros1000Km = consumoMedio * 1_000;
            var preco100Km = litros1000Km * precoCombustivel;

            System.out.println("Fabricante: " + fabricante);
            System.out.println("Modelo: " + modelo);
            System.out.printf("Consumo médio: %.2f\n", consumoMedio);
            System.out.printf("Litros por 1.000 km: %.2f\n", litros1000Km);
            System.out.printf("Preço por 1.000 km: %.2f\n", preco100Km);
        }

        arquivoOut.close();
        System.setOut(outPadrao);
    }
}