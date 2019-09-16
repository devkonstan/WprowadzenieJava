package z_19_01_2627.Clones.Kino;

public class Film implements Cloneable{
    String tytul;
    int rok;
    Director osoba;

    public Film(String tytul, int rok, Director osoba) {
        this.tytul = tytul;
        this.rok = rok;
        this.osoba = osoba;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rok=" + rok +
                ", osoba=" + osoba +
                '}';
    }
}
