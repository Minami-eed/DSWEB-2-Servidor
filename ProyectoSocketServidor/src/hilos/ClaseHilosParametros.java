package hilos;

public class ClaseHilosParametros extends Thread {
    // declaramos una variable global
    int num;

    // creamos un constructor...
    public ClaseHilosParametros(String nomhilo) {
        // aplicamos el método super..
        super(nomhilo);

    }

    @Override
    public void run() {
        // suma de numeros pares dentro del parámetro num
        // acumulador
        int sumpares = 0;
        // aplicamos un bucle for
        for (int k = 1; k <= num; k++) {
            // aplicamos una condicion..
            if (k % 2 == 0) {
                // imprimimos numeros por pantalla
                System.out.println(k + "" + this.getName());
                // acumulamos la suma
                sumpares = sumpares + k;
            }

        }
        // imprimimos la respectiva suma
        System.out.println("la suma de numeros pares " + sumpares);

    }

    // creamos un metodo
    public void AgregarParam(int y) {
        this.num = y;
    }
}
