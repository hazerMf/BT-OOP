package employeemgmt;

public class PartTimeEmployee extends Employee{
    private int workingHours;

    public PartTimeEmployee(String name, int workingHours, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary(){
        return workingHours*this.getPaymentPerHour();
    }
}
