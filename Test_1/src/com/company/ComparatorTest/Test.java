package com.company.ComparatorTest;

        import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        // for (String friend: friends) {
        //     System.out.println(friend);
        // }
        System.out.println(Arrays.toString(friends));

        Arrays.sort (friends, new LengthComparator());
        // for (String friend: friends) {
        //     System.out.println(friend);
        // }
        System.out.println(Arrays.toString(friends));
    }
}
