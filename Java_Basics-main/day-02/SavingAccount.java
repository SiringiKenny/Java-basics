public final class SavingAccount extends BankAccount{

    public SavingAccount(String accountName,double initialDeposit){
       super(accountName,initialDeposit);
    }

    public void printAccountStatement(){
        System.out.println("Printing account statement of savings account");
    }

    @Override
    public double withdraw(double amount){
        //custom implementation
        if(amount <= 50000)
          System.out.println(" You cannot withdraw, minimum amount in saving account should be 50000");
        else if( super.accountBalance >= amount){
                  super.accountBalance -= amount;
                  return amount;
              }
        return 0;
    }


    @Override
    public void deposit(double amount){
        //custom implementation
        if(amount > 100000)
          System.out.println(" You cannot deposit more than 100000 Rs at one time");
        else 
          super.deposit(amount);
    }

}
