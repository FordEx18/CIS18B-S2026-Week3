//imports
import java.math.BigDecimal;
//Interface for PaymentMethod
public interface PaymentMethod {
    //Method to process payment, returns a PaymentReceipt
    PaymentReceipt pay(String orderId, BigDecimal amount);
}