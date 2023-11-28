package Recursos;

public class Cliente {
    
    private int id;
    private String nombre;
    private String dni;
    private String matricula;
    
    public Cliente() {
        
    }
    
    public int getId() {
        return id;
    }
    public void setId() {
        this.id = id;
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
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Cliente [nombre= " + nombre + ", dni= " + dni + ", matricula= " + matricula + "]";
    }
}
