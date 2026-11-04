
package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una serie formada por capitulos.
 */
public class Serie extends ContenidoAudiovisual {

    private final List<Capitulo> capitulos;

    /**
     * Crea una serie.
     *
     * @param titulo titulo de la serie
     * @param anioEstreno anio de estreno
     * @param genero genero
     */
    public Serie(String titulo, int anioEstreno, String genero) {
        super(titulo, anioEstreno, genero);
        this.capitulos = new ArrayList<>();
    }

    /**
     * Agrega un capitulo a la serie.
     *
     * @param capitulo capitulo que se incorpora
     */
    public void agregarCapitulo(Capitulo capitulo) {
        if (capitulo != null) {
            capitulos.add(capitulo);
        }
    }

    /**
     * Obtiene la cantidad de capitulos.
     *
     * @return cantidad de capitulos
     */
    public int cantidadCapitulos() {
        return capitulos.size();
    }

    /**
     * Obtiene los capitulos.
     *
     * @return lista de capitulos
     */
    public List<Capitulo> getCapitulos() {
        return new ArrayList<>(capitulos);
    }
}