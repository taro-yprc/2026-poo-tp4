
package edu.programacion.ejercicio2408;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una empresa y sus empleados.
 */
public class Empresa {

    private final String nombre;
    private final List<Empleado> empleados;

    /**
     * Construye una empresa.
     *
     * @param nombre nombre de la empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    /**
     * Agrega un empleado a la empresa.
     *
     * @param empleado empleado que se agrega
     */
    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            empleados.add(empleado);
        }
    }

    /**
     * Calcula el total de salarios.
     *
     * @return monto total que debe pagar la empresa
     */
    public double montoTotal() {
        double total = 0.0;

        for (Empleado empleado : empleados) {
            total += empleado.calcularSalario();
        }

        return total;
    }

    /**
     * @return nombre de la empresa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return cantidad de empleados
     */
    public int cantidadEmpleados() {
        return empleados.size();
    }

    /**
     * @return copia de la lista de empleados
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
