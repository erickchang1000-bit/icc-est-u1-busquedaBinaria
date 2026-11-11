import java.util.ArrayList;
import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 25, "M"));
        personas.add(new Persona("Maria", 30, "F"));
        personas.add(new Persona("Pedro", 20, "M"));
        personas.add(new Persona("Ana", 20, "F"));

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}