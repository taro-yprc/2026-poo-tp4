
package edu.programacion.ejercicio2405;

import java.time.LocalDate;

/**
 * Ejecuta el ejercicio 2405.
 */
public final class Main2405 {

    private Main2405() {
    }

    /**
     * Prueba las operaciones de la libreria.
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Libro libro1 = new Libro(
                "El Principito",
                "Antoine de Saint-Exupery",
                LocalDate.of(1943, 4, 6),
                5);

        Libro libro2 = new Libro(
                "Don Quijote",
                "Miguel de Cervantes",
                LocalDate.of(1605, 1, 16),
                3);

        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);

        System.out.println("Libros: "
                + libreria.cantidadDeLibros());

        System.out.println("Copias: "
                + libreria.cantidadTotalDeCopias());

        libro1.setCantidadCopias(8);

        System.out.println("Copias actualizadas: "
                + libreria.cantidadTotalDeCopias());

        libreria.eliminarLibro(libro2);

        System.out.println("Libros restantes: "
                + libreria.cantidadDeLibros());
    }
}
