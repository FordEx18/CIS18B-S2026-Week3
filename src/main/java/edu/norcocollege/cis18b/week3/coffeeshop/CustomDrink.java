//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
//Class for CustomDrink, which extends Beverage
public class CustomDrink extends Beverage{
    //enum for MilkType
    public enum Milk{
        WHOLE, SKIM, ALMOND, OAT
    }
    //emum for SyrupType
    public enum Syrup{
        VANILLA, CARAMEL, HAZELNUT, NONE
    }
    //enum for Temperature
    public enum Temperature{
        HOT, ICED
    }
    //Private fields 
    private Milk milk;
    private Syrup syrup;
    private Temperature temp;
    private int espressoShots;
    private List<String> extras;
    //static final variable for base price of a custom drink
    private static final BigDecimal BASE_PRICE=new BigDecimal("4.25");
    //constructor for CustomDrink, takes size, milk type, syrup type, and temperature
    private CustomDrink(Builder builder){
        super("CUSTOM-DRINK", "Custom Drink", BASE_PRICE, builder.size);
        this.milk=builder.milk;
        this.syrup=builder.syrup;
        this.temp=builder.temp;
        this.espressoShots=builder.espressoShots;
        this.extras=builder.extras;{
    }
    //price method to calculate price based on customizations
    @Override
    public BigDecimal getPrice(){
        BigDecimal price=BASE_PRICE;
        // Add price for additional espresso shots
        if(espressoShots>1){
            price=price.add(new BigDecimal("0.75").multiply(new BigDecimal(espressoShots - 1)));
        }
        // Add price for syrup if not NONE
        if(syrup!=Syrup.NONE){
            price=price.add(new BigDecimal("0.50"));
        }
        // Add price for each extra
        price=price.add(new BigDecimal("0.25").multiply(new BigDecimal(extras.size())));
        return price.multiply(sizeMultiplier());
    }
    //Builder class for CustomDrink
    public static class Builder{
        //Required parameters
        private Size size=Size.MEDIUM;
        private Milk milk=Milk.WHOLE;
        private Syrup syrup=Syrup.NONE;
        private Temperature temp=Temperature.HOT;
        private int espressoShots=1;
        private List<String> extras=new ArrayList<>();
        //Builder methods for each parameter
        public Builder size(Size size){
            this.size=size;
            return this;
        }
        public Builder milk(Milk milk){
            this.milk=milk;
            return this;
        }
        public Builder syrup(Syrup syrup){
            this.syrup=syrup;
            return this;
        }
        public Builder temp(Temperature temp){
            this.temp=temp;
            return this;
        }
        public Builder espressoShots(int shots){
            // Validate that espresso shots is at least 1
            if(shots<1){
                throw new IllegalArgumentException("Espresso shots must be greater than or equal to 1!");
            }
            this.espressoShots=shots;
            return this;
        }
        public Builder addExtra(String extra){
            // Validate that extra is not null or blank
            if(extra==null||extra.isBlank()){
                throw new IllegalArgumentException("Extra cannot be blank or null!");
            }
            this.extras.add(extra);
            return this;
        }
        //build method to create CustomDrink instance
        public CustomDrink build(){
            return new CustomDrink(this);
        }
    }
}