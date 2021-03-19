package Excepciones;

import Excepciones.OperacionException;

import static Excepciones.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionException e) {     //comenzar con la de menor Gerarquia y las ultimas son de mas gerarquia
            System.out.println("ocurrio un error de tipo OperacionException");
        } catch (Exception e) {
            System.out.println("ocurrio un error de tipo Exception");
            System.out.println(e.getMessage());
        } finally {  // Siempre q tenemos un try catch y un finally esto quiere decir q siempre se hara lo q esta en el finally alla o no excepcion
            System.out.println("Se reviso la division entre cero"); // este finally se usa normalmente para cerrar la conexion a la base de datos.
        }
        System.out.println("Resultado = " + resultado);
    }
}
