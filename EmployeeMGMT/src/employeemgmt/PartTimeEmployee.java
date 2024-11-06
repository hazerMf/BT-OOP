/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemgmt;

/**
 *
 * @author User
 */
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
