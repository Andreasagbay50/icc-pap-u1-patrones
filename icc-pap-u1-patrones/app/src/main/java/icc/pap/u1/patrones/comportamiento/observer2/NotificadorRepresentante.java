package icc.pap.u1.patrones.comportamiento.observer2;

import java.util.function.Consumer;



public class NotificadorRepresentante implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante estudiante = cambio.estudiante();
        String atributo = cambio.atributo();

        if (atributo.equals("promedio")) {
            double nuevoPromedio = (double) cambio.anterior();
            if (nuevoPromedio < 6.0) {
                System.out.println("\n[REPRESENTANTE] Notificacion para el representante de " + estudiante.getNombre() +
                        ": El promedio se encuetra nivel crítico de " + nuevoPromedio);
            }
        }

        if (atributo.equals("inasistencias")) {
            int nuevasInasistencias = (int) cambio.nuevo();
            if (nuevasInasistencias >= 8) {
                System.out.println("\n[REPRESENTANTE] Notificacion para el representante de " + estudiante.getNombre() +
                        ": El estudiante acumula " + nuevasInasistencias + " inasistencias.");
            }
        }

        if (atributo.equals("estado")) {
            Matricula nuevoEstado = (Matricula) cambio.nuevo();
            if (nuevoEstado.toString().equals("SUSPENDIDO")) {
                System.out.println(
                        "\n[REPRESENTANTE]  Notificación oficial al representante de :"+ estudiante.getNombre()+ " El estado de la matricula ha cambiado a SUSPENDIDO.");
            }
        }
    }
}