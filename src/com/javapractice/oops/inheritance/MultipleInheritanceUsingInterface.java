package com.javapractice.oops.inheritance;

interface Father2{
    void job();
}

interface Mother2{
    void job();
}

class child implements Father2, Mother2{

    @Override
    public void job() {
        System.out.println("Child is a doctor");
    }
}


public class MultipleInheritanceUsingInterface {
}
