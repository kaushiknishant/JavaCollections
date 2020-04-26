package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class New2dArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num-- > 0) {
            ArrayList<Integer> array = new ArrayList<>();
            while(true) {
                array.add(sc.nextInt());
            }
        }
    }
}
