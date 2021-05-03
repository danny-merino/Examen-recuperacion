
package Modelo;

import java.sql.Date;


public class HistorialClinico {
    private int idhistorialclinico;
    private String cedula;
    private String nombre; 
    private String apellido;
    private int edad;
     private String sexo;
    private String ocupacion;
    private String direccion;
    private String correo; 
    private String telefono;
 
    
    

    public HistorialClinico(int idhistorialclinico, String cedula, String nombre, String apellido, int edad, String sexo, String ocupacion, String direccion, String correo, String telefono) {
        this.idhistorialclinico = idhistorialclinico;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

     

    public HistorialClinico() {
    
    }
     

    public int getIdhistorialclinico() {
        return idhistorialclinico;
    }

    public void setIdhistorialclinico(int idhistorialclinico) {
        this.idhistorialclinico = idhistorialclinico;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
    
     
      @Override
    public String toString() {
        return "HistorialClinico {" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellido + ",  edad=" +edad+", sexo="+sexo+",ocupacion="+ocupacion+",direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

    
}
