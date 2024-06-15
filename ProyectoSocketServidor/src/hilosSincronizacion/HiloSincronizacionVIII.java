package hilosSincronizacion;

public class HiloSincronizacionVIII extends Thread {
    // declaramos el método run...
    @Override
    public void run() {
        // aplicamos un bucle for...
        for (int h = 1; h <= 8; h++) {
            // imprimimos un mensaje por pantalla
            System.out.println("C");
            // aplicamos un retardo 1 segundo(1000 milisegundos)
            try {
                HiloSincronizacionV.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
