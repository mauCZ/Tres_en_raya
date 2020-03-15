import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
//Esta clase es la vista del modelo MVC de nuestro juego de 3 en raya :v 
public class Vista extends JFrame{
	JPanel panPrinc;
	JPanel panEstado;
	JPanel panBoton;
	JButton botones[][];
	JButton reiniciar;
	JLabel estado;
	JPanel panReini;
	
	public Vista() {
		iniComponents();
		iniPanBotones();
		
		iniFrame();
	}
	private void iniPanBotones() {
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				botones[i][j] = new JButton(" ");
				botones[i][j].setFont(new Font("Arial",Font.BOLD, 140));
				panBoton.add(botones[i][j]);
			}
		}
	}
	public void addActionListeners(ActionListener al) {
		reiniciar.addActionListener(al);
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				botones[i][j].addActionListener(al);
			}
		}
	}
	private void iniComponents() {
		panPrinc = new JPanel(new BorderLayout());
		panEstado = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panBoton = new JPanel(new GridLayout(3,3,10,10));
		panReini = new JPanel(new FlowLayout(FlowLayout.CENTER));
		botones = new JButton[3][3];
		reiniciar = new JButton("Reiniciar");
		estado = new JLabel("Turno jugador 1");
		
		getContentPane().add(panPrinc);
		panPrinc.add(panEstado,BorderLayout.NORTH);
		panPrinc.add(panBoton,BorderLayout.CENTER);
		panPrinc.add(panReini,BorderLayout.SOUTH);
		
		//panEstado.setBackground(Color.green);
		estado.setOpaque(true);
		estado.setHorizontalAlignment(SwingConstants.CENTER);
		estado.setVerticalAlignment(SwingConstants.CENTER);
		estado.setPreferredSize(new Dimension(200,50));
		reiniciar.setPreferredSize(new Dimension(100,50));
		panEstado.add(estado);
		panReini.add(reiniciar);
	
	}
	private void iniFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void jugarPos(int x,int y,int turno) {
		char t = turnoChar(turno);
		botones[x][y].setText(Character.toString(t));
		botones[x][y].setEnabled(false);
		actEstado(turno);
	}
	public void reiniciarJuego() {
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				botones[i][j].setEnabled(true);
				botones[i][j].setText("");
			}
		}
		actEstado(1);
	}
	public void terminoJuego(int turnoGanador) {
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				botones[i][j].setEnabled(false);
			}
		}
		//empate
		
		if(turnoGanador == 0) {
			actEmpate();
		}
		else actGanador(turnoGanador);
	}
	public boolean pressReiniciar(JButton boton) {
		return reiniciar == boton;
	}
	public Par botonPresionado(JButton boton) {
		for(int i =0;i<3;i++)
			for(int j =0;j<3;j++)
				if(botones[i][j] == boton) return new Par(i,j);
		return new Par(-1,-1);
	}
	private void actEmpate() {
		estado.setText("EMPATE!!");
	}
	private void actGanador(int turno) {
		char t;
		if(turno == 2) t= 'X';
		else t = 'O';
		estado.setText("GANADOR: JUGADOR "+turno+"("+t+")");
	}
	private void actEstado(int turno) {
		char t;
		if(turno == 2) t= 'X';
		else t = 'O';
		estado.setText("Turno jugador "+turno+"("+t+")");
	}
	private char turnoChar(int turno) {
		if(turno == 1) return 'X';
		return 'O';
	}
}
class Par{
	int x,y;
	Par(int x,int y){
		this.x = x;
		this.y = y;
	}
}
