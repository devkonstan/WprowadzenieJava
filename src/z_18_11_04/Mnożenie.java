package z_18_11_04;

public class Mnożenie {
    private double iloczyn;

    public double pobierzLiczby(double liczba1, double liczba2) {
        iloczyn = liczba1 * liczba2;
        return iloczyn;
    }

    public void wyswietlWynik() {
        System.out.println(iloczyn);
    }
}
