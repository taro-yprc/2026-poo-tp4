
package edu.programacion.ejercicio2408;

/**
 * Representa un empleado administrativo.
 */
public class Administrativo extends Empleado {

    private static final double[] SUELDOS_BASE = {
            100000.0, 150000.0, 200000.0, 250000.0
    };

    private final int categoria;
    private final int antiguedad;

    /**
     * Construye un administrativo.
     *
     * @param nombre nombre completo
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo del empleado
     * @param categoria categoria entre 1 y 4
     * @param antiguedad años de antiguedad
     */
    public Administrativo(String nombre, String dni, String direccion,
                          int anioNacimiento, String sexo,
                          int categoria, int antiguedad) {
        super(nombre, dni, direccion, anioNacimiento, sexo);

        if (categoria < 1 || categoria > 4) {
            throw new IllegalArgumentException(
                    "La categoria debe estar entre 1 y 4");
        }

        if (antiguedad < 0) {
            throw new IllegalArgumentException(
                    "La antiguedad no puede ser negativa");
        }

        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

    /**
     * @return categoria del administrativo
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @return años de antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Calcula el salario segun categoria y antiguedad.
     *
     * @return salario del administrativo
     */
    @Override
    public double calcularSalario() {
        return SUELDOS_BASE[categoria - 1] * antiguedad;
    }
}
