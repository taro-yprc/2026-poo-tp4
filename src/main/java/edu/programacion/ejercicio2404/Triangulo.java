
package edu.programacion.ejercicio2404;

/**
 * Representa una figura geometrica triangular.
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    /**
     * Crea un triangulo con base, altura y color.
     *
     * @param base base del triangulo
     * @param altura altura del triangulo
     * @param color color del triangulo
     */
    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene la base del triangulo.
     *
     * @return base del triangulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Modifica la base del triangulo.
     *
     * @param base nueva base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del triangulo.
     *
     * @return altura del triangulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Modifica la altura del triangulo.
     *
     * @param altura nueva altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el area del triangulo.
     *
     * @return area del triangulo
     */
    @Override
    public Double getArea() {
        return base * altura / 2.0;
    }

    /**
     * Imprime la figura y su color.
     */
    @Override
    public void pintar() {
        System.out.println("Pintando TRIANGULO " + getColor());
    }
}
