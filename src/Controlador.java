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
	}
	
	class ListenerBoton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
