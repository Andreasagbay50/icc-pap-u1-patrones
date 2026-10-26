package icc.pap.u1.patrones.creacionales.prototype;

public class PlantillaEmail {
    private String asunto;
    private String mensaje;

    public PlantillaEmail(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
    public PlantillaEmail clone(){
        return  new PlantillaEmail(asunto, mensaje);
    }
        // SETTER ASUNTO -> CON OTRO NOMBRE
    public  void cambiarAsunto (String newAsunto){
        this.asunto = newAsunto;
        
    }
    // GETTER DEL TOSTRING -> CON OTRO NOMBRE
    public String contenido (){
        return this.toString();
    }
    @Override
    public String toString() {
        return  asunto + " :" + mensaje  ;
    }
    
}
