package z_18_12_0102.Generics.Para;

//typowy generyk tworzony z pary 2 parametrów
public class Pair<F, S> {
    public F fst;
    public S snd;

    //konstruktor
    Pair(F f, S s) {
        this.fst = f;
        this.snd = s;
    }
}
