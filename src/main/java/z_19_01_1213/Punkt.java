package z_19_01_1213;

import java.util.Random;

public class Punkt {
    double x;
    double y;

    static void increment(double x) {
        System.out.println("wartosc punktu x: " + x);
        x++;
        System.out.println("nowa wartość x: " + x);
    }

    static void changeY(double y) {
        double losowaLiczba;
        Random random = new Random();
        losowaLiczba = Math.round(10 * (random.nextDouble()));
        System.out.println("wartosc punktu y: " + y);
        System.out.println("wartosc losowej liczby: " + losowaLiczba);
        y = y + losowaLiczba;
        System.out.println("wartosc punktu po zwiększeniu o " + losowaLiczba + " : " + y);
    }

    static double returnX(double x) {
        return x;
    }

    static double returnY(double y) {

        return y;
    }

    static void showY(double x, double y) {
        System.out.println("wartosc x to: " + x + " a wartosc y: " + y);
    }
}


