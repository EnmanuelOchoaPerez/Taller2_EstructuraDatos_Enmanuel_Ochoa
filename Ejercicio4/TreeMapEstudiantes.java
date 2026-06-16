import java.util.Map;
import java.util.TreeMap;

public class TreeMapEstudiantes {

    private TreeMap<String, String> estudiantes;

    public MapaEstudiantes() {

        // El comparador compareTo() normalmente ordena ascendente.
        // Al invertir el orden de comparación (b.compareTo(a)),
        // las matrículas se almacenan de forma descendente.
        estudiantes = new TreeMap<>((a, b) -> b.compareTo(a));
    }

    public void agregarEstudiante(String matricula, String nombre) {
        estudiantes.put(matricula, nombre);
    }

    public void buscarEstudiante(String matricula) {
        if (estudiantes.containsKey(matricula)) {
            System.out.println("Nombre: " + estudiantes.get(matricula));
        } else {
            System.out.println("La matrícula no existe.");
        }
    }

    public void actualizarEstudiante(String matricula, String nuevoNombre) {
        if (estudiantes.containsKey(matricula)) {
            estudiantes.put(matricula, nuevoNombre);
            System.out.println("Estudiante actualizado.");
        } else {
            System.out.println("La matrícula no existe.");
        }
    }

    public void eliminarEstudiante(String matricula) {
        if (estudiantes.containsKey(matricula)) {
            estudiantes.remove(matricula);
            System.out.println("Estudiante eliminado.");
        } else {
            System.out.println("La matrícula no existe.");
        }
    }

    public void mostrarTodos() {

        for (Map.Entry<String, String> entry : estudiantes.entrySet()) {

            System.out.println(
                "Matrícula: " + entry.getKey()
                + " | Nombre: " + entry.getValue()
            );
        }
    }

    public void mostrarCantidad() {
        System.out.println("Total de estudiantes: " + estudiantes.size());
    }
}