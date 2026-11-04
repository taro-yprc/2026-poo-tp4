
package edu.programacion.ejercicio2409;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Modela un navegador web con historial y favoritos.
 */
public class Browser {

    private PaginaWeb currentPage;
    private final List<PaginaWeb> historial;
    private final Set<String> favoritos;

    /**
     * Construye un navegador sin paginas visitadas.
     */
    public Browser() {
        this.currentPage = null;
        this.historial = new ArrayList<>();
        this.favoritos = new LinkedHashSet<>();
    }

    /**
     * Visita una pagina y la agrega al historial.
     *
     * @param pagina pagina que se visita
     */
    public void visitarPagina(PaginaWeb pagina) {
        if (pagina == null) {
            throw new IllegalArgumentException(
                    "La pagina no puede ser nula");
        }

        currentPage = pagina;
        historial.add(pagina);
    }

    /**
     * Agrega una pagina al historial.
     *
     * @param pagina pagina que se agrega
     */
    public void agregarPagina(PaginaWeb pagina) {
        visitarPagina(pagina);
    }

    /**
     * Elimina una pagina del historial.
     *
     * @param pagina pagina que se elimina
     * @return true si se elimino
     */
    public boolean eliminarPagina(PaginaWeb pagina) {
        boolean eliminada = historial.remove(pagina);

        if (eliminada && currentPage == pagina) {
            currentPage = historial.isEmpty()
                    ? null : historial.get(historial.size() - 1);
        }

        return eliminada;
    }

    /**
     * Obtiene la pagina actual.
     *
     * @return pagina actual o null
     */
    public PaginaWeb getCurrentPage() {
        return currentPage;
    }

    /**
     * Obtiene la ultima pagina registrada.
     *
     * @return ultima pagina o null
     */
    public PaginaWeb ultimaPaginaVisitada() {
        if (historial.isEmpty()) {
            return null;
        }

        return historial.get(historial.size() - 1);
    }

    /**
     * Obtiene la cantidad de visitas registradas.
     *
     * @return cantidad de visitas
     */
    public int cantidadPaginasVisitadas() {
        return historial.size();
    }

    /**
     * Obtiene una copia del historial.
     *
     * @return paginas visitadas
     */
    public List<PaginaWeb> getHistorial() {
        return new ArrayList<>(historial);
    }

    /**
     * Agrega una direccion a favoritos.
     *
     * @param direccionWeb direccion favorita
     * @return true si se agrego
     */
    public boolean agregarFavorito(String direccionWeb) {
        if (direccionWeb == null || direccionWeb.isBlank()) {
            return false;
        }

        return favoritos.add(direccionWeb);
    }

    /**
     * Elimina una direccion de favoritos.
     *
     * @param direccionWeb direccion que se elimina
     * @return true si se elimino
     */
    public boolean eliminarFavorito(String direccionWeb) {
        return favoritos.remove(direccionWeb);
    }

    /**
     * Obtiene una copia de los favoritos.
     *
     * @return direcciones favoritas
     */
    public Set<String> getFavoritos() {
        return new LinkedHashSet<>(favoritos);
    }
}
