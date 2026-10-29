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
        System.out.println("Caso 1. Cargador antiguo con registro");
        CargadorAntiguo cargador= new CargadorAntiguo();
        Cargador cargadorA= new AdaptadorCargador(cargador);
        Cargador c1 = new DecoradorRegistro(cargadorA);
        c1.cargarCelular();
        System.out.println("Caso 2. Cargador inalámbrico con seguridad permitida" );
        CargadorInalambrico cargador2= new CargadorInalambrico();
        Cargador cargadorA2= new AdaptadorCargadorIna(cargador2);
        Cargador c2= new DecoradorSeguridad(cargadorA2,true);
        c2.cargarCelular();
        System.out.println("Caso 3. Cargador antiguo con seguridad bloqueada");
        Cargador c3= new DecoradorSeguridad(cargadorA2, false);
        c3.cargarCelular();
        System.out.println("Caso 4. Cargador inalámbrico con dos decoradores");
        Cargador c4= new DecoradorSeguridad(new DecoradorRegistro(cargadorA2), true);
        c4.cargarCelular();

    }
    
}
