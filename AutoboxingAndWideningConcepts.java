//Valid Declarations in Java.
public class AutoboxingAndWideningConcepts {
    public static void main(String[] args) {

        int i = 10;//Valid

        Integer n = 10; //Valid because Compiler will do autoboxing using valueOf();

        //int x = 10L; //Invalid Because we cannot cast int to Long

        Long l = 100L; // Valid because of Autoboxing;

        //Long k = 100;
        /*Invalid because Autoboxing will convert it to Integer and
        when compiler will do widening Integer can be converted to Number or Object not Long.*/

        long j = 21; //Valid because compiler will do the widening and int can be converted to long.

        Object o = 10; /*Valid Because autoboxing by compiler will convert to Integer and
         when Widening will happen on Integer it can be converted to Object.*/

        double d = 112; //Valid int get sit in long widening will done by compiler;

        //Double dd = 112; // Invalid, Autoboxing will convert to Integer and widening can convert it to Number or Object.

        Number num = 10; //Valid Autoboxing ---> Integer ---> Widening ---> Number.
    }
}
/*
NOTE: Autoboxing followed by widening is allowed in Java but not Vice-Versa.
*/
