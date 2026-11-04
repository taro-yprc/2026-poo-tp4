
package edu.programacion.ejercicio2406;

/**
 * Representa un actor.
 */
public class Actor {

    private final String nombre;
    private final String apellido;

    /**
     * Crea un actor.
     *
     * @param nombre nombre del actor
     * @param apellido apellido del actor
     */
    public Actor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre del actor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido.
     *
     * @return apellido del actor
     */
    public String getApellido() {
        return apellido;
    }
}
