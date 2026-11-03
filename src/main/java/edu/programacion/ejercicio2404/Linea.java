
package edu.programacion.ejercicio2404;

/**
 * Representa una linea geometrica.
 */
public class Linea extends Figura {

    private double longitud;

    /**
     * Crea una linea con longitud y color.
     *
     * @param longitud longitud de la linea
     * @param color color de la linea
     */
    public Linea(double longitud, String color) {
        super(color);
        this.longitud = longitud;
    }

    /**
     * Obtiene la longitud de la linea.
     *
     * @return longitud de la linea
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Modifica la longitud de la linea.
     *
     * @param longitud nueva longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene el area de la linea.
     *
     * @return cero porque una linea no tiene area
     */
    @Override
    public Double getArea() {
        return 0.0;
    }

    /**
     * Imprime la figura y su color.
     */
    @Override
    public void pintar() {
        System.out.println("Pintando LINEA " + getColor());
    }
}
