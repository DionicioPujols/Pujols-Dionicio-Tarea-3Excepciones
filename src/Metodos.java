import java.util.*;

public class Metodos {  
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static void validarUsuario(String nombre, int edad, String correo, double salario) throws Exception {
        // Validación del Nombre
        if (nombre == null || nombre.trim().isEmpty() || nombre.trim().length() < 3) {
            throw new NombreInvalidoException("El nombre debe contener al menos 3 caracteres.");
        }else{
            System.out.println("Nombre ingresado correctamente.");
        }

        // Validación de la Edad
        if (edad < 18 || edad > 100) {
            throw new EdadInvalidaException("La edad debe ser mayor o igual a 18 años y menor o igual a 100 años.");
        }else{
            System.out.println("Edad ingresada correctamente.");
        }

        // Validación del Correo Electrónico
        if (!correo.contains("@") || !correo.contains(".")) {
            throw new CorreoInvalidoException("El correo electrónico no es válido.");
        }else{
            System.out.println("Correo ingresado correctamente.");
        }

        // Validación del Salario
        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario debe ser mayor que cero.");
        }else{
            System.out.println("Salario ingresado correctamente.");
        }
    }

    public static void RegistrarUsuario(Scanner sc) {
        System.out.println("|| --- REGISTRAR USUARIO --- ||\n");
        
            try {
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();       
            sc.nextLine();             

            System.out.print("Ingrese su correo: ");
            String correo = sc.nextLine();

            System.out.print("Ingrese su salario: ");
            double salario = sc.nextDouble(); 
            sc.nextLine();             

            validarUsuario(nombre, edad, correo, salario);

            System.out.println("\nEl usuario ha sido registrado exitosamente...");

        } catch (NombreInvalidoException a) {
            System.out.println("\nError: " + a.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (CorreoInvalidoException i) {
            System.out.println("\nError: " + i.getMessage());
        } catch (SalarioInvalidoException o) {
            System.out.println("\nError: " + o.getMessage());
        } catch (InputMismatchException u) {
            sc.nextLine();
            System.out.println("\nError: Debe ingresar un número válido.");
        } catch (Exception e) {
            System.out.println("\nError inesperado: " + e.getMessage());
        } finally {
            System.out.println("Proceso finalizado.");
        }
    }
}