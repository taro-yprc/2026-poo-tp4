
package edu.programacion.ejercicio2410;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Representa un documento del sistema.
 */
public class Documento {

    private final String nombre;
    private String texto;
    private final LocalDate fechaCreacion;
    private final Persona duenio;
    private final Set<Persona> editores;

    /**
     * Construye un documento.
     *
     * @param nombre nombre del documento
     * @param texto contenido del documento
     * @param fechaCreacion fecha de creacion
     * @param duenio propietario del documento
     */
    public Documento(String nombre, String texto,
                     LocalDate fechaCreacion, Persona duenio) {
        this.nombre = Objects.requireNonNull(nombre);
        this.texto = Objects.requireNonNull(texto);
        this.fechaCreacion = Objects.requireNonNull(fechaCreacion);
        this.duenio = Objects.requireNonNull(duenio);
        this.editores = new LinkedHashSet<>();
    }

    /**
     * Agrega una persona como editor.
     *
     * @param editor persona que puede editar
     * @return true si se agrego correctamente
     */
    public boolean agregarEditor(Persona editor) {
        if (editor == null) {
            return false;
        }

        return editores.add(editor);
    }

    /**
     * Actualiza el texto si la persona tiene permiso.
     *
     * @param persona persona que intenta editar
     * @param nuevoTexto nuevo contenido
     * @return true si se actualizo el documento
     */
    public boolean editarTexto(Persona persona, String nuevoTexto) {
        if (persona == null || nuevoTexto == null) {
            return false;
        }

        if (!duenio.equals(persona) && !editores.contains(persona)) {
            return false;
        }

        this.texto = nuevoTexto;
        return true;
    }

    /**
     * Obtiene la cantidad de editores.
     *
     * @return numero de editores
     */
    public int cantidadEditores() {
        return editores.size();
    }

    /**
     * @return nombre del documento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return texto del documento
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @return fecha de creacion
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @return propietario del documento
     */
    public Persona getDuenio() {
        return duenio;
    }

    /**
     * @return copia de la coleccion de editores
     */
    public Set<Persona> getEditores() {
        return new LinkedHashSet<>(editores);
    }

    /**
     * Representa el documento como texto.
     *
     * @return nombre del documento
     */
    @Override
    public String toString() {
        return nombre;
    }
}
