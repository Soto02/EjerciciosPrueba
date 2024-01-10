/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOProducto;
import java.util.List;
import modelo.ProductoModelo;

/**
 *
 * @author alexs
 */
public class ProductoControlador {
    
    private DAOProducto productoDAO;
    
    public ProductoControlador() {
        this.productoDAO = new DAOProducto();
    }
    
    public boolean registrar(ProductoModelo productoModelo) {
        
        boolean respuesta = this.productoDAO.registrar(productoModelo);
        
        return respuesta;
    }
    
    public List<ProductoModelo> listar() {
        List<ProductoModelo> listaProductos = this.productoDAO.listar();
        
        return listaProductos;
    }
    
    public boolean editar(ProductoModelo productoModelo) {
        
        boolean respuesta = this.productoDAO.editar(productoModelo);
        
        return respuesta;
    }
    
    public boolean eliminar(int id) {
        boolean respuesta = this.productoDAO.eliminar(id);
        
        return respuesta;
    }
    
    public List<ProductoModelo> consultar( boolean activo, boolean inactivo ) {
        
        List<ProductoModelo> listaProductos = this.productoDAO.consultar(activo, inactivo);
        
        return listaProductos;
    }
}
