
package edu.programacion.ejercicio2410;

import java.util.Objects;

/**
 * Representa una persona del sistema.
 */
public class Persona {

    private final String nombre;
    private final String apellido;
    private final String dni;

    /**
     * Construye una persona.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param dni documento de identidad
     */
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.dni = Objects.requireNonNull(dni);
    }

    /**
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Compara personas por DNI.
     *
     * @param objeto objeto a comparar
     * @return true si representan la misma persona
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
     * Calcula el hash de la persona.
     *
     * @return hash del DNI
     */
    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    /**
     * Representa una persona como texto.
     *
     * @return nombre y apellido
     */
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
