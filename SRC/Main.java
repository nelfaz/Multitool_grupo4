import java.util.Scanner;
public class Main{
    static Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("1.Gestor de Numeros");
        System.out.println("2.Conversor Multitipo");
        System.out.println("3.Analixador de tetxto");
        System.out.println("4.Gestion de Tareas");
        System.out.println("5.Adivinar el numero");

    }

    // metodos ultilzados en cada opcion

    // conversor
    public static void C_to_F(int temp, int tipo){
        double conv;
        if (tipo == 1) { // C a F
            conv = temp * 9.0 / 5 + 32;
            System.out.println(temp + " grados Cº son " + conv + " grados Fahrenheit");
        } else { // F a C
            conv = (temp - 32) * 5.0 / 9;
            System.out.println(temp + " grados Fahrenheit son " + conv + " grados Cº");
        }
    }

    public static void C_to_F_UI(){
        System.out.println("Dime la temperatura: ");
        int temp = leer.nextInt();
        System.out.println("Dime 1 si es Cº o 2 si es Fahrenheit: ");
        int tipo = leer.nextInt();

        C_to_F(temp, tipo);
    }


    public static void M_to_P_UI(){
        System.out.println("Dime la distancia: ");
        int valor = leer.nextInt();
        System.out.println("Dime 1 si son metros o 2 si son pies: ");
        int tipo = leer.nextInt();

        M_to_P(valor, tipo);
    }

    public static void M_to_P(int valor, int tipo){
        double conv;
        if (tipo == 1) {
            conv = valor * 3.28084;
            System.out.println(valor + " metros son " + conv + " pies");
        } else {
            conv = valor / 3.28084;
            System.out.println(valor + " pies son " + conv + " metros");
        }
    }


    public static void K_to_L_UI(){
        System.out.println("Dime el peso: ");
        int valor = leer.nextInt();
        System.out.println("Dime 1 si son kilos o 2 si son libras: ");
        int tipo = leer.nextInt();

        K_to_L(valor, tipo);
    }

    public static void K_to_L(int valor, int tipo){
        double conv;
        if (tipo == 1) {
            conv = valor * 2.20462;
            System.out.println(valor + " kilos son " + conv + " libras");
        } else {
            conv = valor / 2.20462;
            System.out.println(valor + " libras son " + conv + " kilos");
        }
    }


    public static int menu(){
        System.out.println("\n===== MENÚ DE OPCIONES =====");
        System.out.println("1. Celsius ↔ Fahrenheit");
        System.out.println("2. Metros ↔ Pies");
        System.out.println("3. Kg ↔ Libras");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = leer.nextInt();
        leer.nextLine();

        return opcion;
    }

    static void iniciar_aplicacion() {
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    C_to_F_UI();
                    break;
                case 2:
                    M_to_P_UI();
                    break;
                case 3:
                    K_to_L_UI();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.\n");
            }

        } while (opcion != 0);
    }

}