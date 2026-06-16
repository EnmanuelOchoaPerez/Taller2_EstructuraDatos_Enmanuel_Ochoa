import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        Map<String, Integer> contador = new HashMap<>();

        String[] palabras = frase.split("\\s+");

        for (String palabra : palabras) {
            contador.put(
                palabra,
                contador.getOrDefault(palabra, 0) + 1
            );
        }

        System.out.println("\nFrecuencia de palabras:");

        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(
                entry.getKey() +
                " aparece " +
                entry.getValue() +
                (entry.getValue() == 1 ? " vez" : " veces")
            );
        }

        sc.close();
    }
}