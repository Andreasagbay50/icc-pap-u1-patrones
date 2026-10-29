package icc.pap.u1.patrones.decorator;

public class AppDecorator {
    public static void main(String[] args) {
        //-> cafe simple

        Bebida bebida = new CafeSimple();
        Bebida bebida2 = new Leche(bebida);
        
        Bebida bebida3 = new Chocolate(bebida);
        Bebida bebida4 = new Chocolate(bebida2 );
        Bebida bebida5 = new Leche(bebida3);
        Bebida bebida6 =    new Leche(new Chocolate(bebida3));
        


        System.out.println( bebida.descripcion()   +   " $ " + bebida.precio());
        System.out.println( bebida2.descripcion()  +   " $ " + bebida2.precio());
        System.out.println(bebida3.descripcion() + " $   "  + bebida3.precio());
        System.out.println(bebida4.descripcion());
        System.out.println(bebida5.descripcion());
        System.out.println(bebida6.descripcion());


        
        
    }
}
