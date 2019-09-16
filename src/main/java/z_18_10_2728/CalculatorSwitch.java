package z_18_10_2728;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        double liczba1 = 5;
        double liczba2 = 2;
        double wynik;
        System.out.println("podaj znak");
        Scanner sc = new Scanner(System.in);
        char znak = sc.next().charAt(0);

        switch (znak) {
            case '+':
                wynik = liczba1 + liczba2;
                System.out.println(wynik);
                break;

            case '-':
                wynik = liczba1 - liczba2;
                System.out.println(wynik);
                break;

            case '*':
                wynik = liczba1 * liczba2;
                System.out.println(wynik);
                break;

            case '/':
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                    System.out.println(wynik);
                } else {
                    System.out.println("nie mozna dzielic przez 0!");
                }
                break;

            case '%':
                if (liczba2 != 0) {
                    wynik = liczba1 % liczba2;
                    System.out.println(wynik);
                } else {
                    System.out.println("nie mozna dzielic przez 0!");
                }
                break;

            default:
                System.out.println("nie wiem co zrobić ¯\\\\\\_(ツ)\\_/¯");
        }
    }
}


