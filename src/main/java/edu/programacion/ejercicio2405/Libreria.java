
package edu.programacion.ejercicio2405;

import java.util.ArrayList;
import java.util.List;

/**
 * Administra los libros de una libreria.
 */
public class Libreria {

    private final List<Libro> libros;

    /**
     * Crea una libreria vacia.
     */
    public Libreria() {
        this.libros = new ArrayList<>();
    }

    /**
     * Agrega un libro.
     *
     * @param libro libro que se agrega
     */
    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException(
                    "El libro no puede ser nulo");
        }

        libros.add(libro);
    }

    /**
     * Elimina un libro.
     *
     * @param libro libro que se elimina
     * @return true si se elimino correctamente
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la cantidad de libros registrados.
     *
     * @return cantidad de libros
     */
    public int cantidadDeLibros() {
        return libros.size();
    }

    /**
     * Suma todas las copias de los libros.
     *
     * @return cantidad total de copias
     */
    public int cantidadTotalDeCopias() {
        int total = 0;

        for (Libro libro : libros) {
            total += libro.getCantidadCopias();
        }

        return total;
    }
}
