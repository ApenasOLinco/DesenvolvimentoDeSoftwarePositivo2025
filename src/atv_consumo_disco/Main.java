package atv_consumo_disco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var path = Path.of("src/atv_consumo_disco/consumo.txt");

        try {
            var lines = Files.readAllLines(path);

            double espacoTotalMB = lines.stream()
                    .mapToDouble(line ->
                            Double.parseDouble(line.split(";")[1]) / 1_048_576D
                    )
                    .sum();

            double espacoMedioOcupado = espacoTotalMB / lines.size();
            List<UsuarioInfo> info = calcUsuariosInfos(lines, espacoTotalMB);
            info.sort(Comparator.comparing(UsuarioInfo::getUsuario));

            printInfo(info, espacoMedioOcupado, espacoTotalMB);
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    private static List<UsuarioInfo> calcUsuariosInfos(List<String> lines, double espacoTotalMB) {
        List<UsuarioInfo> infos = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] split = lines.get(i).split(";");

            String usuario = split[0];
            double espacoB = Double.parseDouble(split[1]);
            double espacoMB = espacoB / 1_048_576D;
            double porcentagemUso = (espacoMB / espacoTotalMB) * 100;

            infos.add(new UsuarioInfo(
                    i + 1,
                    usuario,
                    espacoMB,
                    porcentagemUso
            ));
        }

        return infos;
    }

    private static void printInfo(List<UsuarioInfo> infos, double espacoMedioOcupado, double espacoTotalMB) {
        // Header
        System.out.printf("%-10s%-20s%-25s%-20s\n", "Nr.", "Usuario", "Espaco Utilizado", "% de uso");

        // Dados
        for(var info : infos) {
            System.out.printf("%-10d", info.getNumero());
            System.out.printf("%-20s", info.getUsuario());
            System.out.printf("%-25.2f", info.getEspacoUtilizadoMB());
            System.out.printf("%-20.2f", info.getPorcentagemUso());
            System.out.println();
        }

        System.out.printf("\nEspaco total ocupado: %.2f\n", espacoTotalMB);
        System.out.printf("Espaco medio ocupado: %.2f\n", espacoMedioOcupado);
    }
}
