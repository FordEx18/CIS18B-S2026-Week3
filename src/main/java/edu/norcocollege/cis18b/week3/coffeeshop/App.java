//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
import java.math.RoundingMode;
//Class for demonstrating the coffee shop application
public class App {
    public static void main(String[] args) {
        //Greeting
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Here's our menu:");
        System.out.println("-----------------------------");
        //Display menu
        System.out.println("Latte: $" + PricingCatalog.getInstance().getBasePrice("LATTE"));
        System.out.println("Cold Brew: $" + PricingCatalog.getInstance().getBasePrice("COLD_BREW"));
        System.out.println("Custom Drink: $" + PricingCatalog.getInstance().getBasePrice("CUSTOM"));
        System.out.println("-----------------------------");
        //Create a latte order
        Beverage latte = new Latte(Beverage.Size.MEDIUM);
        System.out.println("You ordered a medium " + latte.getName() + " for $" + latte.getPrice());
        //Create a Cold Brew order
        Beverage coldBrew = new ColdBrew(Beverage.Size.LARGE);
        System.out.println("You ordered a large " + coldBrew.getName() + " for $" + coldBrew.getPrice());
        //Create a custom drink order
        CustomDrink custom = new CustomDrink.Builder()
                .size(Beverage.Size.LARGE)
                .espressoShots(2)
                .syrup(CustomDrink.Syrup.CARAMEL)
                .addExtra("Whipped Cream")
                .build();
        System.out.println("You ordered a large " + custom.getName() + " for $" + custom.getPrice());
        System.out.println("-----------------------------");
        //Create Order
        Order order1 = new Order("ORD001");
        order1.addItem(latte);
        order1.addItem(coldBrew);
        order1.addItem(custom);
        //Display order total
        System.out.println("Your order total is: $" + order1.total());
    }
}