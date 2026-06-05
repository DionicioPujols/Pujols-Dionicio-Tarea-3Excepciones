import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        do {
            System.out.println("|| ==================================== ||");
            System.out.println("||    SISTEMA PARA REGISTRAR USUARIOS   ||");
            System.out.println("|| ==================================== ||");
            System.out.println("|| 1. Registrar usuario                 ||");
            System.out.println("|| 2. Salir                             ||");
            System.out.println("|| ==================================== ||");
            System.out.print("\nSeleccione una opcion: ");
            opciones = sc.nextInt();
            sc.nextLine(); 

            switch (opciones) {
                case 1:
                    Metodos.AgregarUsuario(sc);
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        } while (opciones != 2);

    }
}
