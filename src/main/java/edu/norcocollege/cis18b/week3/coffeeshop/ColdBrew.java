//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
//Class representing a cold brew beverage, extends the Beverage class
public class ColdBrew extends Beverage{
    //constructor
    public ColdBrew(Size size){
        super("COLD-BREW", "Cold Brew", PricingCatalog.getInstance().getBasePrice("COLD_BREW"), size);
    }
}