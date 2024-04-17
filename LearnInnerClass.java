//IMPORTANT NOTE ---> Outer Class can never be static.
class A{
   public void dispA(){
       System.out.println("We are inside class A.");
   }
    class B{
       public void dispB(){
           System.out.println("Inside Inner class B.");
           //Naming Convention implemented in JVM for inner class.
           System.out.println("Class B name is : " + getClass().getName());
       }
   }
    static class C{
        public void dispC(){
            System.out.println("Inside Static Inner class C.");
            //Naming Convention implemented in JVM for inner class.
            System.out.println("Class C name is : " + getClass().getName());
        }
    }
 }
public class LearnInnerClass {
    public static void main(String[] args) {
        //Object of outer class
        A obj = new A();
        obj.dispA();

        //Creating Object of Non-Static Inner class.
        A.B obj1 = obj.new B();
        obj1.dispB();

        //Creating Object of Static Inner class.
        A.C obj2 = new A.C();
        obj2.dispC();
    }
}
