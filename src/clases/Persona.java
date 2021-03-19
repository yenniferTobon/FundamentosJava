//################# clases ###############
package clases;

public class Persona {
    String nombre;
    String edad;

    // A este metodo desplegarInfo se puede accede desde cualquier punto afuera de la clase por ser publico
    // a los atributos se pueden acceder desde cualquier parte de la clase

    public void desplegarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("imprimir el objeto persona" + this);
    }

    public static void main(String[] args) {

    }
}