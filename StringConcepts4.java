//Try to Guess the Output
public class StringConcepts4 {
    public static void main(String[] args) {
        //Concept #1
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace("C", "X");
        ta = ta.concat(tb);
        System.out.println("#1 --> " + ta);

        //Concept #2
        StringBuilder sb = new StringBuilder("B");
        sb.append(sb.append("A"));
        System.out.println("#2 --> " +sb);
    }
}
/* Concept - #1
LINE 8 will replace the letters during runtime and create a new String Object, but we have not stored it anywhere.
 */

/* Concept - #2
LINE 15 We are using to append function and evaluation will start from bracket. First, it will Append "B" and "A" and create "BA".
then it will again append on sb--->BA. that is BA.append(BA). Therefore the answer is BABA.
 */