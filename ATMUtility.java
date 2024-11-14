import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMUtility {

    static BankAccount bankAccount;

    static{
        bankAccount = new BankAccount();
        bankAccount.setAccountNumber("987");
        bankAccount.setBankName("PUNJAB NATIONAL BANK");
        bankAccount.setBranchName("BBDU EDU. SOCIETY");
        bankAccount.setIFSC("PUNB012345");
        bankAccount.setName("RITESH PANDEY");
        bankAccount.setPin("1234");
        bankAccount.setCurrentBalance(10000);
    }

    Scanner sc = new Scanner(System.in);

    public void deposit(){
        try {
            System.out.print("Enter Deposit Amount (In Multiple of 100) : ");
            double depositAmount = sc.nextDouble();
    
    
            System.out.print("Enter Your Bank Account Number : ");
            String bankAccountNumber = sc.next();
    
            if(depositAmount % 100 == 0){
                System.out.println(bankAccount.getAccountNumber());
                if(bankAccountNumber.equals(bankAccount.getAccountNumber())){
                    System.out.print("Enter PIN : ");
                    String enteredPin = sc.next();
                    if(enteredPin.equals(bankAccount.getPin())){
                        double newBalance = depositAmount + bankAccount.getCurrentBalance();
                        bankAccount.setCurrentBalance(newBalance);
                        
                        System.out.println("    TRANSACTION SUCCESSFUL");
                        System.out.println(" ");
                        System.out.println("   PRESS 1 TO CHECK BALANCE : ");
                        int balanceCheck = sc.nextInt();
                        System.out.println(" ");
                        if(balanceCheck == 1){
                            System.out.println("         BALANCE : " + newBalance);
                            System.out.println(" ");
                        }
                        System.out.println("       THANK YOU");
        
                    }else{
                        System.out.println("   WRONG PIN");
                    }
                }else{
                    System.out.println("    WRONG BANK ACCOUNT ");
                }
            }else{
                System.out.println(" Enter Amount in Multiple Of 100 ");
            }
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Enter The Number In Multiple of 100");
        }
    }

    public void checkBalance(){
        // BankAccount bank = new BankAccount();

        System.out.print("Enter Bank Account Number : ");
        String userBankAc = sc.next();
        System.out.println(" ");

        if(userBankAc.equals(bankAccount.getAccountNumber())){
            System.out.print("Enter Your Pin :");
            String userPin = sc.next();
            System.out.println(" ");

            if (userPin.equals(bankAccount.getPin())){
                System.out.println("      Balance : "+bankAccount.getCurrentBalance());
                System.out.println(" ");
            }else{
                System.out.println("     Wrong Pin");
                System.out.println(" ");
                System.out.println("   Transaction Failed");
                System.out.println(" ");
                System.out.println("       THANK YOU");
            }
        }else{
            System.out.println("   Wrong Account Number");
            System.out.println(" ");
            System.out.println("   Transaction Failed");
            System.out.println(" ");
            System.out.println("       THANK YOU");
        }
    }
    
    public void accountDetail(){

        System.out.print("Enter Your Pin : ");
        String userPIN = sc.next();
        System.out.println(" ");

        if(userPIN.equals(bankAccount.getPin())){
            System.out.println("***** ACCOUNT DETAILS ******");
            System.out.println(" ");
            System.out.println(bankAccount.toString());
            System.out.println(" ");
            System.out.println("******** THANK YOU ********");
        }else{
            System.out.println("     Wrong PIN Entered");
            System.out.println(" ");
        }
    }
    
    public void changePin(){

        System.out.print("Enter Account Number : ");
        String userBankAccount = sc.next();
        System.out.println(" ");

        if(userBankAccount.equals(bankAccount.getAccountNumber())){
            System.out.print("Enter Pin : ");
            String pin = sc.next();
            System.out.println(" ");
            
            if(pin.equals(bankAccount.getPin())){
                System.out.print("Enter New Pin : ");
                String userNewPin = sc.next();
                System.out.println((" "));
                
                String newPin = userNewPin;
                bankAccount.setPin(newPin);
    
                System.out.println("     PIN CHANGED SUCCESSFULLY");
                System.out.println(" ");

                System.out.println("     Press 1 To show Pin   ");
                int userResponse = sc.nextInt();
                System.out.println("");
                
                if(userResponse == 1){
                    System.out.println("PIN : "+newPin);
                    System.out.println(" ");
                    System.out.println("       THANK YOU");
                }else{
                    System.out.println("       THANK YOU");
                    System.out.println(" ");
                }
            }else{
                System.out.println("     WRONG PIN");
                System.out.println(" ");
                System.out.println("       THANK YOU");
            }
        }else{
            System.out.println("   WRONG ACCOUNT NUMBER");
            System.out.println(" ");
            System.out.println("       THANK YOU");
        }
    }

        public void withdraw(){
            try {
                System.out.print("Enter Amount(in Multiple of 100) : ");
                int userAmount = sc.nextInt();
                System.out.println(" ");
        
                System.out.print("Enter Pin : ");
                String userPin = sc.next();
                System.out.println("");
        
                if(userPin.equals(bankAccount.getPin())){
                    if(userAmount % 100 == 0){
                        System.out.println("     Transaction Under Process");
                        System.out.println(" ");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(userAmount <= bankAccount.getCurrentBalance()){
                            System.out.println("      Transaction Successful");
                            System.out.println(" ");
                            double updatedBalance = bankAccount.getCurrentBalance() - userAmount;
                            bankAccount.setCurrentBalance(updatedBalance);
            
                            System.out.println("Press 1 To Check Balance and any other Number To Exit ");
                            int userResponse = sc.nextInt();
                            System.out.println("");
                            if(userResponse == 1){
                                System.out.println("       Balance : "+updatedBalance);
                            }else{
                                System.out.println("        THANK YOU");
                            }
                        }else{
                            System.out.println("       INSUFFICIENT FUNDS ");
                        }
                    }else{
                        System.out.println("Enter Amount in Multiple of 100");
                        System.out.println("");
        
                        System.out.println("    TRANSACTION FAILED");
                        System.out.println("");
        
                        System.out.println("       THANK YOU");
                    }
        
                }else{
                    System.out.println("Wrong pin Entered");
                    System.out.println(" ");
                    System.out.println("       THANK YOU");
                }
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("Enter The Amout in Multiple of 100");
            }
    }
}
