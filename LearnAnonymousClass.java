// Anonymous class is a nested class that doesn't have any name.
class Computer{
    public void config(){
        System.out.println("Computer Config started");
    }
}
public class LearnAnonymousClass {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.config();
        Computer c2 = new Computer(){
          //This is an anonymous inner class.
          public void config(){
              System.out.println("Deep Configuration started.");
              //Naming Convention implemented in JVM for anonymous class.
              System.out.println("Anonymous Class name is : " + getClass().getName());
          }
        };
        c2.config();
    }
}
