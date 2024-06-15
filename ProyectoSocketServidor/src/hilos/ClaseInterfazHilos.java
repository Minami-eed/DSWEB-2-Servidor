package hilos;

public class ClaseInterfazHilos implements Runnable {

	@Override
	public void run() {
		// suma de los 10 primeros números naturales impares...
		int sumimpares = 0;
		for (int m = 1; m <= 10; m++) {
			// aplicamos una condición
			if (m % 2 != 0) {
				// imprimimos por pantalla
				System.out.println("(M)impares " + m);
				// aplicamos el acumulador
				sumimpares = sumimpares + m;
			}

		}
		// imprimimos el resultado por pantalla
		System.out.println("la suma de números impares es " + sumimpares);
	}
}
