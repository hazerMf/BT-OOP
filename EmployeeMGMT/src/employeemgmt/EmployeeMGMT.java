/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemgmt;

/**
 *
 * @author User
 */
public class EmployeeMGMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new PartTimeEmployee("Someone",5000,5);
        Employee e2 = new FullTimeEmployee("Somebody", 35000);
        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
    
}
