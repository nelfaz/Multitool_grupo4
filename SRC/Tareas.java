import java.util.Scanner;

public class Tareas {
    static Scanner sc = new Scanner(System.in);
    static String[] tareas = new String[15];

    public static void main(String[] args) {

    }

    static void menuTareas() {
        System.out.println("");
        System.out.println("1.Añadir Tarea");
        System.out.println("2.Listar Tareas");
        System.out.println("3.Buscar Palabra");
        System.out.println("0.Volver");
        System.out.println("");
        System.out.println("Que opcion quieres hacer?");

        int seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                AñadirTareas();
                break;

            case 2:
                ListarTareas();
                break;

            case 3:

                break;

            case 0:

                break;
        }
    }

    static void AñadirTareas() {
        System.out.println("Cuantas tareas queires añadir?");

        int count = sc.nextInt();
        for (int i = 0; i < count && i < tareas.length; i++) {
            System.out.println("Que tarea quieres agregar?");
            tareas[i] = sc.nextLine();
        }
    }

    static void ListarTareas() {
        for (int i = 0; i < tareas.length; i++) {
            System.out.println(i + 1 + "º." + tareas[i]);
        }
    }

    static void BuscarTarea() {
        String letra = sc.nextLine();

        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].toLowerCase().contains(letra)) {
                System.out.println("Esta la palabra que buscas");
                System.out.println(tareas[i]);
            }
        }
    }

}
