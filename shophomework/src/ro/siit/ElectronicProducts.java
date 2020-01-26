package ro.siit;

public class ElectronicProducts extends Product {
    private int guaranteePeriod;


    public ElectronicProducts(String name, double price, int quantity, String restriction, int guaranteePeriod) {
        super(name, price, quantity, restriction);
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
