/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordermgmt;

import java.util.Currency;

/**
 *
 * @author User
 */
public class OrderLine {
    private Currency value;

    public OrderLine(Currency value) {
        this.value = value;
    }
    
    public Currency getValue() {
        return value;
    }
}
