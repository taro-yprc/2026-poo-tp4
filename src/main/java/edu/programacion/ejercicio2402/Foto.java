package edu.programacion.ejercicio2402;

public class Foto {

    private String nombre;
    private String descripcion;

    /**
     * Crea una fotografia.
     *
     * @param nombre nombre de la fotografia
     * @param descripcion descripcion de la fotografia
     */
    public Foto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la fotografia.
     *
     * @return nombre de la fotografia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripcion de la fotografia.
     *
     * @return descripcion de la fotografia
     */
    public String getDescripcion() {
        return descripcion;
    }
}
