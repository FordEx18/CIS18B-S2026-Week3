//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
//Class for CustomDrink, which extends Beverage
public class CustomDrink extends Beverage{
    //enum for milk options
    public enum Milk{WHOLE, SKIM, ALMOND, OAT}
    //enum for Syrup options
    public enum Syrup{VANILLA, CARAMEL, HAZELNUT, NONE}
    //enum for tempurature options
    public enum Temperature{HOT, ICED}
    //Private fields for CustomDrink
    private Milk milk;
    private Syrup syrup;
    private Temperature temperature;
    private int espressoShots;
    private List<String> extras;
    //constructor for CustomDrink
    public CustomDrink(Size size, Milk milk, Syrup syrup, Temperature temperature, int espressoShots){
        super("CUSTOM", "Custom Drink", PricingCatalog.getInstance().getBasePrice("CUSTOM"), size);
        this.milk=milk;
        this.syrup=syrup;
        this.temperature=temperature;
        this.espressoShots=espressoShots;
        this.extras=new ArrayList<>();
    }
    //Builder for CustomDrink
    public static class Builder{
        //private fields for Builder with default values
        private Size size=Size.MEDIUM;
        private Milk milk=Milk.WHOLE;
        private Syrup syrup=Syrup.NONE;
        private Temperature temperature=Temperature.HOT;
        private int espressoShots=1;
        private List<String> extras=new ArrayList<>();
        //Builder methods for each field
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
        public Builder temperature(Temperature temperature){
            this.temperature=temperature;
            return this;
         }
        public Builder espressoShots(int shots){
            if(shots<1){
                throw new IllegalArgumentException("Espresso shots must be greater or equal to one!");
            }
            this.espressoShots=shots;
            return this;
        }
        public Builder addExtra(String extra){
            if(extra==null||extra.isBlank()){
                throw new IllegalArgumentException("Extra cannot be null or blank!");
            }
            this.extras.add(extra);
            return this;
        }
        //build method to create CustomDrink instance
        public CustomDrink build(){
            CustomDrink drink=new CustomDrink(size,milk,syrup,temperature,espressoShots);
            drink.extras.addAll(this.extras);
            return drink;
        }
    }
}