package z_18_11_1718;

import z_18_11_1718.Dni.dzienTyg;

public class TestDzien {
    public static void main(String[] args) {
        System.out.println(dzienTyg.values()[3]);
        System.out.println(dzienTyg.valueOf("ŚRODA"));

        dzienTyg[] dzionki = new dzienTyg[10];
        for (int i = 0; i < dzionki.length; i++) {
            dzionki[i] = dzienTyg.SOBOTA;
            System.out.println(dzionki[i]);
        }
    }
}
