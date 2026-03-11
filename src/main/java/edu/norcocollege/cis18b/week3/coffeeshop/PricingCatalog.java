//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
//Class for PricingCatalog
public class PricingCatalog{
    //Singleton pattern - private constructor
    private static PricingCatalog instance;

    //Method to Get instance
    public static PricingCatalog getInstance(){
        if(instance==null){
            instance=new PricingCatalog();
        }
        return instance;
    }
    //Price lookup
    public BigDecimal getBasePrice(String productKey){
        switch(productKey){
            case "LATTE":
                return new BigDecimal("4.50");
            case "COLD_BREW":
                return new BigDecimal("4.00");
            case "CUSTOM":
                return new BigDecimal("4.25");
            default:
                throw new IllegalArgumentException("Unknown product key: "+productKey);
        }
    }
}