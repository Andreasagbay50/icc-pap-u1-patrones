public class Constructor<T extends Persona, V extends T> {

    private T primero;
    private V segundo;

    public T getPrimero() {
        return primero;
    }



    public void setPrimero(T primero) {
        this.primero = primero;
    }



    public V getSegundo() {
        return segundo;
    }



    public void setSegundo(V segundo) {
        this.segundo = segundo;
    }



    public Constructor(T primero, V segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public static <T extends Comparable> comparar(T primero, T segundo){
        if (primero.getClass().getsueld) {
            
        }

    }
}
