package Recursos;

public class Cliente {
    
    private String nombre;
    private String dni;
    
    public Cliente() {
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString() {
        return "Cliente [nombre= " + nombre + ", dni= " + dni + "]";
    }
}
