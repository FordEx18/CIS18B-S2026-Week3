//imports
import java.math.BigDecimal;
import java.time.Instant;
//class for credit card payment method
public class CreditCardPayment implements PaymentMethod{
    //Field to store last 4 digits of credit card
    private String last4;
    //constructor
    public CreditCardPayment(String last4){
        if(last4.length()!=4){
            throw new IllegalArgumentException("Last 4 digits must be exactly 4 characters!");
        }
        this.last4=last4;
    }
    //Override pay method to process credit card payment
    @Override
    public PaymentReceipt pay(String orderId, BigDecimal amount){
        String method="CREDIT_CARD(****"+last4+")";
        return new PaymentReceipt(orderId, amount, method, Instant.now());
    }
}