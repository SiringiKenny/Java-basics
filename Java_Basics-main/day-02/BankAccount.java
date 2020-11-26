public abstract class BankAccount{
     double accountBalance;
    private String accountName;
    private String accountNumber;

    public BankAccount(String accountName,double initialDeposit){
        this.accountName = accountName;
        this.accountBalance = initialDeposit;
    }

    public void deposit(double amount){
      this.accountBalance += amount;
    }

    public abstract double withdraw(double amount);
    // {
    //     if( this.accountBalance >= amount){
    //         this.accountBalance -= amount;
    //         return amount;
    //     }
    //     return 0;
    // }
    
    public double getBalance(){
        return this.accountBalance;
    }
}

