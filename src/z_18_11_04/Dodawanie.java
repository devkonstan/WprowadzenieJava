package z_18_11_04;

public class Dodawanie {

    private double suma;

    public double pobierzLiczby(double liczba1, double liczba2) {
        suma = liczba1 + liczba2;
        return suma;
    }

    public void wyswietlWynik() {
        System.out.println(suma);
    }
}
