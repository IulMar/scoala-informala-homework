package ro.siit;

public class Appliance extends ElectronicProducts {


    public Appliance(String name, double price, int quantity, String restriction, int guaranteePeriod) {
        super(name, price, quantity, restriction, guaranteePeriod);
        setGuaranteePeriod(6);
    }

    public double getPrice() {
        if (getQuantity() < 50)
            return super.getPrice() * 0.105;
        return super.getPrice();
    }

}
