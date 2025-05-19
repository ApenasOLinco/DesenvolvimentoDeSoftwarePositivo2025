package atv_arquivos_em_java;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AgendaContatos {

    private static final Path CAMINHO_ARQUIVO = Paths.get("agenda.txt"); /* Caminho constante para o arquivo */
    private static final Scanner scanner = new Scanner(System.in); /* Scanner para ler a entrada do usuário */

    public static void main(String[] args) {
        int opcao;

        do {
            /* Exibe o menu e lê a opção do usuário */
            System.out.println("\n-- Agenda de contatos --\n");
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Editar contato");
            System.out.println("[3] Excluir contato");
            System.out.println("[4] Listar contatos");
            System.out.println("[5] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); /* Consumir a nova linha após a leitura do número */

            switch (opcao) {
                case 1:
                    /* Adicionando um novo contato */
                    System.out.print("Insira o nome do contato: ");
                    final String nome = scanner.nextLine();

                    System.out.print("Insira o telefone do contato: ");
                    final String telefone = scanner.nextLine();

                    adicionarContato(nome, telefone);

                    break;
                case 2:
                    /* Editando um contato */
                    System.out.print("Digite o numero do contato a ser editado: ");
                    int numeroParaEditar = scanner.nextInt();
                    scanner.nextLine();

                    editarContato(numeroParaEditar);
                    break;
                case 3:
                    /* Excluindo um contato */
                    System.out.print("Digite o numero do contato a ser excluido: ");
                    int numeroParaExcluir = scanner.nextInt();
                    scanner.nextLine();

                    excluirContato(numeroParaExcluir);
                    break;
                case 4:
                    /* Listando todos os contatos */
                    listarContatos();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (true);
    }

    private static void adicionarContato(String nome, String telefone) {
        String linha = nome + ";" + telefone; /* Formata os dados */

        try {
            /* Escreve a linha no arquivo:
               CREATE: cria o arquivo se não existir
               APPEND: adiciona ao final do arquivo
               System.lineSeparator(): adiciona quebra de linha correta para o sistema operacional */
            Files.write(CAMINHO_ARQUIVO,
                    (linha + System.lineSeparator()).getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            System.out.println("Contato adicionado: " + nome);
        } catch (IOException e) {
            System.out.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }

    private static void editarContato(int posicaoParaExcluir) {
        try {
            if (!Files.exists(CAMINHO_ARQUIVO)) {
                System.out.println("Arquivo ainda nao existe.");
                return;
            }

            List<String> linhas = Files.readAllLines(CAMINHO_ARQUIVO);

            if (posicaoParaExcluir > linhas.size() || posicaoParaExcluir < 1) {
                System.err.println("O contato numero " + posicaoParaExcluir + " nao existe!");
                return;
            }

            String[] partes = linhas.get(posicaoParaExcluir - 1).split(";");

            System.out.print("Insira um novo numero para " + partes[0] + ": ");
            String novoTelefone = scanner.nextLine();
            linhas.set(posicaoParaExcluir - 1, partes[0] + ";" + novoTelefone); /* Substitui o telefone */

            /* Sobrescreve o arquivo com os dados atualizados */
            Files.write(CAMINHO_ARQUIVO, linhas, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Telefone de " + partes[0] + " atualizado para " + novoTelefone);
        } catch (IOException e) {
            System.out.println("Erro ao editar contato: " + e.getMessage());
        }
    }

    private static void excluirContato(int posicaoParaExcluir) {
        try {
            if (!Files.exists(CAMINHO_ARQUIVO)) {
                System.out.println("Arquivo ainda nao existe.");
                return;
            }

            List<String> linhas = Files.readAllLines(CAMINHO_ARQUIVO);

            if (posicaoParaExcluir > linhas.size() || posicaoParaExcluir < 1) {
                System.err.println("O contato numero " + posicaoParaExcluir + " nao existe!");
                return;
            }

            /* Itera sobre a lista e remove o contato com o nome correspondente */
            String[] partes = linhas.get(posicaoParaExcluir - 1).split(";");
            linhas.remove(posicaoParaExcluir - 1); /* Remove o contato */

            /* Sobrescreve o arquivo com os dados atualizados */
            Files.write(CAMINHO_ARQUIVO, linhas, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Contato removido: " + partes[0]);

        } catch (IOException e) {
            System.out.println("Erro ao excluir contato: " + e.getMessage());
        }
    }

    private static void listarContatos() {
        if (!Files.exists(CAMINHO_ARQUIVO)) {
            System.out.println("Arquivo ainda nao existe.");
            return;
        }

        try {
            List<String> linhas = Files.readAllLines(CAMINHO_ARQUIVO);

            /* Verifica se há contatos */
            if (linhas.isEmpty()) {
                System.out.println("Nenhum contato salvo.");
            } else {
                /* Ordena os contatos alfabeticamente */
                Collections.sort(linhas);

                /* Exibe os títulos e os contatos formatados */
                System.out.println("\n-- Listagem de Contatos --\n");

                System.out.printf("%-5s %-20s %-15s\n", "N", "Nome", "Telefone");

                for (int i = 0; i < linhas.size(); i++) {
                    String[] partes = linhas.get(i).split(";");
                    System.out.printf("%-5s %-20s %-15s\n", i + 1, partes[0], partes[1]);
                }

                /* Sobrescreve o arquivo com os dados ordenados */
                Files.write(CAMINHO_ARQUIVO, linhas, StandardOpenOption.TRUNCATE_EXISTING);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler contatos: " + e.getMessage());
        }
    }
}
