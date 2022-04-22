import java.util.ArrayList;

public class Customer {

    String name;
    int wallet;
    ArrayList<Artwork> customerCollection;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.customerCollection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerCollection() {
        return customerCollection;
    }

    public void setCustomerCollection(ArrayList<Artwork> customerCollection) {
        this.customerCollection = customerCollection;
    }
    //behaviours

    public int customerBuy(Artwork buy){
        return wallet -= buy.getPrice();
    }

    public int customerSell(Artwork sell){
        return wallet += sell.getPrice();
    }

}
