package com.company;

import java.util.HashSet;
import java.util.Set;

// HashSet and TreeSet are different

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();

        values.add(67);
        values.add(89);
        values.add(799);
        values.add(2);

        values.forEach(System.out::println);
    }
}
