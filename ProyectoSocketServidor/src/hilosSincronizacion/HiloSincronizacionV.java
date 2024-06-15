package hilosSincronizacion;

public class HiloSincronizacionV extends Thread {
    // declaramos el método run...
    @Override
    public void run() {
        // aplicamos un bucle for...
        for (int e = 1; e <= 8; e++) {
            // imprimimos un mensaje por pantalla
            System.out.print("R");
            // aplicamos un retardo 1 segundo(1000 milisegundos)
            try {
                HiloSincronizacionV.sleep(1000);

            } catch (InterruptedException el) { // Cambiamos la letra del ImterruptedException para usar la "e".
                el.printStackTrace();

            }
        }
    }
}
