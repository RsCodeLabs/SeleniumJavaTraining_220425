package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

public class Assignment14EmployeeManagement {
    abstract class Employee{
        String name;
        int empId;
        abstract void work();
    }
    abstract class Manager extends Employee{
        abstract void manageTeam();
    }

    abstract class Developer extends Employee{
        abstract void writeCode();
    }

    public void main(String[] args) {
        Manager manager = new Manager() {
            @Override
            void manageTeam() {

            }

            @Override
            void work() {

            }
        };
        Developer developer = new Developer() {
            @Override
            void writeCode() {

            }

            @Override
            void work() {

            }
        };

    }

}
