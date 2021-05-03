
package controlador;

import Modelo.HistorialClinico;
import Modelo.Pacientes;
import conexionbd.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utilidades.utilidades;


public class HistorialClinicodb {
     private utilidades utilidades;
     
      public HistorialClinicodb() {
        this.utilidades = new utilidades();
    }
      public boolean registarHistorialClinico(HistorialClinico historialclinico){
    
        boolean registrar = false;
        //interfaz de acceso a la base de datos
        Statement stm = null;
        // Conexion con la base de datos
        Connection con = null;
        
        
        String sql = "INSERT INTO `consultorio`.`historialclinico`(`idhistorialclinico`,`Cedula`,`Nombre`,`Apellido`,`Edad`,`Sexo`,`Ocupacion`,`Direccion`,`Correo`,`Telefono`) VALUES('"
       +String.valueOf(historialclinico.getIdhistorialclinico())+"','"
       +historialclinico.getCedula()+"','"
       +historialclinico.getNombre()+"','"
       +historialclinico.getApellido()+"','"
       +historialclinico.getEdad()+"','"  
       +historialclinico.getSexo()+"','" 
       +historialclinico.getOcupacion()+"','"         
       +historialclinico.getDireccion()+"','"
       +historialclinico.getCorreo()+"','"
       +historialclinico.getTelefono()+"');";
       
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
    public boolean actualizar(HistorialClinico historialclinico) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `consultorio`.`historialclinico` SET `cedula` = '" + historialclinico.getCedula() + "', `nombres` = '" + historialclinico.getNombre() + "', `apellidos` = '" + historialclinico.getApellido() + "',`edad`='" +historialclinico.getEdad() + "',`sexo`='"+historialclinico.getSexo()+"',`ocupacion`='"+historialclinico.getOcupacion()+"', `direccion` = '" + historialclinico.getDireccion() + "', `correo` = '" + historialclinico.getCorreo() + "', `telefono` = '" + historialclinico.getTelefono() + "' WHERE (`idpersona` = '" + historialclinico.getIdhistorialclinico() + "');";
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
    public boolean eliminar(HistorialClinico historialclinico) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `consultorio`.`historialclinico` WHERE (`idpacientes` = '" + String.valueOf(historialclinico.getIdhistorialclinico()) + "');";
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
    public List<HistorialClinico> obtenerHistorialClinico() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM consultorio.historialclinico;";
        List<HistorialClinico> listaHistorialClinico = new ArrayList<HistorialClinico>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                HistorialClinico c = new HistorialClinico();
                c.setIdhistorialclinico(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setEdad(rs.getInt(5));
                c.setSexo(rs.getString(6));
                c.setOcupacion(rs.getString(7));
                c.setDireccion(rs.getString(8));
                c.setCorreo(rs.getString(9));
                c.setTelefono(rs.getString(10));
                listaHistorialClinico.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaHistorialClinico;
    }
    
    //Metodo para buscar una persona por cedula
    public HistorialClinico getHistorialClinicoCedula(String cedula) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        HistorialClinico c = null;
        String sql = "SELECT * FROM consultorio.historialclinico where cedula like "+cedula+";";
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new HistorialClinico();
                c.setIdhistorialclinico(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setEdad(rs.getInt(4));
                c.setSexo(rs.getString(5));
                c.setOcupacion(rs.getString(6));
                c.setDireccion(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setTelefono(rs.getString(9));
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
    public List<HistorialClinico> getHistorialClinicoNombre(String nombre) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        List<HistorialClinico> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM consultorio.historialclinico where nombres like \"%"+nombre+"%\"";
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                
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
