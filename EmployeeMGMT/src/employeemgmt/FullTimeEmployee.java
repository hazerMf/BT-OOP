/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemgmt;

/**
 *
 * @author User
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHours) {
        super(name, paymentPerHours);
    }
    
    @Override
    public int calculateSalary(){
        return this.getPaymentPerHour();
    }
    
}
