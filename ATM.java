/*
1.Create a class to represent the ATM machine.

2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.

3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().

4. Create a class to represent the user's bank account, which stores the account balance.

5. Connect the ATM class with the user's bank account class to access and modify the account
balance.

6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).

7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
*/

import java.util.Scanner;
public class ATM {


    public static void main(String[] args) {

        ATMUtility atm = new ATMUtility();
        int userInput;
        
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("     ****** WELCOME *****");
            System.out.println(" ");
            System.out.println("1) WITHDRAW     "+"          2)DEPOSIT");
            System.out.println(" ");
            System.out.println("3) CHECK BALANCE     "+"     4) ACCOUNT DETAILS");
            System.out.println("");
            System.out.println("5) CHANGE PIN      "+"       6) EXIT");
            System.out.println(" ");
            System.out.println("Press Number Key For Transaction");
            userInput = sc.nextInt();

            if(userInput == 1){
                atm.withdraw();
            }
            else if(userInput == 2){
                atm.deposit();
            }
            else if(userInput == 3){
                atm.checkBalance();
            }
            else if(userInput == 4){
                atm.accountDetail();
            }
            else if(userInput == 5){
                atm.changePin();
            }
            else if(userInput == 6){
                System.out.println(" ");
                System.out.println("        TRANSACTION CANCELLED ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                break;
            }
            System.out.println(" ");

            if(userInput > 6){
                System.out.println("       Invalid Input");
                System.out.println(" ");
                System.out.println("     Transaction Failed");
                System.out.println("");
                System.out.println(" Please Wait! Returning To Main Page.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("");
                System.out.println("");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(userInput < 6);
    }
}