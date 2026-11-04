
package edu.programacion.ejercicio2406;

/**
 * Representa un personaje interpretado por un actor.
 */
public class Personaje {

    private final String nombre;
    private final Actor interpretadoPor;

    /**
     * Crea un personaje.
     *
     * @param nombre nombre del personaje
     * @param interpretadoPor actor que lo interpreta
     */
    public Personaje(String nombre, Actor interpretadoPor) {
        this.nombre = nombre;
        this.interpretadoPor = interpretadoPor;
    }

    /**
     * Obtiene el nombre del personaje.
     *
     * @return nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el actor que interpreta al personaje.
     *
     * @return actor del personaje
     */
    public Actor getInterpretadoPor() {
        return interpretadoPor;
    }
}
