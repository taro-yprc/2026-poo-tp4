
package edu.programacion.ejercicio2410;

import java.time.LocalDate;

/**
 * Ejecuta el ejercicio 2410.
 */
public final class Main2410 {

    private Main2410() {
    }

    /**
     * Prueba la gestion de documentos.
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Persona lautaro = new Persona("Lautaro", "Tamola", "111");
        Persona mancu = new Persona("Mancu", "Navarro", "222");
        Persona ana = new Persona("Ana", "Lopez", "333");

        SistemaDrive sistema = new SistemaDrive(
                lautaro, "Español", LocalDate.of(2026, 11, 3));

        Documento documento1 = new Documento(
                "Trabajo Practico",
                "Contenido inicial del TP",
                LocalDate.of(2026, 11, 3),
                lautaro);

        Documento documento2 = new Documento(
                "Apuntes Java",
                "Conceptos de programacion orientada a objetos",
                LocalDate.of(2026, 11, 3),
                lautaro);

        sistema.agregarDocumento(documento1);
        sistema.agregarDocumento(documento2);

        sistema.agregarEditor(documento1, mancu);
        sistema.agregarEditor(documento1, ana);
        sistema.agregarEditor(documento2, mancu);

        System.out.println("Dueño del sistema: "
                + sistema.getDuenio());

        System.out.println("Idioma: " + sistema.getIdioma());

        System.out.println("Cantidad de documentos: "
                + sistema.cantidadDocumentos());

        System.out.println("Editores del documento 1: "
                + sistema.cantidadEditores(documento1));

        System.out.println("Editores del documento 2: "
                + sistema.cantidadEditores(documento2));

        System.out.println("Total de editores: "
                + sistema.cantidadTotalEditores());

        boolean edicionPermitida = documento1.editarTexto(
                mancu, "Contenido actualizado por Mancu");

        System.out.println("Edicion permitida: "
                + edicionPermitida);

        System.out.println("Texto actualizado: "
                + documento1.getTexto());
    }
}