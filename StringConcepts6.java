//Try to Guess the Output for this program
public class StringConcepts6 {
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;//Memory will be allocated during runtime because wrapper class
        final String str = ":ONE";

        String s1 = i1 + str;
        String s2 = i2 + str;

        System.out.println(s1 == "1:ONE");
        System.out.println(s2 == "1:ONE");

        String x = "ONE ";
        System.out.println(x.concat(x.concat("ELEVEN ")).trim());

    }
}
/*
LINE 8 --->
For String s1 = i1 + str; since i1 is a final primitive int, the compiler can perform the concatenation at compile-time.
This results in the string literal "1:ONE" being created and stored in the String Constant Pool.
Line 9 --->
i2 is an Integer, and using the + operator with an Integer and a String does not result in an interned String.
This results in a new String object being created in the heap, different from the string literal "1:ONE" in the String Constant Pool.
 */
