import java.util.Scanner;

public class Texto {

    public static void iniciar() {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true; // Para mantener el menú activo

        while (continuar) {
            System.out.println("\n--- MENÚ DE TEXTO ---");
            System.out.println("1. Contar vocales");
            System.out.println("2. Contar palabras");
            System.out.println("3. Mostrar la palabra más larga");
            System.out.println("4. Volver al menú principal");
            System.out.print("Elija una opción: ");

            // Validación para evitar errores si no se digita un número
            if (!leer.hasNextInt()) {
                System.out.println("Error: Por favor digite un número.");
                leer.nextLine(); // Limpiar el error
                continue;
            }

            int opcion = leer.nextInt();
            leer.nextLine(); // Limpiar buffer después de nextInt()

            switch (opcion) {
                case 1:
                    contarVocales(leer);
                    break;
                case 2:
                    contarPalabras(leer);
                    break;
                case 3:
                    mostrarPalabraMasLarga(leer);
                    break;
                case 4:
                    System.out.println("Saliendo del módulo de texto...");
                    continuar = false; // Rompe el bucle while
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void contarVocales(Scanner leer) {
        System.out.println("Introduce un texto:");
        String texto = leer.nextLine().toLowerCase();
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("El texto contiene " + contador + " vocales.");
    }

    public static void contarPalabras(Scanner leer) {
        System.out.println("Introduce un texto:");
        String texto = leer.nextLine().trim();
        if (texto.length() == 0) {
            System.out.println("El texto contiene 0 palabras.");
        } else {
            String[] palabras = texto.split("\\s+");
            System.out.println("El texto contiene " + palabras.length + " palabras.");
        }
    }

    public static void mostrarPalabraMasLarga(Scanner leer) {
        System.out.println("Introduce un texto:");
        String texto = leer.nextLine().trim().replaceAll("[,.]", "");
        if (texto.length() == 0) {
            System.out.println("El texto no contiene palabras.");
            return;
        }
        String[] palabras = texto.split("\\s+");
        String palabraMasLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        System.out.println("La palabra más larga es: " + palabraMasLarga);

    }
}
