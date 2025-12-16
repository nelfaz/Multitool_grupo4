import java.util.Scanner;

public class Juego {
    // Variable que guarda el resultado entre partidas
    static int ultimosIntentos = 0;

    // -----ADIVINAR EL NÚMERO------
    public static void juegoMain() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // ----SUBMEÚ----
            System.out.println("1. Jugar (número entre 1 y 50)");
            System.out.println("2. Mostrar intentos del último juego");
            System.out.println("0. Volver");
            
            if(sc.hasNextInt()){
                opcion = sc.nextInt();
                sc.nextLine(); 
            } else {
                opcion = -1;
                sc.next(); 
            }

            if (opcion == 1) {
                
                int num , intentos,numJugador;
                intentos=numJugador=0;
        
                num = (int) ((Math.random() * (50))+1);
        
                System.out.println("ADIVINA EL NUMERO DEL 1 AL 50");
                
        
        
                do{
                    
                    
                     System.out.print("INTRODUCE EL NÚMERO: ");
                    if(sc.hasNextInt()){
                        
                       
                       
                        numJugador=sc.nextInt();
                        sc.nextLine();
                    
                    
                    
                    if(numJugador!=num){
                        
                        System.out.println("INTÉNTALO OTRA VEZ");
                        System.out.println();
                    }
                    
                    intentos++;}
                    else{
                        System.out.println("VALOR INTRODUCIDO NO VÁLIDO");
                        sc.next();
                        }
        
                }while(numJugador!=num);
        
                System.out.println();
                System.out.println("HAS ACERTADO");
                System.out.println();
                System.out.println("INTENTOS: "+intentos); 
                // --- TU CÓDIGO EXACTO TERMINA AQUÍ ---
                
                // Guardamos los intentos al terminar la partida
                ultimosIntentos = intentos;

            } else if (opcion == 2) {
                System.out.println("Intentos del último juego: " + ultimosIntentos);
                System.out.println();
            }

        } while (opcion != 0);
    }
    
}
