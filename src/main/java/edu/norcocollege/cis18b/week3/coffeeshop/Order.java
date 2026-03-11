//package
package edu.norcocollege.cis18b.week3.coffeeshop;
//Imports
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Collections;
//Class for Orders
public class Order{
    //Private Variables
    private String orderId;
    private List<MenuItem> items=new ArrayList<>();
    //Constructors
    public Order(String orderId){
        if(orderId==null||orderId.isBlank()){
            throw new IllegalArgumentException("Order ID cannot be blank or null!");
        }
        this.orderId=orderId;
    }
    //addItem method to add items to the order
    public void addItem(MenuItem item){
        if(item==null){
            throw new IllegalArgumentException("Item cannot be null!");
        }
        items.add(item);
    }
    //Getters
    public List<MenuItem> getItems(){
        return Collections.unmodifiableList(items);
    }
    public String getOrderId(){
        return orderId;
    }
    //total method to calculate the total price of the order
    public BigDecimal total(){
        BigDecimal total=BigDecimal.ZERO;
        for(MenuItem i:items){
            total=total.add(i.getPrice());
        }
        return total;
    }
}