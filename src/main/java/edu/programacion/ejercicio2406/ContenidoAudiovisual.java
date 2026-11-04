
package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa informacion comun de peliculas y series.
 */
public abstract class ContenidoAudiovisual {

    private final String titulo;
    private final int anioEstreno;
    private final String genero;
    private final List<Actor> actores;
    private final List<Director> directores;

    /**
     * Crea un contenido audiovisual.
     *
     * @param titulo titulo del contenido
     * @param anioEstreno anio de estreno
     * @param genero genero del contenido
     */
    public ContenidoAudiovisual(String titulo, int anioEstreno,
                                String genero) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.genero = genero;
        this.actores = new ArrayList<>();
        this.directores = new ArrayList<>();
    }

    /**
     * Agrega un actor al contenido.
     *
     * @param actor actor que se incorpora
     */
    public void agregarActor(Actor actor) {
        if (actor != null && !actores.contains(actor)) {
            actores.add(actor);
        }
    }

    /**
     * Agrega un director al contenido.
     *
     * @param director director que se incorpora
     */
    public void agregarDirector(Director director) {
        if (director != null && !directores.contains(director)) {
            directores.add(director);
        }
    }

    /**
     * Obtiene el titulo.
     *
     * @return titulo del contenido
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el anio de estreno.
     *
     * @return anio de estreno
     */
    public int getAnioEstreno() {
        return anioEstreno;
    }

    /**
     * Obtiene el genero.
     *
     * @return genero del contenido
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Obtiene los actores.
     *
     * @return lista de actores
     */
    public List<Actor> getActores() {
        return new ArrayList<>(actores);
    }

    /**
     * Obtiene los directores.
     *
     * @return lista de directores
     */
    public List<Director> getDirectores() {
        return new ArrayList<>(directores);
    }
}