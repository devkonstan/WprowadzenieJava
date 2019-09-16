package z_19_01_2627.Serializacja;

public class User {
    String imie;
    int wiek;

    public User() {
    }

    public User(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "z_19_01_2627.Serializacja.User{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

