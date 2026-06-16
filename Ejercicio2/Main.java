import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        // Productos quemados
        inventario.agregarProducto("Arroz", 20);
        inventario.agregarProducto("Leche", 15);
        inventario.agregarProducto("Pan", 8);
        inventario.agregarProducto("Azucar", 30);
        inventario.agregarProducto("Cafe", 5);

        String opcion;

        do {
            System.out.println("\n--- MENU INVENTARIO ---");
            System.out.println("1. Aumentar stock");
            System.out.println("2. Realizar venta");
            System.out.println("3. Mostrar productos con stock menor a 10");
            System.out.println("4. Mostrar inventario");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.next();
            sc.nextLine();

            switch (opcion) {

                case "1":
                    System.out.print("Producto: ");
                    String productoAumentar = sc.nextLine();

                    System.out.print("Cantidad a agregar: ");
                    int cantidadAgregar = sc.nextInt();

                    inventario.aumentarStock(
                        productoAumentar,
                        cantidadAgregar
                    );
                    break;

                case "2":
                    System.out.print("Producto: ");
                    String productoVenta = sc.nextLine();

                    System.out.print("Cantidad a vender: ");
                    int cantidadVenta = sc.nextInt();

                    inventario.venderProducto(
                        productoVenta,
                        cantidadVenta
                    );
                    break;

                case "3":
                    inventario.mostrarStockBajo();
                    break;

                case "4":
                    inventario.mostrarInventario();
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