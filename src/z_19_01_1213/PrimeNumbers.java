package z_19_01_1213;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {

        List<Integer> primeNumbers = getPrimeNumbers(10000);
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }
    }

    private static List<Integer> getPrimeNumbers(int range) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < range; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                } else if (j < i) {
                    continue;
                } else {
                    primeNumbers.add(i);
                }
            }
        }
        return primeNumbers;
    }

}