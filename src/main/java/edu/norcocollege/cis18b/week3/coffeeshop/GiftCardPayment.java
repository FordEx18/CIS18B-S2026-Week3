//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//imports
import java.math.BigDecimal;
import java.time.Instant;
//Class for gift card payment method
public class GiftCardPayment implements PaymentMethod{
    //Field to store gift card balance
    private BigDecimal balance;
    //constructor
    public GiftCardPayment(BigDecimal initialBalance){
        //Balance validation
        if(initialBalance.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("Initial balance cannot be negative!");
        }
        this.balance=initialBalance;
    }
    //Override pay method to process gift card payment
    @Override
    public PaymentReceipt pay(String orderId, BigDecimal amount){
        //Check if balance is sufficient
        if(balance.compareTo(amount)<0){
            throw new IllegalStateException("Insufficient gift card balance!");
        }
        //Deduct amount from balance
        balance=balance.subtract(amount);
        String method="GIFT_CARD(BALANCE: $"+balance+")";
        return new PaymentReceipt(orderId, amount, method, Instant.now());
    }
    //Method to get current balance
    public BigDecimal getBalance(){
        return balance;
    }
}