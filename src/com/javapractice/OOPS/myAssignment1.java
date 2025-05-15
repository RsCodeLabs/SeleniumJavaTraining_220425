package com.javapractice.OOPS;

public class myAssignment1 {
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
        myAssignment1 obj = new myAssignment1();
        obj.nonStaticDisplayWithOutParameter();
        obj.nonStaticDisplayWithParameter(3,7);
        new myAssignment1().nonStaticDisplayWithOutParameter();

    }
}
