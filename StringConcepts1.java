/*The key point to remember is that when you concatenate an object with a string using the "+" operator, Java will always
call the toString() method of that object to get a string representation, which is then used in the concatenation.*/
class A{
    public String toString(){
        return null;
    }
}

public class StringConcepts1 {
    public static void main(String[] args) {
        String text = null;
        text = text + new A();
        System.out.println(text.length());
    }
}
/* The key point to remember is that when you concatenate an object with a string using the "+" operator, Java will always
call the toString() method of that object to get a string representation, which is then used in the concatenation.
Therefore, the Output of this program is 8 */
