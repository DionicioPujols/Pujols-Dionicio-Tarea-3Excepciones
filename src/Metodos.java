import java.util.*;

public class Metodos {  
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static void validarUsuario(String nombre, int edad, String correo, double salario) throws Exception {
        // Validación del Nombre
        if (nombre == null || nombre.trim().isEmpty() || nombre.trim().length() < 3) {
            throw new NombreInvalidoException("El nombre debe contener al menos 3 caracteres.");
        }

        // Validación de la Edad
        if (edad < 18 || edad > 100) {
            throw new EdadInvalidaException("La edad debe ser mayor o igual a 18 años y menor o igual a 100 años.");
        }

        // Validación del Correo Electrónico
        if (!correo.contains("@") || !correo.contains(".")) {
            throw new CorreoInvalidoException("El correo electrónico no es válido.");
        }

        // Validación del Salario
        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario debe ser mayor que cero.");
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

        } catch (NombreInvalidoException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (CorreoInvalidoException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (SalarioInvalidoException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("\nError: Debe ingresar un número válido.");

        } catch (Exception e) {
            System.out.println("\nError inesperado: " + e.getMessage());

        } finally {

            System.out.println("Proceso finalizado.");
        }
    }
}