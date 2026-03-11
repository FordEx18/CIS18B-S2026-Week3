//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
//Interface for PaymentMethod
public interface PaymentMethod {
    //Method to process payment, returns a PaymentReceipt
    public PaymentReceipt pay(String orderId, BigDecimal amount);
}