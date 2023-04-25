package ch09;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("진경"));
        hashSet.add(new String("소현"));
        hashSet.add(new String("지민"));
        hashSet.add(new String("효정"));
        hashSet.add(new String("효정"));

        System.out.println(hashSet);
    }
}
