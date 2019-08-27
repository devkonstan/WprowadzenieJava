package z_19_01_2627.Sklep;

import java.util.Deque;
import java.util.LinkedList;

public class Shop {
    //interfejs <typ>  nazwa s.d.
//    private Queue<Client> kolejka = Collections.asLifoQueue(new LinkedList<>()); //
    private Deque<Client> kolejka = new LinkedList<>();

    public void addToShopQueue(Client client) {

        kolejka.add(client);
    }

    public void doShopping() {
        Client client = kolejka.remove();
        System.out.println("obslugujemy: " + client.getShopDescription());
    }
}
