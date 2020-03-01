import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;


public class GUI extends JFrame{
	private JLabel turnoEtiq;
	private JLabel turno;
	private JPanel panelTurno;
    private	TableroGUI tablero;
	
	public GUI(String nombre) {
		super(nombre);
		
<<<<<<< HEAD
		panelTurno = new JPanel();
		panelTurno.setLayout(new FlowLayout());
		
		tablero = new TableroGUI();
		turno = new JLabel("nombre",JLabel.CENTER);
		turnoEtiq = new JLabel("Turno de: ",JLabel.CENTER);
		turno.setForeground(Color.white);
		turnoEtiq.setForeground(Color.white);
		panelTurno.add(turnoEtiq);
		panelTurno.add(turno);
		panelTurno.setBackground(Color.DARK_GRAY);
		
		add(panelTurno,BorderLayout.NORTH);
=======
		
		tablero = new TableroGUI();
>>>>>>> 05907a02932d8048fd7b3d98759f7b41741b1028
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
