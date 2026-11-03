package edu.programacion.ejercicio2402;

import java.util.ArrayList;
import java.util.Collection;

public class Album {

    private String nombre;
    private ArrayList<Foto> fotos;

    /**
     * Crea un album de fotos vacio.
     *
     * @param nombre nombre del album
     */
    public Album(String nombre) {
        this.nombre = nombre;
        this.fotos = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del album.
     *
     * @return nombre del album
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del album.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Agrega una fotografia al album.
     *
     * @param foto fotografia que se agrega
     */
    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    /**
     * Agrega una coleccion de fotografias.
     *
     * @param nuevasFotos fotografias que se agregan
     */
    public void agregarFotos(Collection<Foto> nuevasFotos) {
        fotos.addAll(nuevasFotos);
    }

    /**
     * Elimina una fotografia del album.
     *
     * @param foto fotografia que se elimina
     * @return true si se elimino, false en caso contrario
     */
    public boolean eliminarFoto(Foto foto) {
        return fotos.remove(foto);
    }

    /**
     * Elimina todas las fotografias del album.
     */
    public void limpiarAlbum() {
        fotos.clear();
    }

    /**
     * Obtiene la cantidad de fotografias.
     *
     * @return cantidad de fotografias
     */
    public int cantidadFotos() {
        return fotos.size();
    }
}
