package clases;

public class PruebaPersona{
    // super() este super estaria llamando al constructor de la clase Object

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.edad = "31";
        persona.desplegarInfo();

    }
}

// Cuando se crea un constructor pasandole parametros el constructor vacio ya no se crea automaticamente.
// las variables q creo en un metodo solo se pueden usar en ese metodo
// un metodo Estatico solo puede invocar otro metodo estatico.
// las varibles de clase se pueden utilizar en cualquier metodo de la clase y en cualquier objeto creado de la clase.
// Todas las clases en Java heredan de la clase Object
// Los Objetos se pasan por valor
// Dentro del mismo Archivo solo podemos tener una clase publica, el resto de Clases se pueden utilizar en la clase publica o en el mismo paquete

