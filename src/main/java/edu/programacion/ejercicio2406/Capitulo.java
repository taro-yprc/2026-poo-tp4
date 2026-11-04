
package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un capitulo de una serie.
 */
public class Capitulo {

    private final String titulo;
    private final int numero;
    private final int temporada;
    private final int duracionMinutos;
    private final List<Personaje> personajes;

    /**
     * Crea un capitulo.
     *
     * @param titulo titulo del capitulo
     * @param numero numero del capitulo
     * @param temporada numero de temporada
     * @param duracionMinutos duracion en minutos
     */
    public Capitulo(String titulo, int numero,
                    int temporada, int duracionMinutos) {
        this.titulo = titulo;
        this.numero = numero;
        this.temporada = temporada;
        this.duracionMinutos = duracionMinutos;
        this.personajes = new ArrayList<>();
    }

    /**
     * Agrega un personaje al capitulo.
     *
     * @param personaje personaje que aparece
     */
    public void agregarPersonaje(Personaje personaje) {
        if (personaje != null) {
            personajes.add(personaje);
        }
    }

    /**
     * Obtiene el titulo.
     *
     * @return titulo del capitulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el numero.
     *
     * @return numero del capitulo
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene la temporada.
     *
     * @return numero de temporada
     */
    public int getTemporada() {
        return temporada;
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