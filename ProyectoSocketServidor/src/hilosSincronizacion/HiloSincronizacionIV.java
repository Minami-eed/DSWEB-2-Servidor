package hilosSincronizacion;

public class HiloSincronizacionIV extends Thread {
    // declaramos el método run...
    @Override
    public void run() {
        // aplicamos un bucle for...
        for (int d = 1; d <= 8; d++) {
            // imprimimos un mensaje por pantalla
            System.out.print("E");
            // aplicamos un retardo 1 segundo(1000 milisegundos)
            try {
                HiloSincronizacionIV.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
