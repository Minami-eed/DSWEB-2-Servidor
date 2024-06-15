package hilos;

public class TestClaseHilosEstados {
    @SuppressWarnings("deprecation") // Sirve para saltarse el error del uso del Stop().
    public static void main(String[] args) {
        // hacemos la respectiva instancia
        // 1er estado (crear el objeto sin ejecutar)
        ClaseHilosEstados hilo1 = new ClaseHilosEstados();
        ClaseHilosEstados hilo2 = new ClaseHilosEstados();
        // segundo estado de un hilo(cuando esta en ejecución)
        hilo1.start();
        // tercer estado de un hilo(cuando se aplica el método sleep)
        // retardo de segundos(2000 milisegundo)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // aplicamos el segundo estado para el hilo2
        hilo2.start();

        // cuarto estado es (cuando se aplica el método stop)
        hilo2.stop();
    }
}
