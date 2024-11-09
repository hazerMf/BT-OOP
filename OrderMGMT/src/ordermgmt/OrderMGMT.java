/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordermgmt;

import java.util.Currency;

/**
 *
 * @author User
 */
public class OrderMGMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer customer1 = new Customer("Ha Noi", "KH01", "Nguyen Van A");
        Customer customer2 = new Customer("Thanh Hoa", "KH02", "Trinh Thi B");
        Customer customer3 = new Customer("HCM", "KH03", "Tran Van C");
        
        Currency usd = Currency.getInstance("USD");
        Currency eur = Currency.getInstance("EUR");
        Currency vnd = Currency.getInstance("VND");
        
        OrderLine line1  = new OrderLine(usd);
        OrderLine line2 = new OrderLine(eur);
        OrderLine line3 = new OrderLine(vnd);
        
        Order order1 = new Order(customer1, usd);
        order1.addLine(line1);
        order1.addLine(line3);
        Order order2 = new Order(customer2, usd);
        order2.addLine(line2);
        Order order3 = new Order(customer3, usd);
        order3.addLine(line3);
        
        OrderList orderList = new OrderList();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        System.out.println("N# orders: " + orderList.getCount());
        System.out.println();
        
        for(Order order : orderList.getOrders()){
            System.out.printf("Customer code: %s \n" , order.getCustomer().getCode());
            System.out.println(order);
            System.out.println("Order Lines:");
            for (OrderLine line : order.getOrderLines()) {
                System.out.println("-" + line.getValue());
            }
            System.out.println();
        }
        orderList.remove(order2);
        orderList.remove(order1);
        orderList.remove(order2);
        
        System.out.println("N# orders: " + orderList.getCount());
        
        System.out.println();
        for(Order order: orderList.getOrders()){
            System.out.printf("Customer code: %s \n" , order.getCustomer().getCode());
            System.out.println(order);
            System.out.println("Order Lines:");
            for (OrderLine line : order.getOrderLines()) {
                System.out.println("-" + line.getValue());
            }
        }
    }
    
}
