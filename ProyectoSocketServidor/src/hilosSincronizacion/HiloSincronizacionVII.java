package hilosSincronizacion;

public class HiloSincronizacionVII extends Thread {
    // declaramos el método run...
    @Override
    public void run() {
        // aplicamos un bucle for...
        for (int g = 1; g <= 8; g++) {
            // imprimimos un mensaje por pantalla
            System.out.print("E");
            // aplicamos un retardo 1 segundo(1000 milisegundos)
            try {
                HiloSincronizacionV.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
