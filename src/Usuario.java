public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private double salario;

    //Constructores
    public Usuario(){
        setNombre("");
        setEdad(0);
        setCorreo("");
        setSalario(0);
    }

    public Usuario(String nombre, int edad, String correo, double salario){
        setNombre(nombre);
        setEdad(edad);  
        setCorreo(correo);
        setSalario(salario);
    }

    //getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCorreo(){
        return correo;
    }
    public double getSalario(){
        return salario;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
