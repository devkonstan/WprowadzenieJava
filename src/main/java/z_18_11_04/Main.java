package z_18_11_04;

public class Main {
    public static void main(String[] args) {
        Prostokat rect = new Prostokat(14, 34);

        System.out.println("srawdzam: " + rect.szerokosc + " " + rect.wysokosc);

        rect.wyswietlArg();

        System.out.println("wyswietlam szerokosc: " + rect.wyswietlSzer());
        System.out.println("wyswietlam wysokosc: " + rect.wyswietlWys());
        System.out.println("pole prostokata: " + rect.wyswietlPole());

        Prostokat rect2 = new Prostokat(-2, -3);
        rect.setSzerokosc(2); //dlaczego tutaj nie wyswietli mi 3 tak jak mam w getterze?
        rect.setWysokosc(10); //udalo sie dopiero po utworzeniu nowego obiektu
        //najpierw utworzyc settera dla rect z minusami a dopiero potem getterem sprawdzic

        System.out.println("wyswietlam szerokosc: " + rect.wyswietlSzer());
        System.out.println("wyswietlam wysokosc: " + rect.wyswietlWys());

        System.out.println("nowa szerokosc: " + rect.szerokosc + " nowa wysokosc: " + rect.wysokosc);
        System.out.println("nowy rozmiar pola: " + rect.pole);

        rect.zwrocPole();

        System.out.println("*********");

        VarArgs argumenty = new VarArgs();
        argumenty.wyswietlString("czesc, ", "jestem ", "Konrad");

        System.out.println("********");

        VarArgs varek = new VarArgs();
        varek.wyswietlProstokat(new Prostokat(23, 52), new Prostokat(54, 12));

    }
}