package hilos;

public class ClaseHerenciaHilos extends Thread {
    @Override
    public void run() {
        // suma de los 10 primeros numeros naturales pares...
        // acumulador
        int sumapares = 0;
        // aplicamos un bucle for
        for (int z = 1; z <= 10; z++) {
            // aplicamos una condicion
            if (z % 2 == 0) {
                // realizamos una impresion por pantalla
                System.out.println("(Z) pares " + z);
                sumapares = sumapares + z;
            }
        }
        // emitimos mensaje por consola
        System.out.println("suma de numeros pares " + sumapares);
    }
}
