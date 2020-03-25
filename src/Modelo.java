import java.awt.*;
import java.util.*;
//Esta clase es el Modelo de MVC de nuestra aplicacion 3 en raya, el modelo guarda el estado
//del juego y tambien realizar la logica o las operaciones sobre el tablero de tic-tac-toe
public class Modelo {
	int turno;
	char grilla[][];
	ArrayList<Par> linea;
	
	public Modelo() {
		grilla = new char[3][3];
		linea = new ArrayList<>();
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
	
	public boolean juegoTerminado() {
		int contO, contX,i,j;
		for(i =0;i<3;i++) {
			contO = 0; contX =0;
			for(j =0;j<3;j++) {
				if(grilla[i][j] =='X') contX++;
				else if(grilla[i][j] == 'O') contO++;
			}
			if(contO == 3 || contX == 3) {
				for(j =0;j<3;j++) linea.add(new Par(i,j));
				return true;
			}
			else if(contX == 3) {
				for(j =0;j<3;j++) linea.add(new Par(i,j));
				return true;
			}
		}
		for(j =0;j<3;j++) {
			contO =0; contX = 0;
			for(i =0;i<3;i++) {
				if(grilla[i][j]=='X') contX++;
				else if(grilla[i][j]=='O') contO++;
			}
			if(contO == 3 || contX==3) {
				for(i =0;i<3;i++) linea.add(new Par(i,j));
				return true;
			}
			else if(contX == 3) {
				for(i =0;i<3;i++) linea.add(new Par(i,j));
				return true;
			}
		}
		contO = 0; contX = 0;
		for(i = 0;i < 3;i++) {
			if(grilla[i][i] == 'X') contX++;
			else if(grilla[i][i] == 'O') contO++;
		}
		if(contO == 3 || contX == 3) {
			for(i =0;i<3;i++) linea.add(new Par(i,i));
			return true;
		}
		contO = 0; contX =0;
		j = 2;
		for(i =0;i<3;i++) {
			if(grilla[i][j] == 'X') contX++;
			else if(grilla[i][j] == 'O') contO++;
			j--;
		}
		if(contO == 3 || contX == 3) {
			j = 2;
			for(i =0;i<3;i++) { linea.add(new Par(i,j)); j--;}
			return true;
		}
		return false;
	}
	public ArrayList<Par> lineaGanadora(){
		return linea;
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
