package z_18_11_1718.Operacja;

public class Silnia implements Operacja {

    @Override
    public double wykonajOperacje(double liczba1, double liczba2) {

        if (liczba1 <= 1) {
            return 1;
        }
        return liczba1*wykonajOperacje(liczba1-1,liczba2);

    }
}
