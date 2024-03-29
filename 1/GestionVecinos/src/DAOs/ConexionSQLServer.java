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

//Gestion vecinos
public class ConexionSQLServer {
    
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/db_crud_java_swing";
    private String usuario = "mysqlexamen";
    private String contraseña = "123456";
    
    private String driver = "com.mysql.cj.jdbc.Driver";//com.mysql.cj.jdbc.Driver
    
    public ConexionSQLServer() {
        try {
            Class.forName(driver);
            
            connection = DriverManager.getConnection(url, usuario, contraseña);
            
            if(connection != null) {
                System.out.println("Conexion realizada correctamente.");
            }
            
        } catch(Exception e) {
            
            System.out.println("Hubo un error en la conexión.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        
        ConexionSQLServer conexion = new ConexionSQLServer();
    }
}
