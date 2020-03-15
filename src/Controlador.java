import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * La clase controlador se encarga de manejar los eventos generados por el usuario en la vista
 * y saber que hacer con ellos, actualizar vista o manipular el modelo
 */
import java.util.HashMap;
import java.util.Scanner;
public class Controlador {
	Vista vista;
	Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		listeners(vista);
	}
	
	public void listeners(Vista v) {
		vista.addActionListeners(new ListenerBoton());
	}
	
	class ListenerBoton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton botonPressed = (JButton)e.getSource();
			if(vista.pressReiniciar(botonPressed)) {
				modelo.reiniciarJuego();
				vista.reiniciarJuego();
				System.out.println("reiniciar");
			}
			else {
				//jugamos una posicion
				int turno;
				Par posPressed = vista.botonPresionado(botonPressed);
				turno = modelo.getTurno();
				modelo.jugarCasilla(posPressed.x,posPressed.y);
				vista.jugarPos(posPressed.x,posPressed.y, turno);
				
				//verificamos si el juego ha terminado en victoria o empate
				if(modelo.juegoTerminado()) {
					
					vista.terminoJuego(modelo.getTurno());
				}
				else if(modelo.juegoEmpatado()) {
					vista.terminoJuego(0);
				}
			}
		}
	}
}
