package hilosSincronizacion;

public class HiloSincronizacionIII extends Thread {
    // declaramos el método run...
    @Override
    public void run() {
        // aplicamos un bucle for...
        for (int c = 1; c <= 8; c++) {
            // imprimimos un mensaje por pantalla
            System.out.print("B");
            // aplicamos un retardo 1 segundo(1000 milisegundos)
            try {
                HiloSincronizacionIII.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
