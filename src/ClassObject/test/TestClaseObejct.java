package ClassObject.test;

import ClassObject.Empleado;

public class TestClaseObejct {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 5000); // cada vez que utilizamos la palabra new estamos reservando un espacio en memoria
        Empleado empleado2 = new Empleado("juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("tiene la misma referencia en memoria");
        }else{
            System.out.println("Tienen diferente referencia en memoria");
        }


        if (empleado1.equals(empleado2)){
            System.out.println("Los objetos tienen el mismo contenido");
        } else{
            System.out.println("Los objetos tienen el distinto contenido");
        }

    }
}
