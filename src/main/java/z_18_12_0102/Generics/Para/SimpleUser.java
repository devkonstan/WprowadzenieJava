package z_18_12_0102.Generics.Para;

//ta klasa wybiera sobie pola z klasy z_19_01_2627.Serializacja.User potrzebne do wykorzystania w TestPair
    public class SimpleUser {
        String nazwisko;
        int wiek;

    public SimpleUser(User user) {
        this.nazwisko = user.getNazwisko();
        this.wiek = user.getWiek();
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    }
