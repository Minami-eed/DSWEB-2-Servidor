package hilosSincronizacion;

public class HiloSincronizacionI extends Thread {
    @Override
    public void run() {
        // vamos a sincronizar la palabra cibertec
        // aplicamos un bucle for...
        for (int a = 1; a <= 8; a++) {

            // imprimimos un mensaje por consola
            System.out.print(a + " C");
            // aplicamos un retardo
            try {
                HiloSincronizacionI.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
