
//Esta clase es el Modelo de MVC de nuestra aplicacion 3 en raya, el modelo guarda el estado
//del juego y tambien realizar la logica o las operaciones sobre el tablero de tic-tac-toe
public class Modelo {
	
	char grilla[][];
	
	public Modelo() {
		grilla = new char[3][3];
		iniciarGrilla();
	}
	
	public String toString() {
		String resultado = "   0 1 2 \n   _ _ _ \n";
		
		for(int i =0;i<3;i++) {
			resultado += (i);
			resultado += " |";
			for(int j =0;j<3;j++) {
				resultado += grilla[i][j];
				resultado += '|';
			}
			resultado += '\n';
		}
		resultado += "   - - - \n";
		
		return resultado;
	}
	public void mostrar() {
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print(grilla[i][j]);
			}
			System.out.println();
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
			if(grilla[i][j] == ' ') {
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
				grilla[i][j] = ' ';
			}
		}
	}
}