
package edu.programacion.ejercicio2408;

/**
 * Representa un empleado de una empresa.
 */
public abstract class Empleado extends Persona {

    /**
     * Construye un empleado.
     *
     * @param nombre nombre completo
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo del empleado
     */
    public Empleado(String nombre, String dni, String direccion,
                    int anioNacimiento, String sexo) {
        super(nombre, dni, direccion, anioNacimiento, sexo);
    }

    /**
     * Calcula el salario del empleado.
     *
     * @return salario correspondiente
     */
    public abstract double calcularSalario();
}
