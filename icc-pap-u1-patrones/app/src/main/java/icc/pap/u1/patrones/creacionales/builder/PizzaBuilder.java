package icc.pap.u1.patrones.creacionales.builder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
*objBuilder
*pizzaBuilder acumlar las opciones de una pizza
* y crea el producto (Objeto (Pizza)) cuando se le pida
* al metodo contruir (buld)
*/
public final class PizzaBuilder {

    private String size;
    private Set<String> ingredientes;

    public PizzaBuilder(){
    this.size = "mediana";
    this.ingredientes = new HashSet<>();
    this.ingredientes.add("queso");


}
    // va a devolver la misma instacia del bulder el cual me permite agrgar mas informacion para crear el producto 
    // estos metodos acomuladores
    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }


    
    public PizzaBuilder addIng(String ing){
        this.ingredientes.add( ing);
        return this;

    }
    // Metodo de construccion 
    //devuelve el producto
    // solo devuelve
     public Pizza build(){
        return new Pizza(size, ingredientes );
     }


    
    
}
