package z_18_10_2728;

public class SumaZTabeli {
    public static void main(String[] args) {
        int n = 10;
        int[] dane = new int[n];
        double suma = 0;
        for (int i = 0; i < dane.length; i++) {
            dane[i] = i;
            System.out.println("liczba: " + dane[i]);
            suma = suma + dane[i];
            System.out.println("suma wraz z " + dane[i] + " elementem: " + suma); //suma i
        }
        System.out.println("średnia: " + suma / dane.length);
    }
}
