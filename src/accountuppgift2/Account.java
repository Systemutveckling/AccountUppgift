/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountuppgift2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Hampus
 * 
 * 
 */


class Account {
      private  int money;
      private String fullName;

      
    Account(int money, String fullName){
    this.money = money;
    this.fullName = fullName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    
    public void setWithdrawMoney(int withdraw){
     if(withdraw <= money){
     money -= withdraw;
     welcomeText();
     } else{
     System.out.println("You tried to withdraw " + withdraw + "$ When you only have " + money + "$ (Withdraw Denied)");
     }
    }
    public void setDepositMoney(int deposit){
        money += deposit;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void welcomeText(){
    System.out.println("Your balance now is : " + money + "$");
    }

}
