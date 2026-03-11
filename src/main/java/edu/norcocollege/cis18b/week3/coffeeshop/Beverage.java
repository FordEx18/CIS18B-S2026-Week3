//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
//Class for Beverage, which extends MenuItem
public abstract class Beverage extends MenuItem{
    //Enum for size of beverage
    enum Size{
        SMALL,
        MEDIUM,
        LARGE
    }
    //Private Variables
    private Size size;
    //Constructors
    public Beverage(String sku,String name,BigDecimal basePrice,Size size){
        super(sku,name,basePrice);
        if(size==null){
            throw new IllegalArgumentException("Size cannot be null!");
        }
        this.size=size;
    }
    //Size multiplier method
    public BigDecimal sizeMultiplier(){
        switch(size){
            case SMALL:
                return BigDecimal.ONE;
            case MEDIUM:
                return new BigDecimal("1.2");
            case LARGE:
                return new BigDecimal("1.4");
            default:
                throw new IllegalStateException("Unexpected size: "+size);
        }
    }
    //Override getPrice method to calculate price based on size
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().multiply(sizeMultiplier());
}