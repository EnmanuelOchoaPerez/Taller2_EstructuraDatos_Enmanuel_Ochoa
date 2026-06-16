import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeMapEstudiantes mapa = new TreeMapEstudiantes();

        // Estudiantes de prueba
        mapa.agregarEstudiante("2025000001", "Juan Perez");
        mapa.agregarEstudiante("2025000005", "Maria Lopez");
        mapa.agregarEstudiante("2025000003", "Carlos Ruiz");
        mapa.agregarEstudiante("2025000002", "Ana Torres");
        mapa.agregarEstudiante("2025000004", "Luis Garcia");

        String opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Buscar estudiante");
            System.out.println("2. Actualizar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Mostrar cantidad");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.next();
            sc.nextLine();

            switch (opcion) {

                case "1":
                    System.out.print("Matricula: ");
                    mapa.buscarEstudiante(sc.nextLine());
                    break;

                case "2":
                    System.out.print("Matricula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Nuevo nombre: ");
                    String nombre = sc.nextLine();

                    mapa.actualizarEstudiante(matricula, nombre);
                    break;

                case "3":
                    System.out.print("Matricula: ");
                    mapa.eliminarEstudiante(sc.nextLine());
                    break;

                case "4":
                    mapa.mostrarTodos();
                    break;

                case "5":
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