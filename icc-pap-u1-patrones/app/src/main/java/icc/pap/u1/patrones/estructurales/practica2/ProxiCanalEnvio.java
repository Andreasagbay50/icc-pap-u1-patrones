package icc.pap.u1.patrones.estructurales.practica2;

public class ProxiCanalEnvio implements CanalEnvio {
    private CanalEnvio canalReal;
    private boolean autorizado;
    public ProxiCanalEnvio(CanalEnvio canalReal, boolean autorizado) {
        this.canalReal = canalReal;
        this.autorizado = autorizado;
    }
    @Override
    public void enviar(String destinario, String mensaje) {
        System.out.println("Vereficando Autorizacion....");

        if (autorizado ){
            canalReal.enviar(destinario, mensaje);
        }else{
            System.out.println("Envio bloqueado : usuario no autorizado");
        }
        
    }
    

    

    

    
}
