package z_18_11_10.Samochod;

public class Samochod {
    String kolor;
    Silnik silniczek;

    Samochod(String kolorek) {
        kolor = kolorek;
        silniczek = new Silnik();
    }

    Samochod() {
        this("czarny");
    }


}
