package com.javapractice.oops.abstraction;

abstract class TVRemote{
    abstract void pressPowerButton();
    void display(){
        System.out.println("This is concrete method");
    }
}

class SamsungTv extends TVRemote{

    void pressPowerButton() {
        System.out.println("Samsung tv on/off");
    }

}

class SonyTV extends  TVRemote{

    @Override
    void pressPowerButton() {
        System.out.println("Sony tv on/off");
    }
}


class MITV extends SonyTV{

}

public class TVRemoteAbstractEx {
    public static void main(String[] args) {
        TVRemote samsungTV = new SamsungTv();
        samsungTV.pressPowerButton();
        samsungTV.display();

        TVRemote sonyTv = new SonyTV();
        sonyTv.pressPowerButton();

    }
}
