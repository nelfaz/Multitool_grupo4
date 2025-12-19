import java.util.Scanner;

public class Texto {
     public static void iniciar() {
        /*Opción para contar vocales

        Opción para contar palabras

        Opción para mostrar la palabra más larga

        Opción para volver al menú principal */
        Scanner leer = new Scanner(System.in);

        System.out.println("Seleccione una opción digitando el numero: ");
        System.out.println("1. Contar vocales");
        System.out.println("2. Contar palabras");
        System.out.println("3. Mostrar la palabra más larga");
        System.out.println("4. Volver al menú principal");

        int opción = leer.nextInt();
        switch (opción) {
            case 1:
                contarVocales(leer);
                break;
            case 2:
                contarPalabras();
                break;
            case 3:
                mostrarPalabraMasLarga();
                break;
            case 4:
                return;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }
    // OPCIÓN 1 RESUELTA
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

}
