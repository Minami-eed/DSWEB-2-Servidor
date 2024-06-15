package hilos;

public class ClaseHilosEstados extends Thread {
    @Override
    public void run() {
        // suma de los 10 primeros numeros impares
        // acumulador
        int sumaimpares = 0;
        // aplicamos un bucle for...
        for (int t = 1; t <= 10; t++) {
            // aplicamos una condicion...
            if (t % 2 != 0) {
                // imprimimos por pantalla los numeros impares
                System.out.println("impares " + t);
                // acumulamos la suma de los impares
                sumaimpares = sumaimpares + t;
            }

            // hacemos un retardo de 2 segundos(2000 milisegundo)
            try {
                ClaseHilosEstados.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        // imprimir la suma de los numeros impares
        System.out.println("la suma de numeros impares " + sumaimpares);
    }
}
