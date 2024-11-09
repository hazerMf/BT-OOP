/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermgmt;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class OrderList {
    private ArrayList<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }

    public void remove(Order order) {
        if(orders.contains(order))
            orders.remove(order);
        else
            System.out.println("Order not exist");
    }

    public int getCount() {
        return orders.size();
    }

    public Iterator<Order> getIterator() {
        return orders.iterator();
    }
    
    public ArrayList<Order> getOrders(){
        return orders;
    }
}
