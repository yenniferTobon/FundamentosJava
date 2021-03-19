package interfaces;

public interface IAccesoDatos {
    int MAXREGISTRO = 10; // en la interfaces por defecto las variables son static y final
                            // y siempre debemos de colocar el valor de la variables ya que
                            // una interfaz no tiene constructores, solo tiene metodos estaticos
    void insertar();
    void listar();
    void actualizar();      //estos metodos siempren seran abstractos por estar dentro de una interfaz
    void eliminar();        //Asi yo no lo defina
}
