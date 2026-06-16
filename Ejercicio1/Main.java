import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MapaEstudiantes mapa = new MapaEstudiantes();

        // Datos de prueba (quemados)
        mapa.agregarEstudiante("2025000001", "Juan Perez");
        mapa.agregarEstudiante("2025000002", "Maria Lopez");
        mapa.agregarEstudiante("2025000003", "Carlos Ruiz");
        mapa.agregarEstudiante("2025000004", "Ana Torres");
        mapa.agregarEstudiante("2025000005", "Luis Garcia");

        String opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Buscar estudiante");
            System.out.println("2. Actualizar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Mostrar cantidad");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.next();
            sc.nextLine();

            switch (opcion) {
                case "1": //1. Buscar estudiante
                    System.out.print("Matricula: ");
                    String matriculaBuscar = sc.nextLine();
                    mapa.buscarEstudiante(matriculaBuscar);
                    break;

                case "2": //2. Actualizar estudiante
                    System.out.print("Matricula: ");
                    String matriculaActualizar = sc.nextLine();

                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();

                    mapa.actualizarEstudiante(
                        matriculaActualizar,
                        nuevoNombre
                    );
                    break;

                case "3": //3. Eliminar estudiante
                    System.out.print("Matricula: ");
                    String matriculaEliminar = sc.nextLine();

                    mapa.eliminarEstudiante(matriculaEliminar);
                    break;

                case "4"://4. Mostrar todos
                    mapa.mostrarTodos();
                    break;

                case "5"://5. Mostrar cantidad
                    mapa.mostrarCantidad();
                    break;

                case "0":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != "0");

        sc.close();
    }
}