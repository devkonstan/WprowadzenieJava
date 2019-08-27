package z_19_01_1213;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DrugaNajmniejsza {

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            values.add(r.nextInt(100));
        }
        System.out.println("\nCreated array: "); // wyświetlamy utworzoną tablicę
        printArray(values);

        System.out.println("\nSorted array: ");
        // pozwala nam na manualne porównanie, czy uzyskany wynik to faktycznie druga najmniejsza wartość
        printArray(values
                .stream()
                .sorted()
                .collect(Collectors.toList()));


        int i = new ArrayList<>(values)
                .stream()
                .sorted()
                .collect(Collectors.toList()).get(1);
        System.out.println("2nd: "+i);

        System.out.println("\nSecond min value: ");
        int min2 = findMin(values);
        System.out.println(min2);

    }

    public static void printArray(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i < array.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public static int findMin(List<Integer> array) {
        int min = array.get(0);
        int min2 = array.get(0);

        for (int value : array) {
            if (value < min) {
                min2 = min;
                min = value;
            }
            if (value != min) {
                if (min2 == min) {
                    min2 = value;  // obsługa sytuacji, w której początkowa wartość min i min2 była jednocześnie najmniejszą wartością w tablicy
                }
                if (value < min2) {
                    min2 = value;
                }
            }
        }
        return min2;
    }

}