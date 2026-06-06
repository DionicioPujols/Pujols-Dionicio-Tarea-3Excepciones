import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        
        do {
            System.out.println("\n|| ==================================== ||");
            System.out.println("||    SISTEMA PARA REGISTRAR USUARIOS   ||");
            System.out.println("|| ==================================== ||");
            System.out.println("|| 1. Registrar usuario                 ||");
            System.out.println("|| 2. Salir                             ||");
            System.out.println("|| ==================================== ||");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opciones = sc.nextInt();
                sc.nextLine(); 

                switch(opciones) {
                    case 1:
                        Metodos.RegistrarUsuario(sc);
                        break;
                    case 2:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La opción debe ser un número entero.");
                sc.nextLine();
                opciones = 0;  
            }
            System.out.println(); 
        } while (opciones != 2);
        
        sc.close();
    }
}