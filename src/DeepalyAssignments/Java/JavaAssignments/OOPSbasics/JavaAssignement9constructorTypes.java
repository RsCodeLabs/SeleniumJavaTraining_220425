package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;

public class JavaAssignement9constructorTypes {
        String title="Default Book Title";
        String author ="Default Author";
        public JavaAssignement9constructorTypes(){
            System.out.println("Default Book Created");
        }
        public JavaAssignement9constructorTypes(String title, String author){
            System.out.println("Title : "+title+" Author : "+ author);
        }
        public void display(){
            System.out.println("Book details : "+this.title+"Author : "+this.author);
        }

    public static void main(String[] args) {
        JavaAssignement9constructorTypes myBook1 = new JavaAssignement9constructorTypes();
        myBook1.display();
        JavaAssignement9constructorTypes myBook2 = new JavaAssignement9constructorTypes("Java Basics","John Doe" );
        myBook2.display();



    }

}
