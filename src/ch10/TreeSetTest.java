package ch10;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("소현");
        treeSet.add("지민");
        treeSet.add("진경");

        for(String str : treeSet) {
            System.out.println(str);
        }
    }
}
