/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

/**
 *
 * @author dam
 */
import java.sql.*;

public class ConexionSQLServer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sys";
        String usuario = "root";
        String contraseña = "dam1";
        
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado correctamente a la base de datos. ");
            conexion.close();
            
        } catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
