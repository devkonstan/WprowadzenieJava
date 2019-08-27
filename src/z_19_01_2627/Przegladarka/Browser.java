package z_19_01_2627.Przegladarka;

import java.util.Stack;

public class Browser {
    private Stack<WebSite> strony = new Stack<>();

    public void newSite(WebSite strona) {
        System.out.println("otwieram stronę: " + strony.push(strona).getSiteURL());
    }

    public void backSite() {
        System.out.println("aktualna strona: " + strony.pop().getSiteURL()); //pobiera i usuwa
        System.out.println("poprzednia strona: " + strony.peek().getSiteURL()); //podglada tylko
    }

    // zasadniczo to samo co powyzsza metoda
    public void newbackSite() {
        strony.pop().getSiteURL();
        System.out.println("poprzednia strona: " + strony.peek().getSiteURL());
    }
}
