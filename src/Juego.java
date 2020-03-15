import java.io.IOException;

//clase para generar el retraso
import java.util.concurrent.TimeUnit;
public class Juego {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista,modelo);
		
		/*Vista vista = new Vista();
		TimeUnit.SECONDS.sleep(2);
		vista.jugarPos(0, 0, 1);
		TimeUnit.SECONDS.sleep(2);
		vista.jugarPos(2, 0, 2);
		TimeUnit.SECONDS.sleep(2);
		vista.reiniciarJuego();
		TimeUnit.SECONDS.sleep(3);*/
		
	}

}
