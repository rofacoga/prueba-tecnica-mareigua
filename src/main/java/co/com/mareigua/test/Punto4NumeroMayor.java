package main.java.co.com.mareigua.test;

public class Punto4NumeroMayor {
    public static void main(String[] args) {
        final int[] arreglo = new int[]{105, 89, 4, 203, 70, 2, 35};
        System.out.printf("El número mas grande es: %s", ejecutar(arreglo));
    }

    public static int ejecutar(int[] arreglo) {
        if (arreglo == null)
            return 0;

        if (arreglo.length == 1)
            return arreglo[0];

        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        return mayor;
    }
}
