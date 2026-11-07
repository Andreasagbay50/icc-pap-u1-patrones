package icc.pap.u1.patrones.estructurales.flyweight;

public class AppFlyweight {
    public static void main(String[] args) {
        CacheComponentes cache = new CacheComponentes();
        ComponenteVisual boton1 = cache.get("Boton" , "Azul" , " 24px");
        ComponenteVisual boton2 = cache.get("Boton" , "Azul" , " 24px");
        ComponenteVisual card = cache.get("Boton" , "Azul" , " 12px");

        boton1.dibujar("Guardar", 10, 20);
        boton2.dibujar("Cancelar", 100, 20);
        card.dibujar("Opciones", 5, 25);

        System.out.println(boton1 == boton2);
    }
    
    
}
