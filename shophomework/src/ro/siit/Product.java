package ro.siit;

public class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private String restriction;

    public Product(String name, double price, int quantity, String restriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.restriction = restriction;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        price = price - this.price;
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", restriction='" + restriction + '\'' +
                '}';
    }

}
