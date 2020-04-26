package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test-- > 0){
            int number = scan.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for(int i=0; i < number; i++){
                int element = scan.nextInt();
                array.add(element);
            }
            int find = scan.nextInt();
            Collections.sort(array);
            System.out.println(array.get(find-1));
        }
    }
}
