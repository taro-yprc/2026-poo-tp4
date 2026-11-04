
package edu.programacion.ejercicio2408;

/**
 * Representa los datos personales de una persona.
 */
public class Persona {

    private final String nombre;
    private final String dni;
    private final String direccion;
    private final int anioNacimiento;
    private final String sexo;

    /**
     * Construye una persona.
     *
     * @param nombre nombre completo
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo de la persona
     */
    public Persona(String nombre, String dni, String direccion,
                   int anioNacimiento, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.anioNacimiento = anioNacimiento;
        this.sexo = sexo;
    }

    /**
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return año de nacimiento
     */
    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    /**
     * @return sexo de la persona
     */
    public String getSexo() {
        return sexo;
    }
}
