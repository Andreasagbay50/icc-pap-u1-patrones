package icc.pap.u1.patrones.estructurales.adapter;

public class AdaptadorCargadorIna implements Cargador {
    private final CargadorInalambrico cInalambrio;
    public AdaptadorCargadorIna(CargadorInalambrico cInalambrico){
        this.cInalambrio = cInalambrico;
    }

    @Override
    public void cargarCelular() {

        cInalambrio.cargarBase();
        
    }
    
}
