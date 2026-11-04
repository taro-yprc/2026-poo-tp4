
package edu.programacion.ejercicio2408;

/**
 * Ejecuta el ejercicio 2408.
 */
public final class Main2408 {

    private Main2408() {
    }

    /**
     * Prueba la jerarquia de empleados.
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa Ejemplo");

        Tecnico tecnico1 = new Tecnico(
                "Juan Perez", "111", "Calle 123",
                1990, "Masculino", "Electricista", 500000.0);

        Tecnico tecnico2 = new Tecnico(
                "Ana Lopez", "222", "Calle 456",
                1988, "Femenino", "Mecanica", 600000.0);

        Administrativo administrativo1 = new Administrativo(
                "Maria Gomez", "333", "Calle 789",
                1995, "Femenino", 2, 5);

        Administrativo administrativo2 = new Administrativo(
                "Pedro Diaz", "444", "Calle 101",
                1985, "Masculino", 4, 10);

        empresa.agregarEmpleado(tecnico1);
        empresa.agregarEmpleado(tecnico2);
        empresa.agregarEmpleado(administrativo1);
        empresa.agregarEmpleado(administrativo2);

        System.out.println("Empresa: " + empresa.getNombre());
        System.out.println("Empleados: " + empresa.cantidadEmpleados());

        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println(empleado.getNombre()
                    + " - Salario: $" + empleado.calcularSalario());
        }

        System.out.println("Monto total: $" + empresa.montoTotal());
    }
}