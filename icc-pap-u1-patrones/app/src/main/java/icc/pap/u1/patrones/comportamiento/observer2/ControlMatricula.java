package icc.pap.u1.patrones.comportamiento.observer2;

import java.util.function.Consumer;

public class ControlMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("estado")) {
            return;
        }

        Matricula anterior = (Matricula) cambio.anterior();
        Matricula nuevo = (Matricula) cambio.nuevo();

        if (nuevo != null) {
            String strNuevo = nuevo.toString();
            
            if (strNuevo.equals("SUSPENDIDO")) {
                System.out.println("\n[ESTADO MATRICULA] Estudiante Suspendido " + cambio.estudiante());
            } else if (strNuevo.equals("RETIRADO")) {
                System.out.println("\n[ESTADO MATRICULA] Estudiante Retirado " + cambio.estudiante());
            } else if (anterior != null && anterior.toString().equals("SUSPENDIDO") && strNuevo.equals("ACTIVO")) {
                System.out.println("\n[ESTADO MATRICULA] Estudiante ha sido reactivado " + cambio.estudiante());
            }
        }
    }
}