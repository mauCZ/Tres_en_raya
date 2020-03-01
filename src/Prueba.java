import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Prueba {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("ventanita");
		
		JLabel label1 = new JLabel("hola",JLabel.CENTER);
		frame.setLayout(new FlowLayout());
		
		label1.setOpaque(true);
		//label1.setPreferredSize(new Dimension(100,200));
		label1.setBackground(Color.green);
		label1.setForeground(Color.blue);
		
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.add(label1);
		frame.setBounds(400,400,300,400);
		frame.setVisible(true);
		
	}

}
