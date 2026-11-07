package icc.pap.u1.patrones.estructurales.practica2;

public class CanalPush implements CanalEnvio {

    @Override
    public void enviar(String destinario, String mensaje) {
        System.out.println("Destinatario " + destinario + "push : " + mensaje);

    }

    
    
}
