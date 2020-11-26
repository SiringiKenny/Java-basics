public final class CurrentAccount extends BankAccount{
    private String ifscCode;
    public CurrentAccount(String customerName,double initialBalance){
        super(customerName,initialBalance);
     }

     public CurrentAccount(String customerName){
         super(customerName,0);
     }

     public CurrentAccount(String customerName,String ifscCode){
         super(customerName,0);
         this.ifscCode = ifscCode;
     }

     

     @Override
     public double withdraw(double amount){
         //custom implementation
         if(amount <= 350000)
           System.out.println(" You cannot withdraw, minimum amount in current account should be 35000");
           else if( super.accountBalance >= amount){
            super.accountBalance -= amount;
            return amount;
        }
        return 0;
     }

     @Override
     public void deposit(double amount){
         //custom implementation
         if(amount > 20000)
           System.out.println(" You cannot deposit more than 50000 Rs at one time");
         else 
           super.deposit(amount);
     }


}