package DeepalyAssignments.Java.JavaAssignments.Assignment18;



public class Person {
    private String name;
    protected int age;
    String city;
    public String country;

    public Person(){
        System.out.println("I am constructor");
    }



    public void setName(String n ) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setCountry(String country){
        this.country =country;
    }

    public String getCountry() {
        return country;
    }
}


