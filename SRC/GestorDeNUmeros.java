import java.util.Scanner;

public class GestorDeNUmeros {

    static Scanner sc = new Scanner(System.in);
    static final int TAM_MAX = 20;
    static int[] numeros = new int[TAM_MAX];
    static int usados = 0;

    public static void main(String[] args) {
        inicio_gestor_de_numeros();
    }

    static void inicio_gestor_de_numeros() {
        int opcion;
        do {
            opcion = menuGestiondeNúmeros();
            switch (opcion) {
                case 1:
                    anadirNumeroUI();
                    break;
                case 2:
                    listarNumerosUI();
                    break;
                case 3:
                    verMinMaxUI();
                    break;
                case 4:
                    buscarNumeroUI();
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opción inexistente, inténtelo de nuevo");
            }
            System.out.println();
        } while (opcion != 0);
    }
    static int menuGestiondeNúmeros() {
        System.out.println("GESTOR DE NÚMEROS");
        System.out.println("1. Añadir número");
        System.out.println("2. Listar números");
        System.out.println("3. Ver mínimo y máximo");
        System.out.println("4. Buscar número");
        System.out.println("0. Volver");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); 
        return opcion;
    }
    // 1. Añadir número
    static void anadirNumeroUI() {
        if (usados >= TAM_MAX) {
            System.out.println("El array está lleno, no se pueden añadir más números.");
            return;
        }
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        sc.nextLine();
        numeros[usados] = n;
        usados++;
        System.out.println("Número añadido correctamente.");
    }
    // 2. Listar números
    static void listarNumerosUI() {
        if (usados == 0) {
            System.out.println("No hay números guardados.");
            return;
        }
        System.out.println("Números guardados:");
        for (int i = 0; i < usados; i++) {
            System.out.println((i + 1) + ": " + numeros[i]);
        }
    }
    // 3. Ver mínimo y máximo
    static void verMinMaxUI() {
        if (usados == 0) {
            System.out.println("No hay números guardados.");
            return;
        }
        int min = numeros[0];
        int max = numeros[0];
        for (int i = 1; i < usados; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
    }
    // 4. Buscar número
    static void buscarNumeroUI() {
        if (usados == 0) {
            System.out.println("No hay números guardados.");
            return;
        }
        System.out.print("Número a buscar: ");
        int buscado = sc.nextInt();
        sc.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < usados; i++) {
            if (numeros[i] == buscado) {
                System.out.println("Encontrado en la posición " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El número no está en el array.");
        }
    }
}