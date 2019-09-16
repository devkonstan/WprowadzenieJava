package z_19_01_1213;

public class testFloatString {
    public static void main(String[] args) {
        float principal;
        String loanText = "31222 cxz";
        try {
            principal = Float.parseFloat(loanText) * 1.1F;
        } catch (Exception e) {
            System.out.println("błąd " + e.getMessage());
            throw e;
        }
    }
}
