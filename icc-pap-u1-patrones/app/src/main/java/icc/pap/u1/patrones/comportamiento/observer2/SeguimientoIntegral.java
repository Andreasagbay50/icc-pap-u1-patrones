package icc.pap.u1.patrones.comportamiento.observer2;

import java.util.function.Consumer;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante estudiante = cambio.estudiante();
        double promedio = estudiante.getPromedio();
        int inasistencias = estudiante.getInasistencias();
        Matricula estado = estudiante.getEstado();

        // Se añade la validación (estado != null) antes de usar .toString()
        if (promedio < 7 && inasistencias >= 6 && estado != null && estado.toString().equals("ACTIVO")) {
            System.out.println("\n[SEGUIMIENTO INTEGRAL] Riesgo integral " + cambio.estudiante());
        }
    }
}