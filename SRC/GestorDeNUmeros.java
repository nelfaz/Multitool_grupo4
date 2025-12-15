import java.util.Scanner;

public class GestorDeNUmeros {
  static Scanner sc = new Scanner(System.in);
    // ========================
    // 2. MAIN Y MÉTODO PRINCIPAL DE LA APLICACIÓN
    // ========================
    public static void main(String[] args) {

        // Código para pruebas

        // Ejecutar el programa
        // iniciar_aplicacion();
    }

    static void iniciar_aplicacion() {
        int opcion;

        do {
            opcion = mostrarMenuYLeerOpcion();

            switch (opcion) {
                case 1:
                    //listarContactosUI();
                    break;
                case 2:
                    //buscarPorNombreUI();
                    break;
                case 3:
                    //anadirContactoUI();
                    break;
                case 4:
                    //modificarContactoUI();
                    break;
                case 0:
                    System.out.println("Volver");
                    break;
                default:
                    System.out.println("Opción Inexistente, intentelo de nuevo");
            }

            System.out.println("");
            sc.nextLine();

        } while (opcion != 0);
    }
     static int mostrarMenuYLeerOpcion() {
        System.out.println("Gestor de números");
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Añadir contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");

        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
}