import java.util.Comparator;
import java.util.List;

import models.Persona;

public class BusquedaBinaria {
    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas) {
        this.personas = personas;
    }

    public int findByName(String name) {
        // Ordenado por el nombre
        personas.sort(Comparator.comparing(Persona::getName));

        // Busqueda Binaria
        // 1 Definimos bajo y alto
        int lo = 0;
        int hi = personas.size() - 1;

        // 2 Definimos el bucle
        while (lo <= hi) {
            // 3 Definimos el centro
            int mid = (lo + hi) / 2;

            // 4 preguntar si el [mid] es lo buscado
            if (personas.get(mid).getName().equals(name)) {
                return mid;
            }

            // 5 actualizar limites
            // 5.1 Verificar si es mayor o es menor y escoger un lado
            if (personas.get(mid).getName().compareTo(name) > 0) {
                // 5.2 el nombre del medio es mayor, busco en la mitad izquierda
                hi = mid - 1;
            } else {
                // 5.3 el nombre del medio es menor, busco en la mitad derecha
                lo = mid + 1;
            }
        }

        // No se encontro
        return -1;
    }
}