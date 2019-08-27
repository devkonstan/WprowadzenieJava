package z_18_12_0102.Generics.Soki;

public class TestSoki {
    public static void main(String[] args) {
        //nazwa generowana
        Pudelko<Arbuzowy> arbuzowyPudelko = new Pudelko<>(new Arbuzowy());
        arbuzowyPudelko.nalej();

        Pudelko<Pomaranczowy> pomaranczowyPudelko = new Pudelko<>(new Pomaranczowy());
        pomaranczowyPudelko.nalej();
    }
}
