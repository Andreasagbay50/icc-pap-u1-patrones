package icc.pap.u1.patrones.creacionales.builder;

import java.util.List;
import java.util.Set;

/* *
*
*Pizza clase inmitable
*
* representa una pizza ya configurada
*/
public  final class Pizza {
    private final String size;
    private final Set<String> ingredientes;
    
       
    public Pizza(String size, Set<String> ingredientes) {
        this.size = size;
        this.ingredientes = ingredientes;
    }


    public String descripcion (){
        return "Pizza" + size + " con : " + ingredientes ;
    }

    


    
}
