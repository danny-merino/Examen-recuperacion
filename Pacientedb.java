
package controlador;

import Modelo.Pacientes;
import conexionbd.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Pacientedb {
    
    public boolean registarPaciente(Pacientes paciente){
    
        boolean registrar = false;
        //interfaz de acceso a la base de datos
        Statement stm = null;
        // Conexion con la base de datos
        Connection con = null;
        
        
        String sql = "INSERT INTO `consultorio`.`pacientes`(`idpacientes`,`Cedula`,`Nombre`,`Apellido`,`Direccion`,`Correo`,`Telefono`) VALUES('"
       +String.valueOf(paciente.getIdpacientes())+"','"
       +paciente.getCedula()+"','"
       +paciente.getNombre()+"','"
       +paciente.getApellido()+"','"
       +paciente.getDireccion()+"','"
       +paciente.getCorreo()+"','"
       +paciente.getTelefono()+"');";
       
       try{
           Conexion cn = new Conexion();
           con=cn.conectarBaseDatos();
           stm=con.createStatement();
           stm.execute(sql);
           registrar = true;
           stm.close();
           con.close();
           
       } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
            }
        
    return registrar;
}
   
    //ACtualizar la persona e la base de datos.
    public boolean actualizar(Pacientes paciente) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `consultorio`.`pacientes` SET `cedula` = '" + paciente.getCedula() + "', `nombres` = '" + paciente.getNombre() + "', `apellidos` = '" + paciente.getApellido() + "', `direccion` = '" + paciente.getDireccion() + "', `correo` = '" + paciente.getCorreo() + "', `telefono` = '" + paciente.getTelefono() + "' WHERE (`idpersona` = '" + paciente.getIdpacientes() + "');";
        try {
            Conexion con = new Conexion();
            connect = con.conectarBaseDatos();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }
    //Eliminar una persona en base al ID de la persona seleccionada de la base de datos.
    public boolean eliminar(Pacientes paciente) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `consultorio`.`pacientes` WHERE (`idpacientes` = '" + String.valueOf(paciente.getIdpacientes()) + "');";
        try {
            connect = new Conexion().conectarBaseDatos();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }
    //Sirve para traer todos los registros de persona de la base de datos 
    public List<Pacientes> obtenerPacientes() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM consultorio.pacientes;";
        List<Pacientes> listaPacientes = new ArrayList<Pacientes>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Pacientes c = new Pacientes();
                c.setIdpacientes(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                listaPacientes.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaPacientes;
    }
    
    //Metodo para buscar una persona por cedula
    public Pacientes getPacientesCedula(String cedula) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Pacientes c = null;
        String sql = "SELECT * FROM consultorio.pacientes where cedula like "+cedula+";";
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Pacientes();
                c.setIdpacientes(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }
        return c;
    }
    
    //Metodo para buscar una persona por cedula
    public List<Pacientes> getPacientesNombre(String nombre) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        List<Pacientes> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM consultorio.pacientes where nombres like \"%"+nombre+"%\"";
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Pacientes c = new Pacientes();
                c.setIdpacientes(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }
        return personasEncontradas;
    }

}

