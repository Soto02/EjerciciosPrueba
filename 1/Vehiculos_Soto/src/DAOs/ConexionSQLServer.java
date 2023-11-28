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

    static Connection connection = null;
    static Statement statement = null;
    static ResultSet result = null;
    static PreparedStatement pst = null;
    static String url = "jdbc:mysql://localhost:3306/sys";
    static String usuario = "root";
    static String contraseña = "dam1";

    public static Connection enlace(Connection con) {

        try {
            con = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado correctamente a la base de datos. ");
            statement = con.createStatement();

        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return con;
    }

    public static ResultSet consulta() {
        connection = enlace(connection);

        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error creando declaración: " + ex.getMessage());
        }
        try {
            result = statement.executeQuery("SELECT * FROM vehiculos");
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia SELECT: " + ex.getMessage());
        }
        return result;
    }
    public static int consultaInsertar(Vehiculo vehiculo) {
        int respuesta = 0;

        connection = enlace(connection);

        try {
            pst = connection.prepareStatement("INSERT INTO vehiculos(marca,modelo,matricula) VALUES(?,?,?);");
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia INSERT INTO: " + ex.getMessage());
        }
        try {
            pst.setString(1, vehiculo.getMarca());
            pst.setString(2, vehiculo.getModelo());
            pst.setString(3, vehiculo.getMatricula());
            respuesta = pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error1: " + ex.getMessage());
        }

        return respuesta;
    }

    public static int consultaBorrar(String matricula) {
        int respuesta = 0;

        connection = enlace(connection);

        try {
            pst = connection.prepareStatement("DELETE FROM vehiculos WHERE matricula = ?");
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia DELETE: " + ex.getMessage());
        }

        try {
            pst.setString(1, matricula);
            respuesta = pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return respuesta;
    }

    

    public static int consultaModificar(Vehiculo vehiculo, String matricula) {
        int respuesta = 0;

        connection = enlace(connection);
        try {
            pst = connection.prepareStatement("UPDATE vehiculos SET marca = ?, modelo = ?, matricula = ? WHERE matricula = ?");
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia UPDATE: " + ex.getMessage());
        }
        try {
            pst.setString(1, vehiculo.getMarca());
            pst.setString(2, vehiculo.getModelo());
            pst.setString(3, vehiculo.getMatricula());
            pst.setString(4, matricula);
            respuesta = pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error2: " + ex.getMessage());
        }

        return respuesta;

    }

    public static ArrayList imprimirConsulta(ResultSet rs) {
        ArrayList lista = new ArrayList();
        try {
            System.out.print("Marca ");
            System.out.print("Modelo ");
            System.out.println("Matricula ");
            while (rs.next()) {
                //System.out.print(rs.getInt(1)+"    ");
                System.out.print(rs.getString("marca") + "     ");
                System.out.print(rs.getString("modelo") + "     ");
                System.out.println(rs.getString("matricula"));
                lista.add(new Vehiculo(rs.getString("marca"), rs.getString("modelo"), rs.getString("matricula")));
            }
        } catch (SQLException ex) {
            System.out.println("Error en imprimir la consulta. " + ex.getMessage());
            ex.printStackTrace();
        }

        return lista;
    }

    public static void cerrarSesion() {
        try {
            result.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQLServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        connection = enlace(connection);
        result = consulta();
        imprimirConsulta(result);
        cerrarSesion();
    }
}
