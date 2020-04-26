package com.company;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(89);
        vec.add(67);

        for(int i : vec ){
            System.out.println(i);
        }
    }
}
//Use ArrayList instead of Vector