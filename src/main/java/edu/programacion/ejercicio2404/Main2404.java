
package edu.programacion.ejercicio2404;

/**
 * Ejecuta una demostracion del editor de figuras.
 */
public class Main2404 {

    /**
     * Prueba las operaciones del editor.
     *
     * @param args argumentos de ejecucion
     */
    public static void main(String[] args) {
        EditorFiguras editor = new EditorFiguras();

        Cuadrado cuadrado = new Cuadrado(5, "ROJO");
        Circulo circulo = new Circulo(3, "AZUL");
        Triangulo triangulo = new Triangulo(10, 6, "VERDE");
        Linea linea = new Linea(15, "NEGRO");

        editor.agregarFigura(cuadrado);
        editor.agregarFigura(circulo);
        editor.agregarFigura(triangulo);
        editor.agregarFigura(linea);

        System.out.println("Figuras del editor:");
        editor.pintar();

        System.out.println("Area total: " + editor.calcularArea());

        editor.eliminarFigura(circulo);

        System.out.println("Area despues de eliminar el circulo: "
                + editor.calcularArea());
    }
}
