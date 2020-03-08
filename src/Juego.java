import java.io.IOException;

public class Juego {

	public static void main(String[] args) throws IOException {
		
		Vista vista = new Vista();
		
		vista.jugarPos(0, 0, 'X');
		vista.jugarPos(2, 0, 'O');
		
	}

}
