package interfaces;

public class ImplementacionSql implements IAccesoDatos{  //esta implementacion no se puede poner abstract porq no se podria crear objetos de ella

    @Override
    public void insertar() {
        System.out.println("Insertar desde mySql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde mySql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde mySql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde mySql");
    }
}
