package src;
import java.lang.reflect.Array;
import java.util.*;

public class Metodos {  
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void AgregarUsuario(){
        System.out.println("|| --- REGISTRAR USUARIO --- ||\n");
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su correo: ");
        String correo = sc.nextLine();
        System.out.print("Ingrese su salario: ");
        double salario = sc.nextDouble();
        Usuario usuarios = new Usuario(nombre, edad, correo, salario);
        listaUsuarios.add(usuarios);
        System.out.println("Usuario agregado con exito... ");
    }    
}
