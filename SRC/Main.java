import java.util.Scanner;
public class Main{
    static Scanner leer = new Scanner (System.in);

    //Variables de Gestor de numeros
    static final int TAM_MAX = 20;
    static int[] numeros = new int[TAM_MAX];
    static int usados = 0;

    //Varable de juego 
    static int ultimosIntentos = 0;

    //aqui est la main normal
    public static void main(String[] args) {
        System.out.println("1.Gestor de Numeros");
        System.out.println("2.Conversor Multitipo");
        System.out.println("3.Analixador de tetxto");
        System.out.println("4.Gestion de Tareas");
        System.out.println("5.Adivinar el numero");

    }

    //aqui es el switch para interracionar con el menu principal 
    static void SeleccionarOpcion(){
        int seleccion=leer.nextInt();

        switch(seleccion){
            case 1:
                inicio_gestor_de_numeros();
            break;

            case 2:
                iniciar_aplicacion_conversor();
            break;

            case 3:
                System.out.println("Sin funcionamiento el programador no estuvo disponible");
            break;

            case 4:

            break;

            case 5:

            break;
        }
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

    static void iniciar_aplicacion_conversor() {
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

    //Gestor de Numeros


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
        int opcion = leer.nextInt();
        leer.nextLine(); 
        return opcion;
    }
    // 1. Añadir número
    static void anadirNumeroUI() {
        if (usados >= TAM_MAX) {
            System.out.println("El array está lleno, no se pueden añadir más números.");
            return;
        }
        System.out.print("Introduce un número entero: ");
        int n = leer.nextInt();
        leer.nextLine();
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
        int buscado = leer.nextInt();
        leer.nextLine();
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


    //JUEGOS
    public static void juegoMain() {
        int opcion;

        do {
            // ----SUBMEÚ----
            System.out.println("1. Jugar (número entre 1 y 50)");
            System.out.println("2. Mostrar intentos del último juego");
            System.out.println("0. Volver");
            
            if(leer.hasNextInt()){
                opcion = leer.nextInt();
                leer.nextLine(); 
            } else {
                opcion = -1;
                leer.next(); 
            }

            if (opcion == 1) {
                
                int num , intentos,numJugador;
                intentos=numJugador=0;
        
                num = (int) ((Math.random() * (50))+1);
        
                System.out.println("ADIVINA EL NUMERO DEL 1 AL 50");
                
        
        
                do{
                    
                    
                     System.out.print("INTRODUCE EL NÚMERO: ");
                    if(leer.hasNextInt()){
                        
                       
                       
                        numJugador=leer.nextInt();
                        leer.nextLine();
                    
                    
                    
                    if(numJugador!=num){
                        
                        System.out.println("INTÉNTALO OTRA VEZ");
                        System.out.println();
                    }
                    
                    intentos++;}
                    else{
                        System.out.println("VALOR INTRODUCIDO NO VÁLIDO");
                        leer.next();
                        }
        
                }while(numJugador!=num);
        
                System.out.println();
                System.out.println("HAS ACERTADO");
                System.out.println();
                System.out.println("INTENTOS: "+intentos); 
                
                
                // Guardamos los intentos al terminar la partida
                ultimosIntentos = intentos;

            } else if (opcion == 2) {
                System.out.println("Intentos del último juego: " + ultimosIntentos);
                System.out.println();
            }

        } while (opcion != 0);

        System.out.println("PROGRAMA CERRADO");
    }

}