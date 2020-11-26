public final class SalaryAccount extends BankAccount{
    
    
    public SalaryAccount(String accountName,double initialDeposit){
        super(accountName,initialDeposit);
     }

     @Override
     public double withdraw(double amount){
         //custom implementation
          if( super.accountBalance >= amount){
            super.accountBalance -= amount;
            return amount;
        }
        return 0;
     }

}