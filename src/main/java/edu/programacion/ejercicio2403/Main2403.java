
package edu.programacion.ejercicio2403;

public class Main2403 {

    /**
     * Ejecuta las pruebas de conversion de temperaturas.
     *
     * @param args argumentos de ejecucion
     */
    public static void main(String[] args) {

        Temperatura temperatura = new Temperatura();

        System.out.println("Temperatura inicial:");
        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
        System.out.println("Kelvin: " + temperatura.getKelvin());

        temperatura.setCelsius(100);

        System.out.println("Temperatura establecida en Celsius:");
        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
        System.out.println("Kelvin: " + temperatura.getKelvin());

        temperatura.setFahrenheit(32);

        System.out.println("Temperatura establecida en Fahrenheit:");
        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Kelvin: " + temperatura.getKelvin());

        temperatura.setKelvin(273.15);

        System.out.println("Temperatura establecida en Kelvin:");
        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
    }
}
