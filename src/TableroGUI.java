import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TableroGUI extends JPanel{
	JButton boton00,boton01,boton02,boton10,
			boton11,boton12,boton20,boton21,boton22;
	
	public TableroGUI() {
		boton00 = new JButton("boton00");
		boton01 = new JButton("boton01");
		boton02 = new JButton("boton02");
		boton10 = new JButton("boton10");
		boton11 = new JButton("boton11");
		boton12 = new JButton("boton12");
		boton20 = new JButton("boton20");
		boton21 = new JButton("boton21");
		boton22 = new JButton("boton22");
		
		add(boton00); add(boton01); add(boton02);
		add(boton10); add(boton11); add(boton12);
		add(boton20); add(boton21); add(boton22);
		configurarPanel();
	}
	
	
	private void configurarPanel() {
		
		setLayout(new GridLayout(3, 3));
		setVisible(true);
		
	}
}
