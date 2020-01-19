package ro.siit;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static ro.siit.Customer.AGE_RESTRICTION_ADULT;
import static ro.siit.Customer.AGE_RESTRICTION_TEENAGER;


public class PurchaseManager {

    public static void processPurchase(Product product, Customer customer) throws ParseException {

        if (product.getQuantity() < 1) {
            System.out.println("This product is out of stock!");
        }

        if ((customer.getBalance() - product.getPrice()) < 0) {
            System.out.println("You don't have enough money too buy this product!");
        } else {
            customer.setBalance(customer.getBalance() - product.getPrice());
            product.setQuantity(product.getQuantity() - 1);
        }

        if (product.getRestriction().equals(AGE_RESTRICTION_TEENAGER)) {
            if (customer.getAge() < 12) {
                System.out.println("You are too young to buy this product!");
            }
        }

        if (product.getRestriction().equals(AGE_RESTRICTION_ADULT)) {
            if (customer.getAge() < 18) {
                System.out.println("You are too young to buy this product!");
            }
        }

        Date currentTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        Date foodProductTime = ((FoodProduct) product).getExpirationDate();
        if (foodProductTime.before(currentTime)) {
            System.out.println("The product is expired!");
        }

        if (foodProductTime.compareTo(currentTime) < 15) {
            ((FoodProduct) product).setPrice(((FoodProduct) product).setPrice() * 0.7);
        }

    }
}



