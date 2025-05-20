package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

public class Assignment15Polymorphism {

    public static void main(String[] args) {
        //to create an object and to call the methods
        Printer stringPrint = new Printer();
        stringPrint.print("Hi");
        stringPrint.print(9);

        //when we don't want to create an object then we use static methods and call an use below
        Printer.print("Hello");
        Printer.print(10);
    }
    }


class Printer{
    public Printer() {
        System.out.println("I am the Constructor");
    }

    static void print(String message){
        System.out.println("One prints a message : "+message);
    }

    static void print(int number){
        System.out.println("One prints a number :"+ number);
    }

}