package employeemgmt;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHours) {
        super(name, paymentPerHours);
    }
    
    @Override
    public int calculateSalary(){
        return this.getPaymentPerHour();
    }
    
}
