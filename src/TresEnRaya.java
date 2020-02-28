
public class TresEnRaya {

	private Tablero tablero;
	private Jugador jugador1;
	private Jugador jugador2;
	
	public TresEnRaya(String nombreJug1, String nombreJug2) {
		tablero = new Tablero();
		jugador1 = new Jugador(nombreJug1);
		jugador1 = new Jugador(nombreJug2);
	}
	public TresEnRaya() {
		tablero = new Tablero();
		jugador1 = new Jugador("jugador1");
		jugador2 = new Jugador("jugador2");
	}

}
