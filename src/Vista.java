import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
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
				botones[i][j].setBackground(new Color(230,218,218));
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
				botones[i][j].setBackground(new Color(230,218,218));
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
	public void pintarAreaGanada(ArrayList<Par> linea,int turno) {
		//gana O
		if(turno == 1) {
			System.out.println(linea.size());
			for(Par p : linea) {
				botones[p.x][p.y].setBackground(new Color(93,240,132));
			}
		}//gana X
		else if(turno == 2) {
			System.out.println(linea.size());
			for(Par p : linea) {
				botones[p.x][p.y].setBackground(new Color(250,97,97));
			}
		}//empate
		else {
			System.out.println(linea.size());
			for(int i =0;i<3;i++) {
				for(int j =0;j<3;j++) {
					botones[i][j].setBackground(new Color(84,73,73));
				}
			}
		}
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
