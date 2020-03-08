import java.io.IOException;

//clase para generar el retraso
import java.util.concurrent.TimeUnit;
public class Juego {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Vista vista = new Vista();
		TimeUnit.SECONDS.sleep(2);
		vista.jugarPos(0, 0, 'X');
		TimeUnit.SECONDS.sleep(2);
		vista.jugarPos(2, 0, 'O');
		TimeUnit.SECONDS.sleep(2);
		vista.reiniciarJuego();
	}

}
