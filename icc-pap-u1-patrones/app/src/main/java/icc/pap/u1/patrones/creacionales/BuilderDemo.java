package icc.pap.u1.patrones.creacionales; 
public class BuilderDemo {
    
    private String asignatura;
    private String jornada;

    // Método que configura la asignatura y devuelve la misma instancia para encadenar
    public BuilderDemo setAsignatura(String asignatura) {
        this.asignatura = asignatura;
        return this;
    }

    // Método que configura la jornada y devuelve la misma instancia para encadenar
    public BuilderDemo setJornada(String jornada) {
        this.jornada = jornada;
        return this;
    }

    // Método para imprimir los valores configurados
    public void mostrarDatos() {
        System.out.println("Asignatura configurada: " + asignatura);
        System.out.println("Jornada configurada: " + jornada);
    }
}