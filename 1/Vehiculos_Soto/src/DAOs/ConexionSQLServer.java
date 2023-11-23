/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

/**
 *
 * @author dam
 */
import Recursos.Vehiculo;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;

public class ConexionSQLServer {
    
    static Connection con=null;
    static Statement st=null;
    static ResultSet rs=null;
    static PreparedStatement pst=null;
    static String url = "jdbc:mysql://localhost:3306/sys";
    static String usuario = "root";
    static String contraseña = "dam1";
        
    public static Connection enlace(Connection con) {
        
        try {
            con = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado correctamente a la base de datos. ");
            con.close();
            
        } catch(SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return con;
    }
    
    public static ResultSet consulta() {
        con = enlace(con);
        
        try {
            st=con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try {
            rs = st.executeQuery("SELECT * FROM vehiculo");
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return rs;
    }
    
    public static int consultaBorrar(String matricula) {
        int respuesta = 0;
        
        con = enlace(con);
        
        try {
            pst = con.prepareStatement("DELETE FROM vehiculo WHERE matricula = ?");
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        try {
             pst.setString(1, matricula);
            respuesta = pst.executeUpdate();
        } catch (SQLException ex) {
           System.out.println("Error: " + ex.getMessage());
        }
        
        return respuesta;
    }
    
    public static int consultaInsertar(Vehiculo vehiculo) {
        int respuesta = 0;
          
        con=enlace(con);
        
        try {
            pst=con.prepareStatement("INSERT INTO vehiculo(marca,modelo,matricula) VALUES(?,?,?);");
        } catch (SQLException ex) {
            System.out.println("excepcion");
        }
        try {
            pst.setString(1, vehiculo.getMarca());
            pst.setString(2, vehiculo.getModelo());
            pst.setString(3, vehiculo.getMatricula());
            respuesta = pst.executeUpdate();
        } catch (SQLException ex) {
           System.out.println("Error: " + ex.getMessage());
        }
        
        return respuesta;     
    }
    
    public static int consultaModificar(Vehiculo vehiculo, String matricula) {
           int respuesta = 0;
          
         con=enlace(con);
        try {
            pst=con.prepareStatement("UPDATE vehiculo SET marca = ?, modelo = ?, matricula = ? WHERE matricula = ?");
        } catch (SQLException ex) {
            System.out.println("excepcion");
        }
        try {
            pst.setString(1, vehiculo.getMarca());
            pst.setString(2, vehiculo.getModelo());
            pst.setString(3, vehiculo.getMatricula());
            pst.setString(4, matricula);
            respuesta = pst.executeUpdate();
            
        } catch (SQLException ex) {
           System.out.println("error en la query");
        }
        
        return respuesta;
          
    }
    
    public static ArrayList imprimirConsulta(ResultSet rs){
        ArrayList lista = new ArrayList();
         try {
            while (rs.next()){
                System.out.print(rs.getInt(1)+"    ");
                System.out.print(rs.getString("marca")+"     ");
                System.out.print(rs.getString("modelo")+"     ");
                System.out.println(rs.getString("matricula"));
                lista.add(new Vehiculo(rs.getString("marca"), rs.getString("modelo"), rs.getString("matricula")));
            }
        } catch (SQLException ex) {
            System.out.println("Error en resultset:");
            ex.printStackTrace();
        }
        
        return lista;
     }
              
    public static void cerrarSesion() {
        try {
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQLServer.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void main(String[] args) {
        con = enlace(con);
        rs = consulta();
        imprimirConsulta(rs);
        cerrarSesion();
    }
}
