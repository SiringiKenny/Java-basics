public class Paytm implements PaymentGateway {

    public void acceptPayment(String from, String to, double amount, String notes){
        System.out.printf("Transferring from %s to %s, a sum of %s, Notes: %s %n", from, to, amount, notes);
    }
   
}
