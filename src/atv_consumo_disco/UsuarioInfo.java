package atv_consumo_disco;

public class UsuarioInfo {
    private int numero;

    private String usuario;

    private double espacoUtilizadoMB;

    private double porcentagemUso;

    public UsuarioInfo(int numero, String usuario, double espacoUtilizadoMB, double porcentagemUso) {
        this.numero = numero;
        this.usuario = usuario;
        this.espacoUtilizadoMB = espacoUtilizadoMB;
        this.porcentagemUso = porcentagemUso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getEspacoUtilizadoMB() {
        return espacoUtilizadoMB;
    }

    public void setEspacoUtilizadoMB(double espacoUtilizadoMB) {
        this.espacoUtilizadoMB = espacoUtilizadoMB;
    }

    public double getPorcentagemUso() {
        return porcentagemUso;
    }

    public void setPorcentagemUso(double porcentagemUso) {
        this.porcentagemUso = porcentagemUso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}