import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Prueba1 extends JFrame{
	
	JLabel l1,l2;
	
	public Prueba1() {
		initComponents();
		
		setBounds(500,400,300,400);
		setLayout(new FlowLayout(FlowLayout.LEFT,100,30));
		
		setVisible(true);
	}
	private void initComponents() {
		l1 = new JLabel("l1",SwingConstants.CENTER);
		l2 = new JLabel("l2",SwingConstants.CENTER);
		
		
		l1.setBackground(Color.blue);
		l2.setBackground(Color.green);
		
		l1.setPreferredSize(new Dimension(60,30));
		l2.setPreferredSize(new Dimension(60,30));
		
		l1.setOpaque(true);
		l2.setOpaque(true);
		
		getContentPane().add(l1);
		getContentPane().add(l2);
	}
}