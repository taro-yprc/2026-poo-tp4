
package edu.programacion.ejercicio2409;

import java.time.LocalDateTime;

/**
 * Ejecuta el ejercicio 2409.
 */
public final class Main2409 {

    private Main2409() {
    }

    /**
     * Prueba la navegacion, historial y favoritos.
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Browser navegador = new Browser();

        PaginaWeb pagina1 = new PaginaWeb(
                "https://www.google.com",
                LocalDateTime.of(2026, 11, 3, 10, 0),
                15000,
                "<html>Google</html>");

        PaginaWeb pagina2 = new PaginaWeb(
                "https://www.github.com",
                LocalDateTime.of(2026, 11, 3, 10, 5),
                20000,
                "<html>GitHub</html>");

        PaginaWeb pagina3 = new PaginaWeb(
                "https://www.wikipedia.org",
                LocalDateTime.of(2026, 11, 3, 10, 10),
                18000,
                "<html>Wikipedia</html>");

        navegador.visitarPagina(pagina1);
        navegador.visitarPagina(pagina2);
        navegador.visitarPagina(pagina3);

        System.out.println("Pagina actual: "
                + navegador.getCurrentPage().getDireccionWeb());

        System.out.println("Ultima pagina visitada: "
                + navegador.ultimaPaginaVisitada().getDireccionWeb());

        System.out.println("Cantidad de visitas: "
                + navegador.cantidadPaginasVisitadas());

        navegador.agregarFavorito(pagina1.getDireccionWeb());
        navegador.agregarFavorito(pagina2.getDireccionWeb());

        System.out.println("Favoritos: "
                + navegador.getFavoritos());

        navegador.eliminarPagina(pagina3);

        System.out.println("Cantidad despues de eliminar: "
                + navegador.cantidadPaginasVisitadas());

        System.out.println("Pagina actual despues de eliminar: "
                + navegador.getCurrentPage().getDireccionWeb());
    }
}
