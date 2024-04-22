import java.util.Scanner;

class Student{
    //Static blocks are executed during the class loading phase.
    static{
        System.out.println("Student .class file is loading.");
    }
    Student(){
        System.out.println("Student Constructor is called.");
    }
}

public class NewInstanceMethodConcept {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter class you want to load and create an object: ");
        String className = sc.nextLine();

        /*To load the class explicitly we have to use a method called forName(), this method
          throws an exception called ClassNotFoundException.*/

        Class c = Class.forName(className);

        /*
        To create an object for the loaded class we use a method called newInstance() this method throws
        two exception --->
        1. InstantiationException if the loaded class does not have zero parameterized constructor.
        2. IllegalAccessException if the loaded class have private constructor.
        */

        Object obj = c.newInstance();

        //Performing type casting to get Student Object.

        Student std = (Student) obj;

        System.out.println("Hashcode of the object created : " + std);
    }
}
