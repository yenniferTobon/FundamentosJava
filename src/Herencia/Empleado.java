package Herencia;
import encapsulamiento.Persona;

public class Empleado extends Persona {   //Java solo soporte herencia simple
    public Empleado(String nombre, double sueldo, boolean eliminado) {
        super(nombre, sueldo, eliminado);  // los constructores del padre no se heredan pero podemos acceder a ellos por medio de la palabra super
    }

    @Override
    public String toString(){   // Es mejor este metodo q el normal ya q por cada + se creo un objeto String el cual no es modificable
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado [nombre=").append(this.getNombre());
        sb.append(']').append(super.toString());
        return sb.toString();
    }
}