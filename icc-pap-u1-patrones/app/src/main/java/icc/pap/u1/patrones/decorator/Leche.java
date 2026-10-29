package icc.pap.u1.patrones.decorator;
/** 
 * 
 * leche es DEcorador que envuelve a una bebida 
 * BEBIDA-> genereal puede ser cualquiere cualquiera como un cafe 
 * un expreso , choculate
 */

public final class Leche implements Bebida {
    protected Bebida bebida;

    public Leche(Bebida bebida){
        this.bebida= bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + "leche";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.50;
    }
    
}
