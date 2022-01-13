package main.java.co.com.mareigua.test;

public class Punto5CadenaReversa {
    public static void main(String[] args) {
        final String cadena = "test";
        System.out.printf("La cadena reversa de %s es: %s%n", cadena, ejecutar(cadena));
    }

    public static String ejecutar(String cadena) {
        if (cadena == null || cadena.isBlank())
            return "";

        StringBuilder aux = new StringBuilder();

        for (int i = cadena.length() - 1; i >= 0; i--)
            aux.append(cadena.charAt(i));

        return aux.toString();
    }
}
