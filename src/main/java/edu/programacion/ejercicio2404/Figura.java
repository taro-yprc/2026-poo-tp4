
package edu.programacion.ejercicio2404;

/**
 * Representa una figura geometrica con color y area.
 */
public abstract class Figura {

    private String color;

    /**
     * Crea una figura con un color.
     *
     * @param color color inicial de la figura
     */
    public Figura(String color) {
        this.color = color;
    }

    /**
     * Modifica el color de la figura.
     *
     * @param color nuevo color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el color de la figura.
     *
     * @return color actual
     */
    public String getColor() {
        return color;
    }

    /**
     * Calcula el area de la figura.
     *
     * @return area de la figura
     */
    public abstract Double getArea();

    /**
     * Imprime la figura y su color.
     */
    public abstract void pintar();
}
