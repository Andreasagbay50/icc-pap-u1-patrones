package icc.pap.u1.patrones.estructurales.facade;

public class CiniEnCasa {
    private final Proyector proyector;
    private final Reproductor reproductor;
    public CiniEnCasa(Proyector proyector, Reproductor reproductor) {
        this.proyector = new Proyector();
        this.reproductor = new Reproductor();
    }
    public void iniciarPeluculas(String nombre){
        proyector.encender();
        reproductor.reproducir(nombre);

    }

}
