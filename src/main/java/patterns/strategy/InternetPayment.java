package patterns.strategy;



public class InternetPayment implements PaymentStrategy {

    private String userID;
    private String password;

    public InternetPayment(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public void doPayment(){
        System.out.println("Internet payment with " + userID + " and " + password);
    }
}
