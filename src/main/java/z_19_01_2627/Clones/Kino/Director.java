package z_19_01_2627.Clones.Kino;

public class Director {
    String imie;
    String nazwisko;
    String gatunek;

    public Director(String imie, String nazwisko, String gatunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.gatunek = gatunek;
    }

    @Override
    public String toString() {
        return "Director{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }

}
