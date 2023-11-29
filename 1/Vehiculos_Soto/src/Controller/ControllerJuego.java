package Controller;


import javax.swing.JOptionPane;
import Recursos.GestionVehiculo;
import Vista.PanelJuego;

public class ControllerJuego{
	
	private GestionVehiculo gestionVehiculos;
	
	private PanelJuego panelJuego;
	
	public ControllerJuego(PanelJuego panelJuego) 
	{
		
		gestionVehiculos = new GestionVehiculo();
		this.panelJuego= panelJuego;
	}

	public  void nuevoCoche()
	{ panelJuego.etiSecreta.setText(gestionVehiculos.getVehiculo());
		
	}
	
	public  void comprobarCoche()
	{ String palabra =  panelJuego.txtRespuesta.getText().toString();
		if (gestionVehiculos.compara(palabra)) 
			JOptionPane.showMessageDialog(panelJuego, "Correcto");
		else JOptionPane.showMessageDialog(panelJuego, "Incorrecto");
		
	}

}
