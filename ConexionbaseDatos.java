
package ConexionBaseDatos;

import conexionbd.Conexion;
import controlador.Pacientedb;
import Modelo.Pacientes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConexionbaseDatos {
 
    public static void main(String[] args) {
  
       Pacientedb pacientesdb = new Pacientedb();
      // Pacientes paciente = new Pacientes(2,"1104316243","Danny","Merino","Loja","merino9@gmail.com","0989125506");
      
      // if(pacientesdb.registarPaciente(paciente)){
       
           //System.out.println("Paciente guardado en labase de datos");
       
     //  }else{
           
          //  System.out.println("Error al guardar los datos");
       
       }

}
    //ACtualizar la persona e la base de datos.
   // public boolean actualizar(Pacientes paciente) {
        // Conexion con la base de datos.
       // Connection connect = null;
        //Interfaz de acceso a la base de datos.
       // Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
      //  boolean actualizar = false;
        //Contatenando la opcion de actualizacion
       // String sql = "UPDATE `ejercicio`.`persona` SET `cedula` = '" + paciente.getCedula() + "', `nombre` = '" + paciente.getNombre() + "', `apellido` = '" + paciente.getApellido() + "', `direccion` = '" + paciente.getDireccion() + "', `correo` = '" + paciente.getCorreo() + "', `telefono` = '" + paciente.getTelefono() + "' WHERE (`idpersona` = '" + paciente.getIdpacientes() + "');";
       // try {
        //    Conexion con = new Conexion();
        //    connect = con.conectarBaseDatos();
            //Puente entre la conexion y el codigo
       //     stm = connect.createStatement();
       //     stm.execute(sql);
      //      actualizar = true;
      //  } catch (SQLException e) {
      //      System.out.println("Error:" + e.getMessage());
       // }
       // return actualizar;
   // }
    //Eliminar una persona en base al ID de la persona seleccionada de la base de datos.
   // public boolean eliminar(Pacientes paciente) {
     //   Connection connect = null;
      //  Statement stm = null;
      //  boolean eliminar = false;
       // String sql = "DELETE FROM `ejercicio`.`persona` WHERE (`idpersona` = '" + String.valueOf(paciente.getIdpacientes()) + "');";
       // try {
       //     connect = new Conexion().conectarBaseDatos();
        //    stm = connect.createStatement();
         //   stm.execute(sql);
         //   eliminar = true;
       // } catch (SQLException e) {
      //      System.out.println("Error: " + e.getMessage());
      //  }
      //  return eliminar;
   // }
   ///Sirve para traer todos los registros de persona de la base de datos 
    //public List<Pacientes> obtenerPersonas() {
       // Connection co = null;
        //Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
       // ResultSet rs = null;
       // String sql = "SELECT * FROM ejercicio.persona;";
       // List<Pacientes> listaPersonas = new ArrayList<Pacientes>();
       // try {
           // co = new Conexion().conectarBaseDatos();
           // stm = co.createStatement();
           //// rs = stm.executeQuery(sql);
          //  while (rs.next()) {
               // Pacientes c = new Pacientes();
              //  c.setIdpacientes(rs.getInt(1));
               // c.setCedula(rs.getString(2));
               // c.setNombre(rs.getString(3));
               // c.setApellidos(rs.getString(4));
              //  c.setDireccion(rs.getString(5));
              //  c.setCorreo(rs.getString(6));
             //   c.setTelefono(rs.getString(7));
            //    listaPersonas.add(c);
           // }
          ///  stm.close();
           // rs.close();
            //co.close();
       // } catch (SQLException e) {
       //     System.out.println("Error:"+ e.getMessage());
      //  }

     //   return listaPersonas;
    //}
    
    //Metodo para buscar una persona por cedula
   // public Pacientes getPersonaCedula(String cedula) {
       // Connection co = null;
       // Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
       // ResultSet rs = null;
       // Pacientes c = null;
       // String sql = "SELECT * FROM ejercicio.persona where cedula like "+cedula+";";
     //   try {
           // co = new Conexion().conectarBaseDatos();
           // stm = co.createStatement();
           // rs = stm.executeQuery(sql);
           // while (rs.next()) {
              //  c = new Pacientes();
               // c.setIdpacientes(rs.getInt(1));
               // c.setCedula(rs.getString(2));
              //  c.setNombre(rs.getString(3));
              //  c.setApellidos(rs.getString(4));
              //  c.setDireccion(rs.getString(5));
              //  c.setCorreo(rs.getString(6));
               // c.setTelefono(rs.getString(7));
          //  }
          //  stm.close();
       //     rs.close();
      //      co.close();
      //  } catch (SQLException e) {
      //      System.out.println("Error:"+ e.getMessage());
     //   }
     //   return c;
    //}
    
    //Metodo para buscar una persona por cedula
    //public List<Pacientes> getPersonaNombre(String nombre) {
       // Connection co = null;
       // Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
       // ResultSet rs = null;
      //  List<Pacientes> personasEncontradas = new ArrayList<>();
      //  String sql = "SELECT * FROM ejercicio.persona where nombres like \"%"+nombre+"%\"";
      //  try {
        //    co = new Conexion().conectarBaseDatos();
          //  stm = co.createStatement();
          //  rs = stm.executeQuery(sql);
           // while (rs.next()) {
            //    Pacientes c = new Pacientes();
            //    c.setIdpacientes(rs.getInt(1));
             //   c.setCedula(rs.getString(2));
             //   c.setNombre(rs.getString(3));
           //     c.setApellidos(rs.getString(4));
           //     c.setDireccion(rs.getString(5));
          //     c.setCorreo(rs.getString(6));
          //      c.setTelefono(rs.getString(7));
          //      personasEncontradas.add(c);
          //  }
         //   stm.close();
         //   rs.close();
         //   co.close();
//        } catch (SQLException e) {
         //   System.out.println("Error:"+ e.getMessage());
//        }
       // return personasEncontradas;
 //   }

    
//}

