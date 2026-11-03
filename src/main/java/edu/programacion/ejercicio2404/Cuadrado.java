
package edu.programacion.ejercicio2404;

/**
 * Representa una figura geometrica cuadrada.
 */
public class Cuadrado extends Figura {

    private double lado;

    /**
     * Crea un cuadrado con un lado y un color.
     *
     * @param lado longitud del lado
     * @param color color del cuadrado
     */
    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    /**
     * Obtiene la longitud del lado.
     *
     * @return longitud del lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Modifica la longitud del lado.
     *
     * @param lado nueva longitud
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula el area del cuadrado.
     *
     * @return area del cuadrado
     */
    @Override
    public Double getArea() {
        return lado * lado;
    }

    /**
     * Imprime la figura y su color.
     */
    @Override
    public void pintar() {
        System.out.println("Pintando CUADRADO " + getColor());
    }
}
