
public class Tablero {
	
	char grilla[][];
	
	public Tablero() {
		grilla = new char[3][3];
		iniciarGrilla();
	}
	
	/*
	 * Este metodo sirve para verificar si el estado del juego ya amerita que termine, es decir que si ya hay un 3 en raya de cualquier
	 * turno.
	 */
	public boolean juegoTerminado() {
		for(int i =0;i<3;i++) {
			if(columnaLlena(i)) return true;
			else if(filaLlena(i)) return true;
		}
		
		return false;
	}
	
	private boolean columnaLlena(int col) {
		if(grilla[0][col] != 'n') {
			return grilla[0][col] == grilla[1][col] && grilla[1][col] == grilla[2][col];
		}
		return false;
	}
	private boolean filaLlena(int fila) {
		if(grilla[fila][0] != 'n') {
			return grilla[fila][0] == grilla[fila][1] && grilla[fila][1] == grilla[fila][2];
		}
		return false;
	}
	
	/*
	 * Este metodo intenta colocar una ficha en el tablero dependiendo del turno. Si por alguna razon no se puede o no es permitido
	 * colocar una ficha en esa casilla se devuelve false
	 */
	public boolean jugarCasilla(int i,int j,int turno) {
		if(sePuedeUsar(i,j)) {
			if(turno == 1) grilla[i][j] = 'X';
			else           grilla[i][j] = 'O';
			
			return true;
		}
		
		return false;
	}
	
	/*
	 * Este metodo privado es para verificar si podemos usar una casilla del tablero.
	 */
	private boolean sePuedeUsar(int i,int j) {
		if(i>=0 && i<=3 && j>=0 && j<=3) {
			if(grilla[i][j] == 'n') {
				return true;
			}
			return false;
		}
		return false;
	}
	/*
	 * Este metodo es para inciar la grilla con valores por defecto, metodo privado
	 */
	private void iniciarGrilla() {
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				grilla[i][j] = 'n';
			}
		}
	}
}
