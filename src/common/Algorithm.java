/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author Admin
 */
public class Algorithm {
    Library l;
    Validation val;

    public Algorithm() {
        l = new Library();
        val = new Validation();
    }
    
    public void checkPhoneNumber() {
        String s = l.getString("Phone number: ");
        while (val.checkPhoneNumber(s) == null) {
            System.out.println("Invalid format. Please input again.");
            s = l.getString("Phone number: ");
        }
        System.out.println("Successful");
    }
    public void checkEmail() {
        String s = l.getString("Email: ");
        while (val.checkEmail(s) == null) {
            System.out.println("Invalid format. Please input again.");
            s = l.getString("Email: ");
        }
        System.out.println("Successful");
    }
    public void checkDate() {
        String s = l.getString("Date: ");
        while (val.checkDate(s) == null) {
            System.out.println("Invalid format (dd/mm/yyyy). Please input again.");
            s = l.getString("Date: ");
        }
        System.out.println("Successful");
    }
}
