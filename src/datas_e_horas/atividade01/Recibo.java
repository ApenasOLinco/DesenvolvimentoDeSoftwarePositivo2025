package datas_e_horas.atividade01;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Recibo {
    private Carro carro;

    private LocalTime entrada;

    private LocalTime saida;

    private double totalAPagar;

    public Recibo(Carro carro, LocalTime entrada, LocalTime saida) {
        this.carro = carro;
        this.entrada = entrada;
        this.saida = saida;

        // Definir total a pagar
        var tempoDeEstada = Duration.between(entrada, saida);
        var horasEstada = tempoDeEstada.toHoursPart();
        var minutosEstada = tempoDeEstada.toMinutesPart();

        totalAPagar =
                horasEstada == 0
                        ? 5
                        : 5 + ((horasEstada - 1) * 60 + minutosEstada) / 15.0 * 2;
    }

    public Carro getCarro() {
        return carro;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String toString = """
        -----------------------------
        Recibo
        -----------------------------
        Placa: %s
        Entrada: %s
        Saida: %s
        Tempo total (em minutos): %d
        Total a pagar: R$%.2f
        -----------------------------
        """.formatted(
                carro.getPlaca(),
                entrada.format(formatter),
                saida.format(formatter),
                Duration.between(entrada, saida).toMinutes(),
                totalAPagar
        );

        return toString;
    }
}
