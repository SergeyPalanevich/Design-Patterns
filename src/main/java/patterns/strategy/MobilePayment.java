package patterns.strategy;

public class MobilePayment implements PaymentStrategy{
    private String mobileOperator;
    private String mobileNumber;
    private String code;

    public MobilePayment(String mobileOperator, String mobileNumber, String code) {
        this.mobileOperator = mobileOperator;
        this.mobileNumber = mobileNumber;
        this.code = code;
    }

    public void doPayment(){
        System.out.println("Mobile payment from number " + mobileNumber);
    }
}
