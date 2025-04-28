package principios_poo.atividade_avaliativa;

public class Carro extends Veiculo {

    private double capacidadePortaMalas;

    public Carro(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio, double capacidadePortaMalas) {
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }

    public double getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(double capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.printf("Capacidade do porta-malas: %.1f Litros\n", capacidadePortaMalas);
    }
}
