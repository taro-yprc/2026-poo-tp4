
package edu.programacion.ejercicio2407;

import java.util.Objects;

/**
 * Representa una persona identificada por su DNI.
 */
public class Persona {

    private final String nombre;
    private final String apellido;
    private final String dni;

    /**
     * Crea una persona.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param dni documento de identidad
     */
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = Objects.requireNonNull(dni);
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido.
     *
     * @return apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el DNI.
     *
     * @return DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Compara personas por DNI.
     *
     * @param objeto objeto que se compara
     * @return true si tienen el mismo DNI
     */

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof Persona otraPersona)) {
            return false;
        }

        return dni.equals(otraPersona.dni);
    }


    /**
     * Calcula el hash a partir del DNI.
     *
     * @return hash del DNI
     */
    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    /**
     * Representa la persona como texto.
     *
     * @return nombre, apellido y DNI
     */
    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + dni + ")";
    }
}
