/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validationapp1;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ValidationApp1 {
    Scanner input = new Scanner(System.in);
    String UserName = "";
    String Password = "";
    String CellPhoneNumber = "";
    
    
    boolean ValidUserName;
    boolean ValidPassword;
    boolean ValidCellPhoneNumber;

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
            String UserName = "";
    String Password = "";
    String CellPhoneNumber = "";
    
    
    boolean ValidUserName;
    boolean ValidPassword;
    boolean ValidCellPhoneNumber;
          
          
       
        System.out.println("==================================");
        System.out.println("       User Validation App        ");
        System.out.println("==================================");
        
        System.out.println(" Enter your username:   ");
        UserName = input.nextLine();
        
        System.out.println("Enter Password:  ");
        Password = input.nextLine();
        
        System.out.println("Enter Cellphone number:    ");
        CellPhoneNumber = input.nextLine();
        
        
        
        
        
        
    }
}
