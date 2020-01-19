package ro.siit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class MainShopClass {
    public static void main(String[] args) throws ParseException {
        Customer pecata = new Customer("Pecata", 17, 30);
        Customer gopeto = new Customer("Gopeto", 59, 7.44);
        LocalDateTime now = LocalDateTime.now();
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("Local time is: " + now);

        String sDate1 = "31/12/2019";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        String sDate2 = "31/07/2021";
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);

        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 2, "adult", date1);
        FoodProduct wine = new FoodProduct("Some Wine", 34, 0, "teenager", date2);

        PurchaseManager.processPurchase(cigars, pecata);
        PurchaseManager.processPurchase(wine, gopeto);

        System.out.println(pecata.toString());
        System.out.println(cigars.toString());
        System.out.println(gopeto.toString());

    }

}
