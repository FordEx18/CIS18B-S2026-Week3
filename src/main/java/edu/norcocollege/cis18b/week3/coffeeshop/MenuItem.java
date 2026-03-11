//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//import BigDecimal for price variable
import java.math.BigDecimal;
//Class for MenuItems
public class MenuItem{
    //Private Variables
    private String sku;
    private String name;
    private BigDecimal price;
    //Constructors
    public MenuItem(String sku,String name,BigDecimal price){
        //Checks if sku is null or blank
        if(sku==null||sku.isBlank()){
            throw new IllegalArgumentException("Sku cannot be blank or null!");
        }
        //Checks if name is null or blank
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank or null!");
        }
        //Checks if price is null or negative
        if(price==null||price.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("Can't be null or negative!");
        }
        //Set variables if all checks are passed
        this.sku=sku;
        this.name=name;
        this.price=price;
    }
    //Getters
    public String getSku(){
        return sku;
    }
    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public String toString(){
        return "MenuItem: "+name+"("+sku+") - $"+price;
    }
}