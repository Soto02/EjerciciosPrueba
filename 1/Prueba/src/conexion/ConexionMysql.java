/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alexs
 */
public class ConexionMysql {
    
    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/db_crud_java_swing";
    private String usuario = "mysqlexamen";
    private String contraseña = "123456";
    
    private String driver = "com.mysql.cj.jdbc.Driver";

    public ConexionMysql() {
        try {
            Class.forName(driver);
            
            connection = DriverManager.getConnection(url, usuario, contraseña);
            
            if(connection != null) {
                System.out.println("Conexion realizada correctamente.");
            }
            
        } catch(Exception e) {
            
            System.out.println("Hubo un error en la conexión.");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        
        ConexionMysql conexion = new ConexionMysql();
    }
}
