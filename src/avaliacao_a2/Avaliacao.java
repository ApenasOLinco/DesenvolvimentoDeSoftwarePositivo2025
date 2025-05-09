package avaliacao_a2;

public class Avaliacao {
    public static void main(String[] args) {
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", 220);
        Aluno linco = new Aluno("Linco", 21, "xxxxxxxx", ads, 4.0, 2.0); // Esse não tem salvação

        Curso engenhariaDeSoftware = new Curso("Engenharia de Software", 220);
        Aluno arthuro = new Aluno("Arthuro", 21, "xxxxxxxx", engenhariaDeSoftware, 10.0, 10.0); // Menino de ouro

        linco.mostrarInformacoes();
        System.out.println(); // Pula linha

        arthuro.mostrarInformacoes();
    }
}

