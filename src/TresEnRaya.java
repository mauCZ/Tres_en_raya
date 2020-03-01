import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class TresEnRaya {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner inp = new Scanner(System.in);
	
	private HashMap<Integer,Jugador> mapita;
	//private Tablero tablero;
	private Jugador jugador1;
	private Jugador jugador2;
	private GUI interfaz;
	
	public TresEnRaya(String nombreJug1, String nombreJug2) {
		//tablero = new Tablero();
		jugador1 = new Jugador(nombreJug1);
		jugador2 = new Jugador(nombreJug2);
		mapita = new HashMap<Integer,Jugador>();
		interfaz = new GUI("3 EN RAYA");
	}
	public TresEnRaya() {
		//tablero = new Tablero();
		jugador1 = new Jugador("jugador1");
		jugador2 = new Jugador("jugador2");
		mapita = new HashMap<Integer,Jugador>();
		interfaz = new GUI("3 EN RAYA");
	}
	
	
	public void accion() {
		System.out.println("boton presionado");
	}
	
	/*public void jugar() throws IOException {
		int turno = 0;
		System.out.println("Bienvenido");
		System.out.println("Nombre jugador 1: ");
		String s1 = in.readLine();
		System.out.println("Nombre jugador 2: ");
		String s2 = in.readLine();
		jugador1.setNombre(s1);
		jugador2.setNombre(s2);
		
		mapita.put(0,jugador1);
		mapita.put(1,jugador2);
		int x,y;
		String d;
		while(!tablero.juegoTerminado()) {
			System.out.println("Turno de "+mapita.get(turno).getNombre());
			System.out.println("Introduce las coordenadas: ");
			x = inp.nextInt();
			y = inp.nextInt();
			while(!tablero.jugarCasilla(x, y, turno)) {
				System.out.println("Error, introduce de nuevo: ");
				x = inp.nextInt();
				y = inp.nextInt();
			}
			System.out.println(tablero);
			turno = 1-turno;
		}
		turno = 1 - turno;
		System.out.println("GANADOR: "+mapita.get(turno).getNombre());
	}*/
}
