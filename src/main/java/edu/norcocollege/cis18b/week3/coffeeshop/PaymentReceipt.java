//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
import java.time.Instant;
//Record for PaymentReceipt
public record PaymentReceipt(String orderId,BigDecimal amount,String method,Instant timestamp){}