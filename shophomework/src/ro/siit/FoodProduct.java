package ro.siit;

import java.util.Date;

public class FoodProduct extends Product implements Expirables {
    public Date expirationDate = null;

    public FoodProduct(String name, double price, int quantity, String restriction, Date expirationDate) {
        super(name, price, quantity, restriction);
        this.expirationDate = expirationDate;

    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return super.getPrice();
    }

    public double setPrice() {
        return super.getPrice();
    }
}
