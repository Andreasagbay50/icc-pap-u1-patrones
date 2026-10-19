package icc.pap.u1.patrones;

import icc.pap.u1.patrones.creacionales.BuilderDemo;

public class App {

    public static void main(String[] args) {
        
        runBuilder();

    }

    
    private static void runBuilder() {
        System.out.println();
        System.out.println("Funcionamiento de patron Builder");
        System.out.println();
        // Creamos el objeto
        BuilderDemo x = new BuilderDemo()
                .setAsignatura("Progamación Aplicada")
                .setJornada("Diurna");
        // Imprimimos
        x.mostrarDatos();
        System.out.println(5
            
        );

    }
}
