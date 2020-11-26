public class PhonePay implements PaymentGateway, PhoneRecharge {

    public void acceptPayment(String from, String to, double amount, String notes){
        System.out.printf("Transferring from %s to %s, a sum of %s, Notes: %s %n", from, to, amount, notes);
    }

    public void recharge(String phoneNumber, double rechargeAmount){
        System.out.printf("Recharge done for %s for amount %s %n ", phoneNumber, rechargeAmount);
    }

   
}
