package icc.pap.u1.patrones;

import java.util.List;

import icc.pap.u1.patrones.creacionales.BuilderDemo;
import icc.pap.u1.patrones.creacionales.builder.Pizza;
import icc.pap.u1.patrones.creacionales.builder.PizzaBuilder;
import icc.pap.u1.patrones.creacionales.practica.ConfiguracionSistema;
import icc.pap.u1.patrones.creacionales.practica.Pedido;
import icc.pap.u1.patrones.creacionales.prototype.PlantillaEmail;
import icc.pap.u1.patrones.factoryMethod.Importador;
import icc.pap.u1.patrones.factoryMethod.ImportadorPuntoComa;

public class App {

    public static void main(String[] args) {

       // runBuilder();
       // runFactoryMethod();
       // runPrototype();
      // runBuilder2();
      runPractica();

    }

    private static void runPractica() {
        ConfiguracionSistema config1 =
                ConfiguracionSistema.getInstancia();

        config1.setImpuestos(15.0);

        System.out.println("Configuración del sistema");
        System.out.println("Impuesto: " +
                config1.getImpuestos() + "%");

        Pedido pedido1 = Pedido.crearPresencial(
                "P001", "Ana Torres", 100.00);

        Pedido pedido2 = Pedido.crearEnLinea(
                "P002", "Juan Pérez", 200.00);

        System.out.println("Pedido presencial ");
        pedido1.procesar();

        System.out.println("Pedido en línea");
        pedido2.procesar();

        ConfiguracionSistema config2 =
                ConfiguracionSistema.getInstancia();

        System.out.println("Configuración compartida: "
                + (config1 == config2));
    }

    

    private static void runBuilder2() {
        Pizza pizza = new PizzaBuilder()
        .addIng("Jamon")
        .setSize("large")
        .addIng("Queso")
        .addIng("salami") 
        .build();
        System.out.println(pizza.descripcion());
        
    }

    private static void runPrototype() {
        PlantillaEmail pEmail = new PlantillaEmail("aviso ", "pedido listo");
        PlantillaEmail pEmailSolicutud = pEmail.clone();
        pEmailSolicutud.cambiarAsunto("Solicutud");
        System.out.println(pEmail);
        System.out.println(pEmailSolicutud.contenido());
    
    }

    private static void runFactoryMethod() {
        Importador impPC = new ImportadorPuntoComa();
        //implemento crear lector 

        System.out.println(impPC.importar(List.of("S01;22.5 C", "S02;18;c")));
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
