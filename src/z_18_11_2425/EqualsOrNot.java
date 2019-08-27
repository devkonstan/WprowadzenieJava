package z_18_11_2425;

public class EqualsOrNot {
    public static void main(String[] args) {

        System.out.println(isEqual(2, 2));
    }

    public static boolean isEqual(int a, int b) {
        try {
            int c = 1 / (a - b);
        } catch (ArithmeticException ae) { //jesli a i b rowne to 1 bedzie dzielil przez 0
            return true;
        }
        return false;
    }

}
