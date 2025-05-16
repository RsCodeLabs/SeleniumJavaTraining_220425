package com.javapractice.PratikAssignments.Java;

abstract class  Payment
{
    public abstract void makePayment(double amount);
}

class CreditCardPayment extends Payment
{
    @Override
    public void makePayment(double amount)
    {
        System.out.println("Paying $" + amount + " via Credit Card");
    }
}

class PayPalPayment extends Payment
{
    @Override
    public void makePayment(double amount)
    {
        System.out.println("Paying $" + amount + " via PayPal");
    }
}

class UPI extends Payment
{
    @Override
    public void makePayment(double amount)
    {
        System.out.println("Paying $" + amount + " via UPI");
    }
}

public class Assignment12OnlinePaymentSystemAbstractionRealTimeEx {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment();
        ccp.makePayment(500.0);

        PayPalPayment ppp = new PayPalPayment();
        ppp.makePayment(300.0);

        UPI upi = new UPI();
        upi.makePayment(250.0);
    }
}
