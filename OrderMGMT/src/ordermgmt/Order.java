/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermgmt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Order {
    private Customer customer;
    private List<OrderLine> orderLines = new ArrayList<>();
    private double total = 0.0;

    public Order(Customer customer) {
        this.customer = customer;
    }

    // Add a line item to the order
    public void addLine(OrderLine line) {
        orderLines.add(line);
        total += line.getPrice();
    }

    // Remove a line item from the order
    public void removeLine(OrderLine line) {
        if (orderLines.remove(line)) {
            total -= line.getPrice();
        }
    }

    // Get total price of the order
    public double getTotal() {
        return total;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public Customer getCustomer() {
        return customer;
    }
}
