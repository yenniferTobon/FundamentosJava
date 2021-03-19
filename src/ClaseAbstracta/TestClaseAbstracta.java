package ClaseAbstracta;

public class TestClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo"); //No se pueden crear objetos de las clases abstractas
        figura.dibujar();
    }
}
