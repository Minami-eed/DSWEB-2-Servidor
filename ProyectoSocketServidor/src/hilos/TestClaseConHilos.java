package hilos;

public class TestClaseConHilos {

	public static void main(String[] args) {
		// realizamos la instancia con la clase herencia
		ClaseHerenciaHilos hiloherencia = new ClaseHerenciaHilos();
		// realizamos la instancia con la interface runnable
		Thread hilointerfaz = new Thread(new ClaseInterfazHilos());
		// ejecutamos los respectivos hilos
		hiloherencia.start();
		hilointerfaz.start();
	}
}
