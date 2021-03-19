package PalabraFinal;

public final class Persona {  // La palabra final lo q significa es que de la clase persona no se podran heredar otras clases
    final int miVariable = 10; // la palabra final lo que hace es q este valor de 10 nunca cambiará
    public final static int constante = 1; // esta seria una variable constante la cual podemos utilizar sin necesidad de crear un objeto


    public final void imprimir(){ // Si este metodo pertenece a una clase q no sea final se podra heredar pero este ..
        System.out.println("Este metodo no se podra modificar en la clase hija");
    }
}


