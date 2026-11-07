package icc.pap.u1.patrones.estructurales.practica2;

public class AppNotificaciones {

    public static void main(String[] args) {
        
        System.out.println("CASO 1: Academica por correo");
        CanalEnvio correo = new CanalCorreo();
        Notificacion academica = new NotificacionAcademica(correo);
        academica.notificar("estudiante@universidad.edu","Sus calificaciones estan disponibles"
        );
        System.out.println("CASO 2: Administrativa por SMS");
        CanalEnvio sms = new CanalSMS();
        Notificacion administrativa = new NotificacionAdministrativa(sms);
        administrativa.notificar("0991234567","Existe un tramite pendiente"
        );

        
        System.out.println("CASO 3: Seguridad autorizada");
        CanalEnvio push = new CanalPush();
        CanalEnvio proxyPush = new ProxiCanalEnvio(push, true);
        Notificacion seguridad = new NotificacionSeguridad(proxyPush);
        seguridad.notificar("usuario123","Alerta de seguridad detectada"
        );

        // CASO 4: Académica sin autorización
        System.out.println("CASO 4: Academica sin autorizacion");
        CanalEnvio smsBloqueado = new ProxiCanalEnvio(
            new CanalSMS(), false
        );
        Notificacion academicaBloqueada = new NotificacionAcademica(smsBloqueado);
        academicaBloqueada.notificar("0987654321", "Sus calificaciones estan disponibles"
        );

        System.out.println("\nCASO 5: Reutilizacion del canal correo");
        CanalEnvio mismoCorreo = new CanalCorreo();
        Notificacion academica2 = new NotificacionAcademica(mismoCorreo);
        Notificacion administrativa2 = new NotificacionAdministrativa(mismoCorreo);
        
        academica2.notificar( "estudiante@universidad.edu","Nueva calificacion publicada"
        );
        administrativa2.notificar( "estudiante@universidad.edu","Tiene un tramite pendiente"
        );

       
        System.out.println("CASO 6: Seguridad con diferentes canales");
        CanalEnvio proxyCorreo = new ProxiCanalEnvio(
            new CanalCorreo(), true
        );
        CanalEnvio proxySMS = new ProxiCanalEnvio(
            new CanalSMS(), false
        );

        Notificacion seguridadCorreo = new NotificacionSeguridad(proxyCorreo);
        Notificacion seguridadSMS = new NotificacionSeguridad(proxySMS);

        seguridadCorreo.notificar("usuario123","Alerta de seguridad por correo"
        );
        seguridadSMS.notificar("0991234567","Alerta de seguridad por SMS"
        );
    }
}