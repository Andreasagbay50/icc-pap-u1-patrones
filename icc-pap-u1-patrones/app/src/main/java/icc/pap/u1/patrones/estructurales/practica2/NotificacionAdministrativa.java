package icc.pap.u1.patrones.estructurales.practica2;

public class NotificacionAdministrativa extends Notificacion {

    public NotificacionAdministrativa(CanalEnvio canal) {
        super(canal);
       
    }

    @Override
    public void notificar(String destinario, String mensaje) {
        mensaje = "[ADMINISTRATIVO] " + mensaje;

        canal.enviar(destinario, mensaje);
       
    }
    
}
