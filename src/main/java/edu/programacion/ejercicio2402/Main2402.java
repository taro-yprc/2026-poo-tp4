package edu.programacion.ejercicio2402;

import java.util.Arrays;

public class Main2402 {

    /**
     * Ejecuta las pruebas del album.
     *
     * @param args argumentos de ejecucion
     */
    public static void main(String[] args) {

        Album album = new Album("Mis vacaciones");

        Foto foto1 = new Foto("Playa", "Foto en la playa");
        Foto foto2 = new Foto("Montaña", "Foto en la montaña");
        Foto foto3 = new Foto("Ciudad", "Foto en la ciudad");

        album.agregarFoto(foto1);
        album.agregarFotos(Arrays.asList(foto2, foto3));

        System.out.println("Album: " + album.getNombre());
        System.out.println("Cantidad de fotos: " + album.cantidadFotos());

        album.eliminarFoto(foto2);
        System.out.println("Fotos despues de eliminar: " + album.cantidadFotos());

        album.setNombre("Vacaciones 2026");
        System.out.println("Nuevo nombre: " + album.getNombre());

        album.limpiarAlbum();
        System.out.println("Fotos despues de limpiar: " + album.cantidadFotos());
    }
}
