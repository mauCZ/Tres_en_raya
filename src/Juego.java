
public class Juego {

	public static void main(String[] args) {

		Tablero t = new Tablero();
		t.jugarCasilla(0, 2, 1);
		t.jugarCasilla(0, 0, 0);
		
		System.out.println(t);
	}

}
