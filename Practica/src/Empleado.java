public class Empleado extends Persona {

    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Empleado(String nombre, int edad, int sueldo, String apellido) {
        super(nombre, edad, sueldo);
        this.apellido = apellido;
    }

    

    
    
}
