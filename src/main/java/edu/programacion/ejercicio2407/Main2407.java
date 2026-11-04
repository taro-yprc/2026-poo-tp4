
package edu.programacion.ejercicio2407;

/**
 * Ejecuta el ejercicio 2407.
 */
public final class Main2407 {

    private Main2407() {
    }

    /**
     * Demuestra las operaciones de conjuntos.
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Persona ana = new Persona("Ana", "Lopez", "111");
        Persona juan = new Persona("Juan", "Perez", "222");
        Persona maria = new Persona("Maria", "Gomez", "333");
        Persona pedro = new Persona("Pedro", "Diaz", "444");
        Persona lucia = new Persona("Lucia", "Ruiz", "555");

        Conjuntos a = new Conjuntos();
        a.add(ana);
        a.add(juan);
        a.add(maria);

        Conjuntos b = new Conjuntos();
        b.add(juan);
        b.add(maria);
        b.add(pedro);

        Conjuntos c = new Conjuntos();
        c.add(maria);
        c.add(lucia);

        System.out.println("Conjunto A: " + a);
        System.out.println("Conjunto B: " + b);
        System.out.println("Conjunto C: " + c);

        System.out.println("Union A y B: " + a.union(b));
        System.out.println("Union A y C: " + a.union(c));

        System.out.println("Interseccion A y B: "
                + a.interseccion(b));
        System.out.println("Interseccion A y C: "
                + a.interseccion(c));

        System.out.println("Diferencia A - B: "
                + a.diferencia(b));

        System.out.println("Diferencia simetrica A y B: "
                + a.diferenciaSimetrica(b));

        Persona repetida = new Persona("Juan", "Otro", "222");
        System.out.println("Agregar DNI repetido: "
                + a.add(repetida));
    }
}