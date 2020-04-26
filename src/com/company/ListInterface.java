package com.company;
import java.util.*;
public class ListInterface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(78);
        values.add(8);
        values.add(80);
        values.add(81);

        Collections.sort(values);

        values.forEach(System.out::println); // using Stream API ...Lambda Expression


    }
}
