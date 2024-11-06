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
        Employee p = new PartTimeEmployee("Someone",5,5);
        System.out.println(p.calculateSalary());
    }
    
}
