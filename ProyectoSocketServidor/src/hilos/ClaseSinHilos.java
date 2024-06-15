package hilos;

public class ClaseSinHilos {

	public static void main(String[] args) {
		// acumulador
		int sumpar = 0;
		// suma de los 10 primeros numeros naturales pares
		for (int x = 1; x <= 10; x++) {

			if (x % 2 == 0) {
				// imprimimos un mensaje por pantalla
				System.out.println("pares " + x);
				sumpar = sumpar + x;
			}
		}

		System.out.println("la suma  de los 10 primeros numeros pares es " + sumpar);
		// suma de los primeros numeros naturales impares.
		// acumulador
		int sumaimpar = 0;
		for (int y = 1; y <= 10; y++) {

			if (y % 2 != 0) {
				// imprimimos un mensaje por pantalla
				System.out.println("impares " + y);
				sumaimpar = sumaimpar + y;
			}
		}

		// imprimimos la respuesta por pantalla
		System.out.println("la suma de los 10 primeros numeros impares es " + sumaimpar);

	}
}
