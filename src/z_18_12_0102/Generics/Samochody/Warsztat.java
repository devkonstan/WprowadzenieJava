package z_18_12_0102.Generics.Samochody;

public class Warsztat<S extends Samochod> {
    public S samochod;

    public Warsztat(S sam) {

        this.samochod = sam;
    }

    public void napraw() {

        System.out.println("naprawiam " + samochod.getClass().getSimpleName());
    }
}
