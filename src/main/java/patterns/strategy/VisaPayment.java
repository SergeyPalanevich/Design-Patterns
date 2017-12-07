package patterns.strategy;

public class VisaPayment implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String date;
    private String code;

    public VisaPayment(String name, String cardNumber, String date, String code) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.date = date;
        this.code = code;
    }

    public void doPayment(){
        System.out.println("Visa payment from card " + cardNumber);
    }
}
