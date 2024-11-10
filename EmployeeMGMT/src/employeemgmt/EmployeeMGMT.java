package employeemgmt;

public class EmployeeMGMT {
    public static void main(String[] args) {
        IEmployee e1 = new PartTimeEmployee("Someone",5000,5);
        IEmployee e2 = new FullTimeEmployee("Somebody", 35000);
        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
    
}
