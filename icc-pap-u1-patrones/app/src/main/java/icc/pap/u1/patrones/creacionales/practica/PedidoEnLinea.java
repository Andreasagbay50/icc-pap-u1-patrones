package icc.pap.u1.patrones.creacionales.practica;

public final class PedidoEnLinea extends Pedido {

    public PedidoEnLinea(
            String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Confirmación digital generada.");
    }
}
