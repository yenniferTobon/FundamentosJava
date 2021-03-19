package Excepciones;
import Excepciones.OperacionException;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionException {  //static para que no tengamos que crear objetos
        if(denominador == 0){
            throw new OperacionException("Division entre cero");
        }
        return numerador/denominador;
    }
}
