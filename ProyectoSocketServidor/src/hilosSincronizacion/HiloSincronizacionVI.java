package hilosSincronizacion;

public class HiloSincronizacionVI extends Thread {
    // declaramos el método run...
    @Override
    public void run() {
        // aplicamos un bucle for...
        for (int f = 1; f <= 8; f++) {
            // imprimimos un mensaje por pantalla
            System.out.print("T");
            // aplicamos un retardo 1 segundo(1000 milisegundos)
            try {
                HiloSincronizacionVI.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
