import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Boton extends JButton{
	
	public Boton(String s) {
		super(s);
		
	}
	public void anhadirActionListener(ActionListener al) {
		addActionListener(al);
	}
}
