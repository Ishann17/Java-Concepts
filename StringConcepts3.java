public class StringConcepts3 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2.intern());
        System.out.println(s1.intern() == s2.intern());
        System.out.println(s1.intern() == s2);
    }
}
/*
1. String s1 = new String("java"); and String s2 = new String("java"); - These create two distinct String objects in the heap, even though they have the same content.
2. System.out.println(s1 == s2); - This compares the object references, which are different, so it prints false.
3. System.out.println(s1.equals(s2)); - This compares the string contents, which are the same, so it prints true.
4. System.out.println(s1 == s2.intern()); - s2.intern() returns the string from the string constant pool, which is a different object reference than s1, so this prints false.
5. System.out.println(s1.intern() == s2.intern()); - Both s1.intern() and s2.intern() return the same object reference from the string constant pool, so this prints true.
6. System.out.println(s1.intern() == s2); - s1.intern() returns the object from the string constant pool, which is different from the s2 object in the heap, so this prints false.
 */