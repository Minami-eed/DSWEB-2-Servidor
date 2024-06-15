package hilosSincronizacion;

public class TestHiloSincronizacion {
    @SuppressWarnings("static-access")

    public static void main(String[] args) {
        // realizamos la respectiva instancia
        // aplicamos estados
        HiloSincronizacionI hilo1 = new HiloSincronizacionI();
        HiloSincronizacionII hilo2 = new HiloSincronizacionII();
        HiloSincronizacionIII hilo3 = new HiloSincronizacionIII();
        HiloSincronizacionIV hilo4 = new HiloSincronizacionIV();
        HiloSincronizacionV hilo5 = new HiloSincronizacionV();
        HiloSincronizacionVI hilo6 = new HiloSincronizacionVI();
        HiloSincronizacionVII hilo7 = new HiloSincronizacionVII();
        HiloSincronizacionVIII hilo8 = new HiloSincronizacionVIII();

        // aplicamos estado dos
        hilo1.start();

        // aplicamos tercer estado
        try {
            hilo1.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo5.start();
        try {
            hilo5.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo6.start();
        try {
            hilo6.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo7.start();
        try {
            hilo7.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo8.start();
        try {
            hilo8.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
