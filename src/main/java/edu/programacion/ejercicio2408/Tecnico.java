
package edu.programacion.ejercicio2408;

/**
 * Representa un tecnico con salario fijo por contrato.
 */
public class Tecnico extends Empleado {

    private final String titulo;
    private final double salarioContrato;

    /**
     * Construye un tecnico.
     *
     * @param nombre nombre completo
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo del empleado
     * @param titulo titulo profesional
     * @param salarioContrato salario fijo contratado
     */
    public Tecnico(String nombre, String dni, String direccion,
                   int anioNacimiento, String sexo, String titulo,
                   double salarioContrato) {
        super(nombre, dni, direccion, anioNacimiento, sexo);
        this.titulo = titulo;
        this.salarioContrato = salarioContrato;
    }

    /**
     * @return titulo del tecnico
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return salario establecido por contrato
     */
    @Override
    public double calcularSalario() {
        return salarioContrato;
    }
}
