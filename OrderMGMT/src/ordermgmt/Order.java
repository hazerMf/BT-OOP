package ordermgmt;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Order {
    private Customer customer;
    private ArrayList<OrderLine> orderLines = new ArrayList<>();
    private Currency total ;

    public Order(Customer customer, Currency total) {
        this.customer = customer;
        this.total = total;
    }

    public void addLine(OrderLine line) {
        orderLines.add(line);
    }

    public void removeLine(OrderLine line) {
        orderLines.remove(line);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    @Override
    public String toString(){
        return "Customer name: " +customer.getName() + "\nCutomer address: " + customer.getAddress() + "\nCustomer code: " + customer.getCode();
    }
}
