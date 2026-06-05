import java.util.*;

public class Metodos {  
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static void AgregarUsuario(Scanner sc){
        System.out.println("|| --- REGISTRAR USUARIO --- ||\n");
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su correo: ");
        String correo = sc.nextLine();
        System.out.print("Ingrese su salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        Usuario usuarios = new Usuario(nombre, edad, correo, salario);
        listaUsuarios.add(usuarios);

        System.out.println("Usuario agregado con exito... ");
    }    
}
