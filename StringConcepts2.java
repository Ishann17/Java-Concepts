public class StringConcepts2 {
    public static void main(String[] args) {
        if("string".toUpperCase() == "STRING"){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        String s = "IShan Singh Raghav Java";
        System.out.println(s.substring(6,3));
    }
}
/*
The left-hand side ("string".toUpperCase()) string is created at runtime, which creates a new string object in the Heap,
 while the right-hand side "STRING" is a string literal stored in the String Constant Pool.
 Therefore, the output is false.
 */