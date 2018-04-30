package zad2;

/**
 *
 * @author mchyla
 */
public abstract class product {

    private double price;
    private String nazwa;
    private String opis;

    public double getPrice() {
        return price;
    }

    public product(double price, String nazwa, String opis) {
        this.price = price;
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     public String getName() {
        return nazwa;
    }

    public void setName(String nazwa) {
        this.nazwa = nazwa;
    }
     public String getDescribe() {
        return opis;
    }

    public void setDescribe(String opis) {
        this.opis = opis;
    }
    public abstract void buy();

    public abstract void pokazInfo();
}

