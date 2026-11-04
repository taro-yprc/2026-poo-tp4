
package edu.programacion.ejercicio2409;

import java.time.LocalDateTime;

/**
 * Representa una pagina web visitada.
 */
public class PaginaWeb {

    private final String direccionWeb;
    private final LocalDateTime fechaVisita;
    private final long tamanio;
    private final String codigoHtml;

    /**
     * Construye una pagina web.
     *
     * @param direccionWeb direccion de la pagina
     * @param fechaVisita fecha y hora de visita
     * @param tamanio tamanio de la pagina en bytes
     * @param codigoHtml contenido HTML de la pagina
     */
    public PaginaWeb(String direccionWeb, LocalDateTime fechaVisita,
                     long tamanio, String codigoHtml) {
        if (direccionWeb == null || direccionWeb.isBlank()) {
            throw new IllegalArgumentException(
                    "La direccion web no puede estar vacia");
        }

        if (fechaVisita == null) {
            throw new IllegalArgumentException(
                    "La fecha de visita es obligatoria");
        }

        if (tamanio < 0) {
            throw new IllegalArgumentException(
                    "El tamanio no puede ser negativo");
        }

        this.direccionWeb = direccionWeb;
        this.fechaVisita = fechaVisita;
        this.tamanio = tamanio;
        this.codigoHtml = codigoHtml;
    }

    /**
     * @return direccion web
     */
    public String getDireccionWeb() {
        return direccionWeb;
    }

    /**
     * @return fecha y hora de visita
     */
    public LocalDateTime getFechaVisita() {
        return fechaVisita;
    }

    /**
     * @return tamanio de la pagina
     */
    public long getTamanio() {
        return tamanio;
    }

    /**
     * @return codigo HTML
     */
    public String getCodigoHtml() {
        return codigoHtml;
    }

    /**
     * Representa la pagina como texto.
     *
     * @return direccion y fecha de visita
     */
    @Override
    public String toString() {
        return direccionWeb + " - " + fechaVisita;
    }
}
