import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private HashMap<String, Integer> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, int stock) {
        productos.put(nombre, stock);
    }

    public void aumentarStock(String nombre, int cantidad) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, productos.get(nombre) + cantidad);
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    public void venderProducto(String nombre, int cantidad) {
        if (!productos.containsKey(nombre)) {
            System.out.println("El producto no existe.");
            return;
        }

        int stockActual = productos.get(nombre);

        if (cantidad > stockActual) {
            System.out.println("No hay suficiente stock.");
            return;
        }

        stockActual -= cantidad;

        if (stockActual == 0) {
            productos.remove(nombre);
            System.out.println("Producto agotado y eliminado del inventario.");
        } else {
            productos.put(nombre, stockActual);
            System.out.println("Venta realizada.");
        }
    }

    public void mostrarStockBajo() {
        System.out.println("\n--- PRODUCTOS CON STOCK MENOR A 10 ---");

        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            if (entry.getValue() < 10) {
                System.out.println(
                    entry.getKey() + " - Stock: " + entry.getValue()
                );
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("\n--- INVENTARIO FINAL ---");

        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println(
                "Producto: " + entry.getKey() +
                " | Stock: " + entry.getValue()
            );
        }
    }
}