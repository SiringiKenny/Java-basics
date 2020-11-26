import java.util.Scanner;
public class BankAccountClient{
    public static void main(String args[]){
       /* SalaryAccount salaryAccount = new SalaryAccount("Akansha",20_000);
        salaryAccount.deposit(23000);
        System.out.println("Account Balance Salary Account : "+ salaryAccount.getBalance());

        
        SavingAccount savingAccount = new SavingAccount("Annie",10_1000);
        savingAccount.deposit(53000);
        System.out.println("Account Balance Saving Account : "+ savingAccount.getBalance());

        
        CurrentAccount currentAccount = new CurrentAccount("Aarchi");
        currentAccount.deposit(23000);
        System.out.println("Account Balance Current Account "+ currentAccount.getBalance());*/

        //Polymorphism

        // BankAccount account = new SavingAccount("Akansha",10000);
        // SavingAccount account2 = new SavingAccount("Akansha",10000);
        //CurrentAccount account3 = new BankAccount("abcd",23000);//compile time error
        //CurrentAccount account3 = account;//Not allowed:Compile time error

        // account.printAccountStatement(); Compile time error(child class object not accessible by base class reference)
        //account2.printAccountStatement();
        // account.deposit(20000000);

        // BankAccount savingAccount = new SavingAccount("Akansha",10000);
        // savingAccount.withdraw(40000);


        // BankAccount currentAccount = new CurrentAccount("Akansha",10000);
        // currentAccount.withdraw(40000);

        
        // BankAccount salaryAccount = new SalaryAccount("Akansha",100000);
        // salaryAccount.withdraw(40000);
        // System.out.println(" Account Balance Salary Account "+ salaryAccount.getBalance());

        // String input = "1";
        // if(args[0] != null){
        //     input = args[0];
        // }

        System.out.println("Please slect from the options");
        System.out.println("1 -> Savings Account");
        System.out.println("2 -> Current Account");
        System.out.println("3 -> Salaried Account");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        BankAccount bankAccount = null;
        switch (option){
                case 1:
                bankAccount = new SavingAccount("Akansha",10000);
                break;
                case 2:
                bankAccount = new CurrentAccount("Akansha",10000);
                break;
                case 3:
                bankAccount = new SalaryAccount("Akansha",10000);
                break;
                default:
                bankAccount = new SalaryAccount("Akansha",10000);

                  break;
        }

        bankAccount.deposit(23000);
        sc.close();

    }
}