package icc.pap.u1.patrones.comportamiento.observer2;

import java.util.function.Consumer;



public class SeguimientoAsistencia implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("inasistencias")) {
            return;
        }

        int nuevo = (int) cambio.nuevo();
        if ( nuevo <= 2) {
            System.out.println("\n[ASISTENCIA] Normal " + cambio.estudiante());
        }else if (nuevo <=5) {
            System.out.println("\n[ASISTENCIA] Advertencia " + cambio.estudiante());
        }else {
            System.out.println("\n[ASISTENCIA] Critico " + cambio.estudiante());
        }
    }

}