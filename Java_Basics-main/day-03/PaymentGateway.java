public interface PaymentGateway {
    public abstract void acceptPayment(String from, String to, double amount, String notes);
}
