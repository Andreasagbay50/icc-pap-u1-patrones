
package icc.pap.u1.patrones.creacionales.practica;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;
    private double impuesto;

    private ConfiguracionSistema(double impuesto) {
        this.impuesto = impuesto;
    }

    public static synchronized ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema(15.0);
        }
        return instancia;
    }

    public double getImpuestos() {
        return impuesto;
    }

    public void setImpuestos(double impuesto) {
        this.impuesto = impuesto;
    }
}
