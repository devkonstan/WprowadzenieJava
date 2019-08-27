package z_18_11_04;

public class Dzielenie {
    private double iloraz;

    public double pobierzLiczby(double liczba1, double liczba2) {
        try {
            iloraz = liczba1 / liczba2;
        } catch (ArithmeticException ae) {
            System.out.println("nie dzielimy przez 0!");
        }
        return iloraz;
    }


    public void wyswietlWynik() {
        System.out.println(iloraz);
    }
}
