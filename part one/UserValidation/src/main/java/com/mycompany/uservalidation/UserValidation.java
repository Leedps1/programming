/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uservalidation;


/**
 *
 * @author Student
 */
public class UserValidation {
     
    private String Password;
    private String CellPhoneNumber;
    private String UserName;
        
        public UserValidation(String UserName, String Password, String CellPhoneNumber){
            this.UserName = UserName;
            this.Password = Password;
            this.CellPhoneNumber = CellPhoneNumber;
        }
        public boolean checkUserName(){
            return UserName.contains("")&& UserName.length()<=5;
        }
        
        public boolean checkPassword(){
            boolean HasCapital = false;
            boolean HasNumber = false;
            boolean HasSpecialCharacter = false;
            
            if (Password.length()<8){
                return false;
            }
            for(int i = 0; i < Password.length(); i++){
                char currentCharacter = Password.charAt(i);
                
                if(Character.isUpperCase(currentCharacter)){
                    HasCapital = true;
                }
                else if(Character.isDigit(currentCharacter)){
                    HasNumber = true;
                }
                else if(!Character.isLetterOrDigit(currentCharacter)){
                    HasSpecialCharacter =true;
                }
            }
            return HasCapital && HasNumber && HasSpecialCharacter;
        }
        
       public boolean CheckCellPhoneNumber(){
           String CellPhoneRegex = "\\+27\\d{9}$";
           return CellPhoneNumber.matches(CellPhoneRegex);
       }
        public String GetUserMessage(){
            if(checkUserName()){
                return "Username successfully captured";
            }
            return "Username is not correctly formatted, "
                    + "Please ensure that Your username "
                    + "Contains an underscore and is not "
                    + " more than five characters in length. ";
        }
        
        public String GetPasswordMessage(){
            if(checkPassword()){
                return "Password is successfully captured";
            }
            return "Password is not correctly formatted, "
                    + "Please ensure that the password "
                    + "contains eight characters, capital letter, "
                    + "a number and a special character";
        }


    public static void main(String[] args) {
        UserValidation MyUser = new UserValidation("Lee"," lONWABOLEE1$$$", "+27797723633");
        
        
        System.out.println(MyUser.GetUserMessage());
        
        
    }
}