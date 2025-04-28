package principios_poo.atividade_avaliativa;

public abstract class Veiculo {
    private String marca;

    private String modelo;

    private int anoFabricacao;

    private double combustivel;

    private double consumoMedio;

    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }

    public double calcularAutonomia() {
        return combustivel * consumoMedio;
    }

    public boolean precisaAbastecimento() {
        return calcularAutonomia() < 30;
    }

    public void realizarViagem(double distancia) {
        if (distancia > calcularAutonomia()) {
            System.out.println("Não foi possível realizar a viagem!");
            return;
        }

        combustivel -= distancia / consumoMedio;
        System.out.printf("Viagem realizada com sucesso! Restaram %.1f litros de combustível no veículo!\n", combustivel);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public abstract void acelerar();

    public abstract void frear();

    public void mostrarDetalhes() {
        String detalhes = """
                Marca: %s,
                Modelo: %s,
                Ano de fabricação: %d,
                Combustível: %.1f Litros,
                Consumo médio: %.1f Km/L
                """.formatted(
                getMarca(),
                getModelo(),
                getAnoFabricacao(),
                getCombustivel(),
                getConsumoMedio()
        );

        System.out.println(detalhes);
    }
}
