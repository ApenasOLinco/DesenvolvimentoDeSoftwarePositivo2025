package principios_poo.atividade_avaliativa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var carro = new Carro("Vw", "Kombi", 1959, 4, 14, 1405);
        var moto = new Moto("Honda", "Titan", 2007, 5, 32);

        var frota = new ArrayList<>(Arrays.asList(carro, moto));

        // Acelerar
        for (var v: frota)
            v.acelerar();

        // Frear
        for (var v: frota)
            v.frear();

        System.out.println();

        // Verificar autonomia
        for(var v: frota)
            System.out.printf("Autonomia de %s %s: %fKm/L", v.getMarca(), v.getModelo(), v.calcularAutonomia());

        // Precisa abastecimento
        for (var v: frota) {
            if (v.precisaAbastecimento()) {
                System.out.printf("%s %s precisa de abastecimento!\n", v.getMarca(), v.getModelo());
            } else {
                System.out.printf("%s %s não precisa de abastecimento!", v.getMarca(), v.getModelo());
            }
        }

        // Realizar viajens
        carro.realizarViagem(28); // Sobram 2L
        carro.realizarViagem(29); // Não será possível

        moto.realizarViagem(64); // Sobram 3L
        moto.realizarViagem(97); // Não será possível

        // Mostrar detalhes
        for (var v: frota)
            v.mostrarDetalhes();

        // Remover um veículo da frota
        frota.remove(Math.round((float) Math.random())); // Remove um aleatório

        // Mostrar a lista depois da exclusão:
        System.out.println("Frota: ");
        for (var v: frota) {
            v.mostrarDetalhes();
            System.out.println();
        }
    }
}
