package icc.pap.u1.patrones.estructurales.adapter;

public class AppAdapter {

    public static void main(String[] args){
        // CARGAR MI CELULAR CON UN CARGADOR
        //PERO COMO AHORA TENGO UN CA DEBO CREAR UN CONECTOR
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        Cargador cargor1 = new AdaptadorCargador(cAntiguo);
        CargadorInalambrico cIlambrico = new CargadorInalambrico();
        Cargador cargor2 = new AdaptadorCargadorIna(cIlambrico);

        // CARGAR EL CELULAR
        // SI EL CARGADOR ES ANTIGUO
        cargor1.cargarCelular();
        cargor2.cargarCelular();

    }
    
}
