package encapsulamiento;

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    private static int contadorPersona;

    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        Persona.contadorPersona++;  // por esta variable de static es decir de clase para invocarla se debe colocar primero el nombre de la clase
        this.eliminado = eliminado;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public static int getContadorPersona(){
        return contadorPersona;
    }
    public static void setcontadorPersona(int contadorPersona){
        contadorPersona = contadorPersona;
    }

    public boolean isEliminado(){        //siempre en los tipos boolean para retornar el valor el metodo se llaama is en vez de get
        return this.eliminado;
    }
    public void setEliminado(boolean elimando){
        this.eliminado = elimando;
    }

    @Override //Se utiliza para indicar que se esta sobreescribiendo el metodo toString q es heredado de la clase Object
    public String toString(){
        return "Persona [nombre: " + this.nombre + ", sueldo: " + this.sueldo + ", Eliminado: " + this.eliminado + "]";
    }
}
