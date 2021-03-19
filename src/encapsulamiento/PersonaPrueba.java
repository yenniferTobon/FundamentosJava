package encapsulamiento;

import java.net.SocketOption;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 7000000, false);
        System.out.println("Persona" + persona1.toString());  // el sop manda a llamar el toString automaticamente si esta definido en la clase
        imprimir(persona1);  // dentro de una clase estatica solo se pueden usar metodos estaticos
        // Dentro de un metodo estatico no se puede usar el this
    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
