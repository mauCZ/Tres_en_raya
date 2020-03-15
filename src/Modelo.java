
//Esta clase es el Modelo de MVC de nuestra aplicacion 3 en raya, el modelo guarda el estado
//del juego y tambien realizar la logica o las operaciones sobre el tablero de tic-tac-toe
public class Modelo {
	int turno;
	char grilla[][];
	
	public Modelo() {
		grilla = new char[3][3];
		iniciarJuego();
	}
	public void reiniciarJuego() {
		iniciarJuego();
	}
	private void iniciarJuego() {
		turno = 1;
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				grilla[i][j] = ' ';
			}
		}
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
		if(grilla[0][0]!=' ' && grilla[0][0]==grilla[1][1] && grilla[1][1]==grilla[2][2]) return true;
		if(grilla[2][0]!=' ' && grilla[2][0]==grilla[1][1] && grilla[1][1]==grilla[0][2]) return true;
		return false;
	}
	public boolean juegoEmpatado() {
		if(!juegoTerminado()) {
			for(int i =0;i<3;i++)
				for(int j=0;j<3;j++)
					if(grilla[i][j] == ' ') return false;
			
			return true;
		}
		return false;
	}
	/*
	 * Verificamos si una columna o una fila ya estan llenas con fichas del mismo tipo, si es asi, pues el juego termino.
	 */
	private boolean columnaLlena(int col) {
		if(grilla[0][col] != ' ') {
			return grilla[0][col] == grilla[1][col] && grilla[1][col] == grilla[2][col];
		}
		return false;
	}
	private boolean filaLlena(int fila) {
		if(grilla[fila][0] != ' ') {
			return grilla[fila][0] == grilla[fila][1] && grilla[fila][1] == grilla[fila][2];
		}
		return false;
	}
	public int getTurno() {
		return turno;
	}
	public void jugarCasilla(int x,int y) {
		char c;
		if(turno == 1) c = 'X';
		else c = 'O';
		
		grilla[x][y] = c;
		
		if(turno == 1) turno = 2;
		else turno = 1;
	}
}
