package z_18_11_04;

public class Modulo {
    private double modulo;

    public double pobierzLiczby(double liczba1, double liczba2) {

        if (liczba2 == 0) {
            System.out.println("nie dzielimy przez 0!");
            return 0;
        } else {
            modulo = liczba1 % liczba2;
            return modulo;
        }
    }

    public void wyswietlWynik() {
        System.out.println(modulo);
    }

}
