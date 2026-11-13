package icc.pap.u1.patrones.comportamiento.observer2;

import java.util.function.Consumer;

public class SeguimientoAcademico implements Consumer<CambioEstudiante>{

    @Override
    public void accept(CambioEstudiante cambio) {
        if(!cambio.atributo().equals("promedio")){
        return ;
        }
        double anterior = (double) cambio.anterior();
        double nuevo = (double) cambio.nuevo();
        if(anterior >= 7.0 && nuevo <7.8){
        System.out.println("\n[ACADEMICO] Bajo rendimiento" + cambio.estudiante());


        }
        if(anterior < 7.0 && nuevo >= 7.0){
            System.out.println(
                "\n[ACADEMICO] Recuperacion academica" + cambio.estudiante()
            );
        }
       
    }
    
}
