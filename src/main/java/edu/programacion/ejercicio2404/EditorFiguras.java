
package edu.programacion.ejercicio2404;

import java.util.ArrayList;
import java.util.List;

/**
 * Administra una coleccion de figuras geometricas.
 */
public class EditorFiguras {

    private final List<Figura> figuras;

    /**
     * Crea un editor con una coleccion vacia.
     */
    public EditorFiguras() {
        this.figuras = new ArrayList<>();
    }

    /**
     * Agrega una figura a la coleccion.
     *
     * @param figura figura que se desea agregar
     */
    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    /**
     * Elimina una figura de la coleccion.
     *
     * @param figura figura que se desea eliminar
     * @return verdadero si la figura fue eliminada
     */
    public boolean eliminarFigura(Figura figura) {
        return figuras.remove(figura);
    }

    /**
     * Pinta todas las figuras de la coleccion.
     */
    public void pintar() {
        for (Figura figura : figuras) {
            figura.pintar();
        }
    }

    /**
     * Calcula la suma de las areas de todas las figuras.
     *
     * @return area total de las figuras
     */
    public Double calcularArea() {
        double areaTotal = 0.0;

        for (Figura figura : figuras) {
            areaTotal += figura.getArea();
        }

        return areaTotal;
    }
}
