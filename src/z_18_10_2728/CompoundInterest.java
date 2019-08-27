package z_18_10_2728;

public class CompoundInterest {
    public static void main(String[] args) {
        int kwota = 10000;
        double procent = 0.05; //f dopisac
        double zysk = 0;
        int okres = 1;

        do {
            zysk = zysk + (kwota * procent);
            System.out.println("zysk po okresie "+okres+ " wynosi "+zysk);
            okres++;
        } while (okres <= 12);
        System.out.println(zysk);
    }
}
