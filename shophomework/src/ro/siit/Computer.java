package ro.siit;

public class Computer extends ElectronicProducts {

    public Computer(String name, double price, int quantity, String restriction, int guaranteePeriod) {
        super(name, price, quantity, restriction, guaranteePeriod);
        setGuaranteePeriod(24);
    }

    public double getPrice() {
        if (getQuantity() > 1000)
            return super.getPrice() * 0.95;
        return super.getPrice();
    }

}
