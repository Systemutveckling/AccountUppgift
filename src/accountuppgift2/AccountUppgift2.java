/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountuppgift2;

import java.util.Scanner;

/**
 *
 * @author Hampus
 */
public class AccountUppgift2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Whats ur fullname ? ");
        Account hampus = new Account(300,sc.nextLine());
        
        System.out.println("\nWelcome " + hampus.getFullName() +  " you have " + hampus.getMoney() + "$ on your account\n");
        System.out.println("1: Enter to deposit money, 2: to withdraw money, 3: leave");
        
        switch (sc.nextInt()) {
            case 1:  System.out.print("You want to put some money in, enter the amount !");
                     hampus.setDepositMoney(sc.nextInt());
                     System.out.println("You now have " + hampus.getMoney());
                     break;
            case 2:  System.out.print("You want to take out some money , enter the amount: ");
                     hampus.setWithdrawMoney(sc.nextInt());
                     break;
            case 3:  
                     break;
            default: System.out.println("Sorry press a value between 1 - 3 ");
                     break;
        }
     
    
        
    
        
        
    }
    
}
