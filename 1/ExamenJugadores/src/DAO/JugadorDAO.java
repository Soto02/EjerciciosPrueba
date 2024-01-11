/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexion.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.ModeloJugador;

/**
 *
 * @author dam
 */
public class JugadorDAO {
    
    private ConexionMysql fabricaConexion;

    public JugadorDAO() {
        
        this.fabricaConexion = new ConexionMysql();
    }
    
    public List<ModeloJugador> obtenerJugadores() {
        
        List<ModeloJugador> listaJugadores = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM jugador";
            
            Connection conexion = this.fabricaConexion.getConnection();
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            ResultSet resultado = sentencia.executeQuery();
            
            while(resultado.next()) {
                
                ModeloJugador jugador = new ModeloJugador();
                
                jugador.setDorsal(resultado.getInt(1));
                jugador.setNombre(resultado.getString(2));
                jugador.setPuntos(resultado.getDouble(3));
                jugador.setRebotes(resultado.getDouble(4));
                jugador.setAsistencias(resultado.getDouble(5));
                
                listaJugadores.add(jugador);
                
            }
            
            resultado.close();
            sentencia.close();
            conexion.close();

            
        } catch (Exception e) {
            System.out.println("Hubo un error al listar los jugadores.");
            System.out.println("Informacion del error: " + e.getMessage());
            e.printStackTrace();
        }
        
        return listaJugadores;
    }
    
    public List<ModeloJugador> consultar(String dato) { //int dorsal, String nombre, double puntos, double rebotes, double asistencias
        
        List<ModeloJugador> listaJugadores = new ArrayList<>();
        
        try {
            
            String sql = dato;
                    
           /*
            if(dato.equals("dorsal")) {
               sql = sql + dato + "=22";
           }
           if(dato.equals("nombre")) {
               sql = sql + dato + "='Facundo Campazzo'";
           }
           if(dato.equals("puntos")) {
               sql = sql + dato + "=12.4";
           }
           if(dato.equals("rebotes")) {
               sql = sql + dato + "=8";
           }
           if(dato.equals("asistencias")) {
               sql = sql + dato + "= 4.2";
           }
            */
           
           System.out.println("Imprimiendo la sentencia sql.");
           System.out.println(sql);
           
           Connection conexion = this.fabricaConexion.getConnection();
            
           PreparedStatement sentencia = conexion.prepareStatement(sql);
            
           ResultSet resultado = sentencia.executeQuery();
           
           while(resultado.next()) {
               ModeloJugador jugador = new ModeloJugador();
               
               jugador.setDorsal(resultado.getInt(1));
               jugador.setNombre(resultado.getString(2));
               jugador.setPuntos(resultado.getDouble(3));
               jugador.setRebotes(resultado.getDouble(4));
               jugador.setAsistencias(resultado.getDouble(5));
               
               listaJugadores.add(jugador);
           }
           
           resultado.close();
           sentencia.close();
           conexion.close();
            
        } catch (Exception e) {
            
            System.out.println("Hubo un error al hacer la consulta.");
            System.out.println("Informacion del error: " + e.getMessage());
            e.printStackTrace();
        }
        return listaJugadores;
    }
    
    
}
