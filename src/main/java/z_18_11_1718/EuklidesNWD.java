package z_18_11_1718;

import java.util.Scanner;

public class EuklidesNWD {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę a: ");
        a = sc.nextInt();
        System.out.println("podaj liczbę b: ");
        b = sc.nextInt();

        while (a != b) {

            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }
            System.out.println("największy wspólny dzielnik to: " + a);
        }
    }
