
package Modelo;

public class Pacientes {
    
    private int idpacientes;
    private String cedula;
    private String nombre; 
    private String apellido;
    private String direccion;
    private String correo; 
    private String telefono;

    //Constructor
    public Pacientes(int idpacientes, String cedula, String nombre, String apellido, String direccion, String correo, String telefono) {
        this.idpacientes = idpacientes;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo =  correo;
        this.telefono = telefono;
    }

    public Pacientes(){
    }
    

    
// get and seters
    
    public int getIdpacientes() {
        return idpacientes;
    }

    public void setIdpacientes(int idpacientes) {
        this.idpacientes = idpacientes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String corrreo) {
        this.correo = corrreo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
     @Override
    public String toString() {
        return "Pacientes{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellido + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

    
    
}
