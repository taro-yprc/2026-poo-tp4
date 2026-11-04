
package edu.programacion.ejercicio2405;

import java.time.LocalDate;

/**
 * Representa un libro de la libreria.
 */
public class Libro {

    private final String titulo;
    private final String autor;
    private final LocalDate fechaPublicacion;
    private int cantidadCopias;

    /**
     * Crea un libro con sus datos.
     *
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param fechaPublicacion fecha de publicacion
     * @param cantidadCopias cantidad inicial de copias
     */
    public Libro(String titulo, String autor,
                 LocalDate fechaPublicacion, int cantidadCopias) {
        if (cantidadCopias < 0) {
            throw new IllegalArgumentException(
                    "La cantidad de copias no puede ser negativa");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.cantidadCopias = cantidadCopias;
    }

    /**
     * Obtiene el titulo del libro.
     *
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene la fecha de publicacion.
     *
     * @return fecha de publicacion
     */
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Obtiene la cantidad de copias.
     *
     * @return cantidad de copias
     */
    public int getCantidadCopias() {
        return cantidadCopias;
    }

    /**
     * Actualiza la cantidad de copias.
     *
     * @param cantidad nueva cantidad
     */
    public void setCantidadCopias(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException(
                    "La cantidad de copias no puede ser negativa");
        }

        this.cantidadCopias = cantidad;
    }
}
