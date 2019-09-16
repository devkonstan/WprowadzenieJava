package z_18_11_1718.Auta;

public class Sportowy extends Samochod {
    String osiagi = "predki";

    void tankujeDuzoPaliwa(){
        System.out.println("tankuje duzo paliwa");
    }

    final void jadeSzybko() {
        tankujeDuzoPaliwa();
    }

    @Override
    public String toString() {
        return "szybka fura";
    }
}

