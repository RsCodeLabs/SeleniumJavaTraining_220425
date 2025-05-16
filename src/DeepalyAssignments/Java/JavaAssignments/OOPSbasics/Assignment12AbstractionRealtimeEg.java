package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

/***
 * Topic: Abstraction
 * Java Assignment 12: Real-time Example for Abstraction
 * Title: Online Payment System
 * Scenario:
 * You're developing a payment system for an e-commerce application that supports multiple payment methods: Credit Card, PayPal, and UPI. The users shouldn't worry about how the payment is processed; they should just call a method like makePayment().
 * Requirements:
 * Create an abstract class or interface Payment with an abstract method makePayment(double amount).
 * Implement concrete classes: CreditCardPayment, PayPalPayment, and UPIPayment.
 * Use the abstraction to call payment methods without knowing the implementation details.
 * Objective:
 * Show how abstraction hides complexity and allows interchangeable behavior.
 * Expected Output Example:
 * Paying $500.0 via Credit Card
 * Paying $300.0 via PayPal
 * Paying $250.0 via UPI
 */
public abstract class Assignment12AbstractionRealtimeEg {
    abstract void makePayment(double amount);

    public static void main(String[] args) {
        CreditCardPayment credit = new CreditCardPayment();
        credit.makePayment(500.0);
        PayPalPayment paypal = new PayPalPayment();
        paypal.makePayment(300.0);
        UPIPayment upipay = new UPIPayment();
        upipay.makePayment(250.0);

    }
}

class CreditCardPayment extends Assignment12AbstractionRealtimeEg {
    @Override
    void makePayment(double amount) {
        System.out.println("Paying $"+ amount+ "via Credit Card");
    }
}
class PayPalPayment extends Assignment12AbstractionRealtimeEg{
    @Override
    void makePayment(double amount) {
        System.out.println("Paying $"+ amount+ "via Pay Pal Payment");
    }
}

class UPIPayment extends Assignment12AbstractionRealtimeEg{
    @Override
    void makePayment(double amount) {
        System.out.println("Paying $"+ amount+ "via UPI Payment");
    }
}
