package src;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        do {
            System.out.println("\n|| ==================================== ||");
            System.out.println("||        REGISTRO DE VEHICULOS         ||");
            System.out.println("|| ==================================== ||");
            System.out.println("|| 1. Registrar vehiculo                ||");
            System.out.println("|| 2. Salir                             ||");
            System.out.println("|| ==================================== ||");
            System.out.print("\nSeleccione una opcion: ");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    Metodos.AgregarUsuario();
                    break;
                default:
                    
            }
        } while (opciones != 2);

    }
}
