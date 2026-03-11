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
    private List<MenuItem> items;
    //Constructors
    public Order(String orderId,List<MenuItem> items){
        if(orderId==null||orderId.isBlank()){
            throw new IllegalArgumentException("Order ID cannot be blank or null!");
        }
        this.orderId=orderId;
        this.items=new ArrayList<>();
    }
    //addItem method to add items to the order
    void addItem(MenuItem item){
        if(item==null){
            throw new IllegalArgumentException("Item cannot be null!");
        }
        items.add(item);
    }
    //Getters
    void List<MenuItem> getItems(){
        return Collections.unmodifiableList(items);
    }
    void String getOrderId(){
        return orderId;
    }
    //total method to calculate the total price of the order
    void BigDecimal total(){
        BigDecimal total=BigDecimal.ZERO;
        for(MenuItem i:items){
            total=total.add(i.getPrice());
        }
        return total;
    }
}