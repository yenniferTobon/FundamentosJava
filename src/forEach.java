public class forEach {
    public static void main(String[] args) {
        int edades[] = {1, 5, 8, 9};    // no esta permitido utilizar la palabra var en arrays
        for (int edad: edades){    //No se recomienda usar si necesitamos saber la iteración en la q estamos
            System.out.println("edad = " + edad);
        }
    }
}
