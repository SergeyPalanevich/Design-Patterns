package patterns.strategy;

public class PaymentContext {
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public PaymentContext() {
    }

    public void pay(){
        this.paymentStrategy.doPayment();
    }
}
