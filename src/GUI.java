import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class GUI extends JFrame{
	
	TableroGUI tablero;
	
	public GUI(String nombre) {
		super(nombre);
		
		
		tablero = new TableroGUI();
		add(tablero,BorderLayout.CENTER);
		
		
		configurarFrame();
	}
	private void configurarFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,400,600,600);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
}
