
package edu.programacion.ejercicio2407;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Implementa operaciones de conjuntos de personas.
 */
public class Conjuntos {

    private final Set<Persona> personas;

    /**
     * Crea un conjunto vacio.
     */
    public Conjuntos() {
        this.personas = new LinkedHashSet<>();
    }

    /**
     * Agrega una persona al conjunto.
     *
     * @param persona persona que se agrega
     * @return true si fue agregada
     */
    public boolean add(Persona persona) {
        if (persona == null) {
            return false;
        }

        return personas.add(persona);
    }

    /**
     * Elimina una persona del conjunto.
     *
     * @param persona persona que se elimina
     * @return true si fue eliminada
     */
    public boolean remove(Persona persona) {
        return personas.remove(persona);
    }

    /**
     * Realiza la union de dos conjuntos.
     *
     * @param otro segundo conjunto
     * @return conjunto con todos los elementos
     */
    public Conjuntos union(Conjuntos otro) {
        Conjuntos resultado = new Conjuntos();
        resultado.personas.addAll(this.personas);
        resultado.personas.addAll(otro.personas);
        return resultado;
    }

    /**
     * Obtiene los elementos comunes.
     *
     * @param otro segundo conjunto
     * @return interseccion de ambos conjuntos
     */
    public Conjuntos interseccion(Conjuntos otro) {
        Conjuntos resultado = new Conjuntos();
        resultado.personas.addAll(this.personas);
        resultado.personas.retainAll(otro.personas);
        return resultado;
    }

    /**
     * Obtiene los elementos del primero que no estan
     * en el segundo conjunto.
     *
     * @param otro segundo conjunto
     * @return diferencia de conjuntos
     */
    public Conjuntos diferencia(Conjuntos otro) {
        Conjuntos resultado = new Conjuntos();
        resultado.personas.addAll(this.personas);
        resultado.personas.removeAll(otro.personas);
        return resultado;
    }

    /**
     * Obtiene los elementos que pertenecen
     * exclusivamente a uno de los conjuntos.
     *
     * @param otro segundo conjunto
     * @return diferencia simetrica
     */
    public Conjuntos diferenciaSimetrica(Conjuntos otro) {
        Conjuntos resultado = this.union(otro);
        Conjuntos comunes = this.interseccion(otro);
        resultado.personas.removeAll(comunes.personas);
        return resultado;
    }

    /**
     * Obtiene la cantidad de personas.
     *
     * @return cantidad de personas
     */
    public int cantidadPersonas() {
        return personas.size();
    }

    /**
     * Obtiene una copia de las personas.
     *
     * @return conjunto de personas
     */
    public Set<Persona> getPersonas() {
        return new LinkedHashSet<>(personas);
    }

    /**
     * Representa el conjunto como texto.
     *
     * @return representacion del conjunto
     */
    @Override
    public String toString() {
        return personas.toString();
    }
}