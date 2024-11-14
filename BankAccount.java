public class BankAccount{

    private String Name;
    private String branchName;
    private String bankName;
    private String accountNumber;
    private String IFSC;
    private double currentBalance;
    private String pin;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String iFSC) {
        IFSC = iFSC;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "BankAccount [Name=" + Name + ", branchName=" + branchName + ", bankName=" + bankName
                + ", accountNumber=" + accountNumber + ", IFSC=" + IFSC + ", currentBalance=" + currentBalance
                + ", pin=" + pin + "]";
    }
}