/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.JugadorDAO;
import java.util.List;
import modelo.ModeloJugador;

/**
 *
 * @author dam
 */
public class JugadorControler {
    
    private JugadorDAO jugadorDAO;
    
    public JugadorControler() {
        this.jugadorDAO = new JugadorDAO();
    }
    
    public List<ModeloJugador> listar(){
        List<ModeloJugador> listaJugadores = this.jugadorDAO.obtenerJugadores();
        
        return listaJugadores;
    }
    
    public List<ModeloJugador> consultar(String dato) {
        List<ModeloJugador> listaJugadores = this.jugadorDAO.consultar(dato);
        
        return listaJugadores;
    }
}
