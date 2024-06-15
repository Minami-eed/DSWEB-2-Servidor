package hilos;

public class TestClaseHilosParametros {
    public static void main(String[] args) {
        // realizamos la respectiva instancia
        ClaseHilosParametros clparm = new ClaseHilosParametros("hilosconnumerosPARES");

        // agregamos el valor
        clparm.AgregarParam(20);

        // ejecutamos el hilo
        clparm.start();
    }
}
