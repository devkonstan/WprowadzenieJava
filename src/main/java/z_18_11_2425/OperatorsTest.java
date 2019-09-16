package z_18_11_2425;

public class OperatorsTest {
    public static void main(String[] args) {

        System.out.println("test == test: " + (new String("test") ==
                new String("test"))); //inna lokalizacja w pamieci
        System.out.println("test equals test: " + new
                String("test").equals(new String("test"))); //ta sama wartosc

        String reference1 = new String("something");
        String reference2 = reference1;
        System.out.println("reference1 == reference2: " +
                (reference1 == reference2)); //ta sama lokalizacja w pamieci
    }
}