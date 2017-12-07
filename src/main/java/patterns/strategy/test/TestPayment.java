package patterns.strategy.test;

import org.testng.annotations.Test;
import patterns.strategy.InternetPayment;
import patterns.strategy.MobilePayment;
import patterns.strategy.PaymentContext;
import patterns.strategy.VisaPayment;

public class TestPayment {
    private PaymentContext paymentContext = new PaymentContext();

    @Test
    public void testOneCanPayWithVisa(){
        paymentContext.setPaymentStrategy(new VisaPayment("sergey", "0808", "2017", "025-986723"));
        paymentContext.pay();
    }

    @Test
    public void testOneCanPayWithMobile(){
        paymentContext.setPaymentStrategy(new MobilePayment("mts", "37529", "025-986723"));
        paymentContext.pay();
    }

    @Test
    public void testOneCanPayWithinternet(){
        paymentContext.setPaymentStrategy(new InternetPayment("00001", "1111"));
        paymentContext.pay();
    }
}
