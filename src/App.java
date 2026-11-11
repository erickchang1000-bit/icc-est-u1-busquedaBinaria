import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F")
        );

        /**
         * 1. Busque una persona con nombre "Maria"
         * Retorne la persona si la encontro
         * 2. Busque una persona con el nombre "Diego"
         * Retorne una persona si la encontro
         * 3. Busque una persona con nombre "Ana"
         * Imprimala posicion de la persona si la encontro
         */

        BusquedaBinaria bB = new BusquedaBinaria(personas);
        int resultado = bB.findByName("Ana");

        if (resultado != -1) {
            System.out.println("Se encontro en las pos - " + resultado);
        } else {
            System.out.println("No se ecnontro");
        }

        int resultado2 = bB.findByName("Pedro");
        // Operador Ternario
        System.out.println(resultado2 >= 0 ? "Se econtro pos - " + resultado2 : "No se encontro");

        int resultado3 = bB.findByAge(25);
        System.out.println(resultado3 >= 0 ? "Se encontro en la pos " + resultado3 : "No se encontro");
    }
}