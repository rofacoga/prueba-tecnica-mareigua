package main.java.co.com.mareigua.test;

public class Punto3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("mareigua ");
            else if (i % 3 == 0)
                System.out.print("mare ");
            else if (i % 5 == 0)
                System.out.print("igua ");
            else
                System.out.printf("%s ", i);
        }
    }
}
