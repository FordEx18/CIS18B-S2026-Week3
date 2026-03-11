//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
//Class representing a cold brew beverage, extends the Beverage class
public class ColdBrew extends Beverage{
    //static final variable for base price of a cold brew
    private static final BigDecimal BASE_PRICE=new BigDecimal("4.00");
    //constructor
    public ColdBrew(Size size){
        super("COLD-BREW", "Cold Brew", BASE_PRICE, size);
    }
}