
package edu.programacion.ejercicio2403;

public class Temperatura {

    private double celsius;

    /**
     * Crea una temperatura inicial de cero grados Celsius.
     */
    public Temperatura() {
        this.celsius = 0;
    }

    /**
     * Crea una temperatura expresada en Celsius.
     *
     * @param celsius temperatura inicial
     */
    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    /**
     * Obtiene la temperatura en Celsius.
     *
     * @return grados Celsius
     */
    public double getCelsius() {
        return celsius;
    }

    /**
     * Modifica la temperatura utilizando Celsius.
     *
     * @param celsius nueva temperatura
     */
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    /**
     * Obtiene la temperatura en Fahrenheit.
     *
     * @return grados Fahrenheit
     */
    public double getFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }

    /**
     * Modifica la temperatura utilizando Fahrenheit.
     *
     * @param fahrenheit nueva temperatura
     */
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5.0 / 9.0;
    }

    /**
     * Obtiene la temperatura en Kelvin.
     *
     * @return temperatura en Kelvin
     */
    public double getKelvin() {
        return celsius + 273.15;
    }

    /**
     * Modifica la temperatura utilizando Kelvin.
     *
     * @param kelvin nueva temperatura
     */
    public void setKelvin(double kelvin) {
        this.celsius = kelvin - 273.15;
    }


    /**
     * Obtiene la temperatura en Rankine.
     *
     * @return grados Rankine
     */
    public double getRankine() {
        return (celsius + 273.15) * 9.0 / 5.0;
    }

    /**
     * Modifica la temperatura utilizando Rankine.
     *
     * @param rankine nueva temperatura
     */
    public void setRankine(double rankine) {
        this.celsius = rankine * 5.0 / 9.0 - 273.15;
    }

    /**
     * Obtiene la temperatura en Reaumur.
     *
     * @return grados Reaumur
     */
    public double getReaumur() {
        return celsius * 4.0 / 5.0;
    }

    /**
     * Modifica la temperatura utilizando Reaumur.
     *
     * @param reaumur nueva temperatura
     */
    public void setReaumur(double reaumur) {
        this.celsius = reaumur * 5.0 / 4.0;
    }

    /**
     * Convierte la temperatura a la escala indicada.
     *
     * @param escala escala de destino
     * @return temperatura convertida
     */
    public double convertirA(String escala) {
        return switch (escala.toUpperCase()) {
            case "CELSIUS" -> getCelsius();
            case "FAHRENHEIT" -> getFahrenheit();
            case "KELVIN" -> getKelvin();
            case "RANKINE" -> getRankine();
            case "REAUMUR" -> getReaumur();
            default -> throw new IllegalArgumentException(
                    "Escala de temperatura no valida: " + escala
            );
        };
    }
}
