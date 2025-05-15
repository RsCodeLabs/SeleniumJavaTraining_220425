package com.javapractice.OOPS;

public class Assignment1 {
    public static void staticDisplayWithParameter(){
        System.out.println("One static method without parameters\n");
    }

    public static void staticDisplayWithParameter(int a, int b)
    {
        System.out.println("One static method with parameters\n"+a+b);
    }

    public void nonStaticDisplayWithOutParameter()
    {
        System.out.println("One non-static method without parameters\n");
    }

    public void nonStaticDisplayWithParameter(int a, int b){
        System.out.println("One non-static method with parameters\n"+a+b);

    }
    public static void main(String[] args) {
        staticDisplayWithParameter();
        staticDisplayWithParameter(1,2);
        Assignment1 obj = new Assignment1();
        obj.nonStaticDisplayWithOutParameter();
        obj.nonStaticDisplayWithParameter(3,7);

    }
}
