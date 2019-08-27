package z_19_01_2627.Przegladarka;

public class TestStrona {
    public static void main(String[] args) {
        WebSite strona1 = new WebSite("www.wykop.pl");
        WebSite strona2 = new WebSite("www.facebook.com");
        WebSite strona3 = new WebSite("www.goo.gl");

        Browser fajerfox = new Browser();
        fajerfox.newSite(strona1);
        fajerfox.newSite(strona2);
        fajerfox.newbackSite();
    }
}
