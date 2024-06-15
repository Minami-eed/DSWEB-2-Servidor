package hilosSincronizacion;

public class HiloSincronizacionII extends Thread {
    // declaramos el método run...
    @Override
    public void run() {
        // aplicamos un bucle for...
        for (int b = 1; b <= 8; b++) {
            // imprimimos un mensaje por pantalla
            System.out.print("I");
            // aplicamos un retardo 1 segundos(1000 milisegundos)
            try {
                HiloSincronizacionII.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
