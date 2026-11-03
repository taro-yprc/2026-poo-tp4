
package edu.programacion.ejercicio2404;

/**
 * Representa una figura geometrica circular.
 */
public class Circulo extends Figura {

    private double radio;

    /**
     * Crea un circulo con radio y color.
     *
     * @param radio radio del circulo
     * @param color color del circulo
     */
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    /**
     * Obtiene el radio del circulo.
     *
     * @return radio del circulo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Modifica el radio del circulo.
     *
     * @param radio nuevo radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el area del circulo.
     *
     * @return area del circulo
     */
    @Override
    public Double getArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Imprime la figura y su color.
     */
    @Override
    public void pintar() {
        System.out.println("Pintando CIRCULO " + getColor());
    }
}
