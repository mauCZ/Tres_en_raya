import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;



public class GUI extends JFrame{
	
	public GUI(String nombre) {
		
		super(nombre);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,400,200,400);
		setLocationRelativeTo(null);
		
		/*JButton boton1 = new JButton("boton1");
		add(boton1,BorderLayout.CENTER);*/
		
	}
}
