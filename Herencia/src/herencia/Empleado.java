package herencia;

public class Empleado extends Persona{
    private double sueldo;

    public Empleado(double sueldo, String nombre, String apellido, int codigo) {
        super(nombre, apellido, codigo);
        this.sueldo = sueldo;
    }
    
    
    
}
