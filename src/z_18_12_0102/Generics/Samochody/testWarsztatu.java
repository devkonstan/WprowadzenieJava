package z_18_12_0102.Generics.Samochody;

public class testWarsztatu {

    public static void main(String[] args) {

        Warsztat<Dostawczy> dostawczyWarsztat = new Warsztat<Dostawczy>(new Dostawczy());
        dostawczyWarsztat.napraw();

        Warsztat<Sportowy> sportowyWarsztat = new Warsztat<Sportowy>(new Sportowy());
        sportowyWarsztat.napraw();
    }
}
