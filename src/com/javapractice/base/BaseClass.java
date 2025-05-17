package com.javapractice.base;

public class BaseClass {
    public String publicVar = "Public Variable";
   private String privateVar = "Private Variable";
    String defaultVar = "Default Variable";         // no modifier
    protected String protectedVar = "Protected Variable";

    public void showVariables() {
        System.out.println("Inside BaseClass:");
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
    }
}

