package z_18_10_2728;

import java.util.Scanner;

public class EvenNotEven {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int b = liczba.nextInt();
        //int c = 5;

        if ((b % 2) == 0) {
            System.out.println("ta liczba jest parzysta");
        } else if ((b % 2) == 1) {
            System.out.println("ta liczba jest nieparzysta");
        }
    }
}