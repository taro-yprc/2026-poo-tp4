
package edu.programacion.ejercicio2410;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Sistema de gestion de documentos online.
 */
public class SistemaDrive {

    private final Persona duenio;
    private final String idioma;
    private final LocalDate fechaCreacion;
    private final List<Documento> documentos;

    /**
     * Construye un sistema de documentos.
     *
     * @param duenio propietario del sistema
     * @param idioma idioma del sistema
     * @param fechaCreacion fecha de creacion
     */
    public SistemaDrive(Persona duenio, String idioma,
                        LocalDate fechaCreacion) {
        this.duenio = Objects.requireNonNull(duenio);
        this.idioma = Objects.requireNonNull(idioma);
        this.fechaCreacion = Objects.requireNonNull(fechaCreacion);
        this.documentos = new ArrayList<>();
    }

    /**
     * Obtiene la cantidad total de documentos.
     *
     * @return cantidad de documentos
     */
    public int cantidadDocumentos() {
        return documentos.size();
    }

    /**
     * Obtiene la cantidad de editores de un documento.
     *
     * @param unDocumento documento consultado
     * @return cantidad de editores
     */
    public int cantidadEditores(Documento unDocumento) {
        if (unDocumento == null || !documentos.contains(unDocumento)) {
            return 0;
        }

        return unDocumento.cantidadEditores();
    }

    /**
     * Obtiene el total de editores de todos los documentos.
     *
     * @return cantidad total de editores
     */
    public int cantidadTotalEditores() {
        int total = 0;

        for (Documento documento : documentos) {
            total += documento.cantidadEditores();
        }

        return total;
    }

    /**
     * Agrega un documento al sistema.
     *
     * @param unDocumento documento a agregar
     */
    public void agregarDocumento(Documento unDocumento) {
        if (unDocumento != null && !documentos.contains(unDocumento)) {
            documentos.add(unDocumento);
        }
    }

    /**
     * Agrega un editor a un documento registrado.
     *
     * @param unDocumento documento que se edita
     * @param unEditor persona que se agrega como editor
     */
    public void agregarEditor(Documento unDocumento, Persona unEditor) {
        if (unDocumento != null && documentos.contains(unDocumento)) {
            unDocumento.agregarEditor(unEditor);
        }
    }

    /**
     * @return propietario del sistema
     */
    public Persona getDuenio() {
        return duenio;
    }

    /**
     * @return idioma del sistema
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @return fecha de creacion del sistema
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @return copia de los documentos registrados
     */
    public List<Documento> getDocumentos() {
        return new ArrayList<>(documentos);
    }
}