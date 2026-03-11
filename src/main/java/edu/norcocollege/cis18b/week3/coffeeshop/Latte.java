//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
//Class for Latte, which extends Beverage
public class Latte extends Beverage{
    //constructor
    public Latte(Size size){
        super("LATTE", "Latte",PricingCatalog.getInstance().getBasePrice("LATTE"), size);
    }
}