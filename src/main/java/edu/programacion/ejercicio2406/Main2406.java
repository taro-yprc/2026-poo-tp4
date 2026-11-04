
package edu.programacion.ejercicio2406;

/**
 * Ejecuta el ejercicio 2406.
 */
public final class Main2406 {

    private Main2406() {
    }

    /**
     * Prueba las peliculas y series.
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Actor actor = new Actor("Pedro", "Gomez");
        Director director = new Director("Laura", "Perez");
        Personaje personaje = new Personaje("Detective", actor);

        Pelicula pelicula = new Pelicula(
                "El Misterio", 2024, "Suspenso", 110);

        pelicula.agregarActor(actor);
        pelicula.agregarDirector(director);
        pelicula.agregarPersonaje(personaje);

        Serie serie = new Serie(
                "Casos Abiertos", 2025, "Drama");

        serie.agregarActor(actor);
        serie.agregarDirector(director);

        Capitulo capitulo = new Capitulo(
                "El comienzo", 1, 1, 45);

        capitulo.agregarPersonaje(personaje);
        serie.agregarCapitulo(capitulo);

        System.out.println("Pelicula: "
                + pelicula.getTitulo());

        System.out.println("Duracion: "
                + pelicula.getDuracionMinutos() + " minutos");

        System.out.println("Actores: "
                + pelicula.getActores().size());

        System.out.println("Personajes: "
                + pelicula.getPersonajes().size());

        System.out.println("Serie: "
                + serie.getTitulo());

        System.out.println("Capitulos: "
                + serie.cantidadCapitulos());

        System.out.println("Primer capitulo: "
                + serie.getCapitulos().get(0).getTitulo());
    }
}
