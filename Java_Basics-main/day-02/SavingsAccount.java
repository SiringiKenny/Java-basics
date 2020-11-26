public class SavingsAccount{
    
    private long accountNumber;
    private String accountName;
    private double accountBalance;
    private String ifscCode;
    
    private Address address;

    public SavingsAccount(String accountName,double accountBalance,String ifscCode,Address address){

        this.accountName=accountName;
        this.accountBalance=accountBalance;
        this.ifscCode=ifscCode;
        this.address=address;
    }

    public SavingsAccount(long accountNumber,String accountName,double accountBalance,String ifscCode,Address address){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.accountBalance=accountBalance;
        this.ifscCode=ifscCode;
        this.address=address;
    }



    public void deposit(double amountToBeDeposited){
        this.accountBalance += amountToBeDeposited;
    }

    public double withdraw(double amountToBeWithdrawn){
        if(this.accountBalance >= amountToBeWithdrawn){
            this.accountBalance -= amountToBeWithdrawn;
            return amountToBeWithdrawn;
        }
        return 0;
    }

    public double checkBalance(){
        return this.accountBalance;
    } 

    public void updateAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return this.address;
    }
}