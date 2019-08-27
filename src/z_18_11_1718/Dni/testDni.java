package z_18_11_1718.Dni;

public class testDni {
    public static void main(String[] args) {

        for (dzienTyg dzien : dzienTyg.values()) {
            System.out.println(dzien.dajNrDnia() + " " + dzien.dajNazwePoPolsku());
        }

    }
}
