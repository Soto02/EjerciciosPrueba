/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import conexion.ConexionMysql;
import java.util.ArrayList;
import java.util.List;
import modelo.ProductoModelo;

/**
 *
 * @author alexs
 */
public class DAOProducto {
    
    private ConexionMysql fabricaConexion;

    public DAOProducto() {
        this.fabricaConexion = new ConexionMysql();
    }
    
    public boolean registrar(ProductoModelo productoModelo) {
        
        try {
            
            String sql = "INSERT INTO db_producto(id,codigo,nombre,categoria,compra,obsequio,precio,estado) "
                    + " VALUES(?,?,?,?,?,?,?,?)";
            
            Connection conexion = this.fabricaConexion.getConnection();
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setInt(1, productoModelo.getId());
            sentencia.setString(2, productoModelo.getCodigo());
            sentencia.setString(3, productoModelo.getNombre());
            sentencia.setString(4, productoModelo.getCategoria());
            
            sentencia.setBoolean(5, productoModelo.isCompra());
            sentencia.setBoolean(6, productoModelo.isRegalo());
            
            sentencia.setDouble(7, productoModelo.getPrecio());
            sentencia.setString(8, productoModelo.getEstado());
            
            sentencia.executeUpdate();
            
            sentencia.close();
            conexion.close();
            
            return true;
            
        } catch (Exception e) {
            
            System.out.println("Hubo un error en el proceso de agregar producto.");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
            
            return false;
        }
    }
    
    public List<ProductoModelo> listar() {
        
         List<ProductoModelo> listaProducto = new ArrayList<>();
         
        try {
            
            String sql = "SELECT * from db_producto";
            
            Connection conexion = this.fabricaConexion.getConnection();
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            ResultSet resultado = sentencia.executeQuery();
            
            while(resultado.next()) {
                ProductoModelo prod = new ProductoModelo();
                
                prod.setId(resultado.getInt(1));
                prod.setCodigo(resultado.getString(2));
                prod.setNombre(resultado.getString(3));
                prod.setCategoria(resultado.getString(4));
                prod.setCompra(resultado.getBoolean(5));
                prod.setRegalo(resultado.getBoolean(6));
                prod.setPrecio(resultado.getDouble(7));
                prod.setEstado(resultado.getString(8));
                
                listaProducto.add(prod);
            }
            
            resultado.close();
            sentencia.close();
            conexion.close();
            
        } catch (Exception e) {
            
            System.out.println("Hubo un error en el proceso de listar producto.");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        }
        return listaProducto;
    }
    
    public boolean editar(ProductoModelo productoModelo) {
        
        try {
            
            String sql = "UPDATE db_producto set codigo=?, nombre=?, categoria=?, compra=?, obsequio=?, precio=?, estado=? WHERE id=?";
            
            Connection conexion = this.fabricaConexion.getConnection();
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setString(1, productoModelo.getCodigo());
            sentencia.setString(2, productoModelo.getNombre());
            sentencia.setString(3, productoModelo.getCategoria());
            
            sentencia.setBoolean(4, productoModelo.isCompra());
            sentencia.setBoolean(5, productoModelo.isRegalo());
            
            sentencia.setDouble(6, productoModelo.getPrecio());
            sentencia.setString(7, productoModelo.getEstado());
            
            sentencia.setInt(8, productoModelo.getId());
            
            sentencia.executeUpdate();
            
            sentencia.close();
            conexion.close();
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Hubo un error en el proceso de editar producto.");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
            
            return false;
        }
        
    }
    
    public boolean eliminar(int id) {
        try {
            String sql = "DELETE FROM db_producto where id=?";
            
            Connection conexion = this.fabricaConexion.getConnection();
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setInt(1, id);
            
            sentencia.executeUpdate();
            
            sentencia.close();
            conexion.close();
            
            return true;
            
        } catch (Exception e) {
            
            System.out.println("Hubo un error en el proceso de eliminar producto.");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
            
            return false;
        }
    }
    
    public List<ProductoModelo> consultar( boolean activo, boolean inactivo ) {
        
        List<ProductoModelo> listaProductos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * from db_producto where ";
            
            if(activo) {
                sql=  sql + "estado = 'Activo'";
            }
            if(inactivo) {
                sql = sql + "estado = 'Inactivo'";
            }
            
            System.out.println("Imprimiendo la sentencia sql.");
            System.out.println(sql);
            
            Connection conexion = this.fabricaConexion.getConnection();
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            ResultSet resultado = sentencia.executeQuery();
            
            while(resultado.next()) {
                ProductoModelo prod = new ProductoModelo();
                
                prod.setId(resultado.getInt(1));
                prod.setCodigo(resultado.getString(2));
                prod.setNombre(resultado.getString(3));
                prod.setCategoria(resultado.getString(4));
                prod.setCompra(resultado.getBoolean(5));
                prod.setRegalo(resultado.getBoolean(6));
                prod.setPrecio(resultado.getDouble(7));
                prod.setEstado(resultado.getString(8));
                
                listaProductos.add(prod);
            }
            
            resultado.close();
            sentencia.close();
            conexion.close();
            
        } catch (Exception e) {
            
            System.out.println("Hubo un error en el proceso de listar los producto.");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        }
        return listaProductos;
      
    }
    
}
