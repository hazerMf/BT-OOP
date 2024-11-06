/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermgmt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */
public class OrderList {
    private List<Order> orders = new ArrayList<>();

    // Add an order to the list
    public void add(Order order) {
        orders.add(order);
    }

    // Remove an order from the list
    public void remove(Order order) {
        orders.remove(order);
    }

    // Get the number of orders
    public int getCount() {
        return orders.size();
    }

    // Get an iterator for the orders
    public Iterator<Order> getIterator() {
        return orders.iterator();
    }
}
