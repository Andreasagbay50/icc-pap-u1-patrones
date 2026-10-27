
package icc.pap.u1.patrones.creacionales.practica;

public abstract class Pedido {

    private String codigo;
    private String cliente;
    private double subtotal;

    public Pedido(String codigo, String cliente, double subtotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public static Pedido crearPresencial(
            String codigo, String cliente, double subtotal) {
        return new PedidoPresencial(codigo, cliente, subtotal);
    }

    public static Pedido crearEnLinea(
            String codigo, String cliente, double subtotal) {
        return new PedidoEnLinea(codigo, cliente, subtotal);
    }

    public void procesar() {
        double porcentaje =
                ConfiguracionSistema.getInstancia().getImpuestos();

        double impuestoCalculado = subtotal * (porcentaje / 100);
        double total = subtotal + impuestoCalculado;

        System.out.println(  "Cliente: " + cliente + "Subtotal: "+ subtotal + "Impuesto: "+ impuestoCalculado + 
            "Total:"+ total );
    

        generarComprobante();
    }

    protected abstract void generarComprobante();
}
