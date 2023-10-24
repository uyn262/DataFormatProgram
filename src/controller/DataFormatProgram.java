/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;
/**
 *
 * @author Admin
 */
public class DataFormatProgram extends Menu<String>{
    static String[] options = {"Check phone number", "Check email", "Check date", "Exit"};
    Algorithm ar;
    public DataFormatProgram() {
        super("===== VALIDATE PROGRAM =====", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1: ar.checkPhoneNumber();
                break;
            case 2: ar.checkEmail();
                break;
            case 3: ar.checkDate();
                break;
            case 4: System.exit(0);
                break;
        }
    }
    
}
