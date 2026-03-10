//Class for Latte, which extends Beverage
public class Latte extends Beverage{
    //static final variable for base price of a latte
    private static final BigDecimal BASE_PRICE=new BigDecimal("4.50");
    
    //constructor
    public Latte(String sku, Size size){
        super(sku, "Latte", BASE_PRICE, size);
    }
}