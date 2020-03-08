import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

//Esta clase es la vista del modelo MVC de nuestro juego de 3 en raya :v 
public class Vista extends JFrame{
	private JLabel turnoEtiq;
	private JLabel turno;
	private JPanel panelTurno;
	private JButton panelBotones[][];
	
	public Vista() {
		
		
		configurarFrame();
	}
	private void configurarFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,400,600,600);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
}
