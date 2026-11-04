
package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una pelicula.
 */
public class Pelicula extends ContenidoAudiovisual {

    private final int duracionMinutos;
    private final List<Personaje> personajes;

    /**
     * Crea una pelicula.
     *
     * @param titulo titulo de la pelicula
     * @param anioEstreno anio de estreno
     * @param genero genero
     * @param duracionMinutos duracion en minutos
     */
    public Pelicula(String titulo, int anioEstreno,
                    String genero, int duracionMinutos) {
        super(titulo, anioEstreno, genero);
        this.duracionMinutos = duracionMinutos;
        this.personajes = new ArrayList<>();
    }

    /**
     * Agrega un personaje a la pelicula.
     *
     * @param personaje personaje que se agrega
     */
    public void agregarPersonaje(Personaje personaje) {
        if (personaje != null) {
            personajes.add(personaje);
        }
    }

    /**
     * Obtiene la duracion.
     *
     * @return duracion en minutos
     */
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    /**
     * Obtiene los personajes.
     *
     * @return lista de personajes
     */
    public List<Personaje> getPersonajes() {
        return new ArrayList<>(personajes);
    }
}