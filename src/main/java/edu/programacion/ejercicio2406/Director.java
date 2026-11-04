
package edu.programacion.ejercicio2406;

/**
 * Representa un director.
 */
public class Director {

    private final String nombre;
    private final String apellido;

    /**
     * Crea un director.
     *
     * @param nombre nombre del director
     * @param apellido apellido del director
     */
    public Director(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre del director
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido.
     *
     * @return apellido del director
     */
    public String getApellido() {
        return apellido;
    }
}
