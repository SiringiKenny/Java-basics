import java.util.Scanner;

public class PaymentGatewayClient {

    public static void main(String[] args) {

        System.out.println("Please select the payment method");
        System.out.println("1 -> Google pay");
        System.out.println("2 -> Phone pay");
        System.out.println("3 -> Paytm");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        PaymentGateway gateway = null;
        PhoneRecharge client = null;
        switch (option) {
            case 1:
                gateway = new GooglePay();
                client = new GooglePay();
                break;
            case 2:
                gateway = new PhonePay();
                client = new PhonePay();
                break;
            case 3:
                gateway = new Paytm();
                break;
            default:
                gateway = new Paytm();
                break;

        }

        // PhoneRecharge client = new GooglePay();
        if (client != null)
            client.recharge("Aarchi", 3000);

        // PaymentGateway gateway = new GooglePay();
        gateway.acceptPayment("Akansha", "Annie", 3000, "Thank you for the help ");

        sc.close();
    }
}
