/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Validation {
    public String checkPhoneNumber(String s) {
        if (s.matches("^[0-9]{10}$"))
            return s;
        return null;
    }
    
    public String checkEmail(String s) {
        if (s.matches("^[A-Za-z0-9.]+@gmail.com$"))
            return s;
        return null;
    }
    
    public Date checkDate(String s) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            return null;
        }
    }
}
