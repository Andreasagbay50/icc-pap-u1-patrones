package icc.pap.u1.patrones.comportamiento.observer2;

public  record CambioEstudiante (
    Estudiante estudiante,
   String atributo,
    Object anterior,
    Object nuevo) {
 
}

