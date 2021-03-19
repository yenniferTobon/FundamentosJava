import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        var i = 31;
        var j = 33;
        System.out.println(i);
        var $variable = "Hola Dani";
        var _varible2 = "Otra forma permitida de declarar variables";
        var miVarible2 = "Otra forma permitida de declarar variables";
        System.out.println("miVarible2 = " + miVarible2);
        System.out.println(i + j + $variable + "-> 64Hola Dani ");
        System.out.println($variable + i + j + "-> Hola Dani 31 33");
        System.out.println($variable + (i + j) + "-> hola Dani 64");


        //"##########################################"
        System.out.println("Salto de linea: \n");
        System.out.println("Tabulador: \t");
        System.out.println("Retroceso imprime menos dos strings: \b\b");
        System.out.println("impresion comilla simple: \'"+ $variable + "\'");
        System.out.println("Impresion comilla doble: \""+ $variable + "\"");

        //"##########################################"
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();

        //"##########################################"
        // tipos primitivos en Java byte(8 bits), short(16bits), char(16bits), int(32 bits), long(64bits), float(32), double(64)
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        float numeroFloat = (float)3.4028235E38D;


       //"##########################################"
        char miCaracter = '!';
        char varChar = '\u0021';
        char varCharDecimal = 33;
        int letra = '!'; //--> imprime 33
        Boolean varBoolean = false;


        //"##################### Conversion de tipos #####################"
        //var esAdulto = edad >= 18;
        var edad = Integer.parseInt("20");  //para pasar de int a String
        //siempre q recibamos un int por consola siempre debemos de parsearlo
        var consola2 = new Scanner(System.in);
        edad = Integer.parseInt(consola2.nextLine());
        var edadTexto = String.valueOf(10); // para pasar de int a String


        //"###################### if else if####################"
        char l= "hola".charAt(0);

        if (2>3)
            System.out.println("menor");
        else if (2 == 3)
            System.out.println("igual");
        else
            System.out.println("Mayor");

        //"###################### switch ####################"
        var numero = 2;
        switch (numero){
            case 1: case 3: case 12:
                System.out.println("numero 1");
                break;
            case 2:
                System.out.println("numero 2");
                break;
            default:
                System.out.println("Numero no encontrado");
        }

        //"### while, Nota: la variable contador se puede usar tambien a fuera del ciclo while####"
        var contador = 0;
        while (contador < 3){
            System.out.println("muestra en pantalla hasta q contador sea menor a 3");
            contador++;
        }

        var contadorDo = 0;
        do{
            System.out.println("Simepre ingresa a realizar la sentencia minimo 1 vez");
            contadorDo++;
        }while(contadorDo < 3);

        //"######################### ciclo for, z solo se usa en el ciclo##########################"
        for(var z = 0; z<3; z++){
            System.out.println("z es una variable local, y solo se ejecuta si la condicion es verdadera");
        }


        //"###################################################"
        var c = true;
        var d = !c;
        var e = 3;
        var f = ++e; //primero incrementa e y luego la usa
        var g = e++;  //primero usa la varible e y luego la usa imprimer e = 4 y g = 3

        //"################### ==   != #######################"
        var k= (2 == 3);
        var cadena = "Hola".equals("Adios"); //--> false compara el contenido de Strings
        var cadena2 = "Hola" =="Adios"; //--> false compara las posiciones de memoria de las variables

        //"################### operador ternario #######################"
        //Solo cuando las operaciones son sencillas
        var resultado = (3 > 2)? "verdadero": "falso";


    }
}

