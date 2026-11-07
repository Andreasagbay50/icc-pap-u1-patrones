package icc.pap.u1.patrones.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

/**    (non-Javadoc)
     * comppsite porque agrupo productos elementoMunu
     * y calcula un precio en este caso en la sumatroria de todos
     * los elementosMenui
     * 
     */
public class GrupoMenu implements ElementoMenu {
   private List<ElementoMenu> items ;

   

    public GrupoMenu() {
        items = new ArrayList<>();
}



    @Override
    public double precio() {
        // la sumatoria de todos
      //  double suma = 0 ;
        //for (ElementoMenu elementoMenu : items) {
            //suma = suma + elementoMenu.precio();
            
       //() }
        //return  suma;
        return items.stream().mapToDouble(ElementoMenu::precio).sum();
        
    } 
    public void addItem(ElementoMenu item){
        this.items.add(item);

    }

    

    
}
