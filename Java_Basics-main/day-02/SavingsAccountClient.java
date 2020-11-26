public class SavingsAccountClient{
    public static void main(String args[]){
        Address address1 = new Address("Paltan", "484003", "Dehradun", "Uttarakhand", "India");
        Address address2 = new Address("Jakhan", "484003", "Dehradun", "Uttarakhand", "India");


        SavingsAccount annieAccount=new SavingsAccount("Annie",100000,"AB2323443",address1);
        annieAccount.deposit(35000);
        double initialAccountBalance = annieAccount.checkBalance();
        // System.out.printf("Initial account balance is %s %n",initialAccountBalance);


        annieAccount.deposit(35000);
        annieAccount.deposit(50000);
        annieAccount.withdraw(20000);

        double finalAccountBalance = annieAccount.checkBalance();
        // System.out.printf("Final account balance is %s %n",finalAccountBalance);

        double amountWithdrew = annieAccount.withdraw(30000);
        // System.out.printf("Amount withdrew %s %n",amountWithdrew);

        SavingsAccount akanshaAccount = new SavingsAccount(98237636,"Akansha",200000,"AB2323FD",address2);
        akanshaAccount.deposit(42000);
        // System.out.printf("Initial account balance is %s %n",annieAccount.checkBalance());

        // Address address = new Address();
        // address.setStreet("Diversion, Dehradun");
        // address.setZipcode("484001");
        // address.setCity("Dehradun");
        // address.setState("Uttarakhand");
        // address.setCountry("India");

        Address address3 = new Address("Makkawala", "484003", "Dehradun", "Uttarakhand", "India");
        // address1.setStreet("Paltan, Dehradun");

        annieAccount.updateAddress(address1);

        // annieAccount.updateAddress(address);

        Address  annieAddress = annieAccount.getAddress();

        System.out.println("Address : "+ annieAddress.getStreet());
        System.out.println("ZipCode : " + annieAddress.getZipcode()); 
        System.out.println("City "+ annieAddress.getCity());
        System.out.println("State : " + annieAddress.getState()); 
        System.out.println("Country "+ annieAddress.getCountry());









    }
}
