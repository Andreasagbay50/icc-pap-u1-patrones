package icc.pap.u1.patrones.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Importador {
        //Factory method 
        // un metodo que va a crear una clase que me permita qde que tipo va a ser la implementacion 
    protected abstract LecturaLinea crearLector ();
    public final List<Lectura> importar (List <String > lecturas) {
        LecturaLinea lector = crearLector();
        List<Lectura> resultado = new ArrayList<>();
        for(String lectura : lecturas){
            if(lectura.isBlank())
                continue;
            try {
                resultado.add(lector.leer(lectura));

            }catch (Exception e) {
                throw new IllegalArgumentException("linea mal formada");
                
            }
        }
        return resultado;
    }
}