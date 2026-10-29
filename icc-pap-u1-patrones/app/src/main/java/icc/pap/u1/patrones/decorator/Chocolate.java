package icc.pap.u1.patrones.decorator;

public class Chocolate implements Bebida {
    protected Bebida bebida;
    public Chocolate(Bebida bebida){
        this.bebida = bebida;
    }


    @Override
    public String descripcion() {
        return bebida.descripcion() + " chocolatito ";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.75;
        
    }

    
}
