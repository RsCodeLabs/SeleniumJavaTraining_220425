package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

import java.util.*;

public class Assignment16Interface {
    public static void main(String[] args) {

        //created with object
        Car car = new Car();
        car.start();
        car.getSpeed();
        car.stop();

        //created an object with Interface type and subclass
        Vehicle bike = new Bike();
        bike.start();
        bike.getSpeed();
        bike.stop();


        Bike bike1 = new Bike();
        bike1.start();
        bike1.getSpeed();
        bike1.stop();

        List<String> slist = new ArrayList<>();
        List<Integer> nlist = new LinkedList<>();
        Map<Integer, Integer> sumPair = new HashMap<>();

    }
}

interface Vehicle{
    void start();
    void stop();
    void getSpeed();

}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");

    }

    @Override
    public void stop() {
        System.out.println("Car stopped");

    }

    @Override
    public void getSpeed() {
        System.out.println("Car: 100 KM/Hr");

    }
}

class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bike started");

    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");

    }

    @Override
    public void getSpeed() {
        System.out.println("Bike: 60 KM/Hr");

    }
}