package z_19_01_2627.Sklep;

public class Client {
    private String shopDescription;

    public Client(String shopDescription) { //co kupuje klient

        this.shopDescription = shopDescription;
    }

    public String getShopDescription() {

        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {

        this.shopDescription = shopDescription;
    }
}
