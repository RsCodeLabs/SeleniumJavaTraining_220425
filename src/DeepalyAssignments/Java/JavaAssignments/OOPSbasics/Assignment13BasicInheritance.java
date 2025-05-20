package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

public class Assignment13BasicInheritance {

    abstract static class Vehicle{
        String brand;
        abstract void start();
    }
    abstract static class Car extends Vehicle{
        abstract void start();
        abstract void playMusic();
    }

    abstract static class Bike extends Vehicle{
        abstract void doWheelie();
    }

    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            void start() {

            }

            @Override
            void playMusic() {

            }
        };

        Bike bike = new Bike() {
            @Override
            void doWheelie() {

            }

            @Override
            void start() {

            }
        };


    }

}
