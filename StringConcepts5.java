//Try to guess the Output of this program.
public class StringConcepts5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        String s = "java";
        System.out.println(s.equals(sb));
        System.out.println(sb.equals(s));
    }
}

/*
For Line 5 --->
The equals() method in the String class is overridden to check for content equality, but it also checks the instance type of the object it’s being compared to.
Since sb is not an instance of String, this condition is false, so false is printed to the console.
For Line 6 --->
The equals() method in StringBuilder class is not overridden to check for content equality. It checks for reference equality,
which means it will only return true if sb and s point to the exact same object, which is not the case here.
So, this condition is false, and false is printed to the console.
 */