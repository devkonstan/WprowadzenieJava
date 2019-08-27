package z_18_11_1718;

import java.util.Scanner;

public class TestWartosci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        System.out.println("podaj 5 liczb nie wiekszych niz 10");
        while (i++ < 5) {
            System.out.println("Podaj wartość do zsumowania : ");
            int wartosc = scanner.nextInt();
            if (wartosc > 10) {
                break;
            }
            suma = suma + wartosc;

        }
        System.out.println("Suma naszych wartości to : " + suma);

    }
}

