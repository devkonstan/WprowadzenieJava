package z_18_11_1718.Auta;

public class Ciezarowy extends Samochod {
    String ladownosc = "ladownosc";

    void ladujeTowar() {
        System.out.println("laduje towar");
    }


    void wiozeDuzo() {
        ladujeTowar();
    }

    @Override
    public String toString() {
        return "wolno jade";
    }
}
