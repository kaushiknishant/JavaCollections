package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test -- > 0){
            int n = scan.nextInt();
            int d = scan.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int element = scan.nextInt();
                array.add(element);
            }
            List<Integer> sublist1 = array.subList(0,d);
            List<Integer> sublist2 = array.subList(d,n);
            Collections.reverse(sublist1);
            Collections.reverse(sublist2);


            List<Integer> mergerlist = new ArrayList<>();
            mergerlist.addAll(sublist1);
            mergerlist.addAll(sublist2);
            Collections.reverse(mergerlist);
            for(int i =0; i < n; i++){
                System.out.print(mergerlist.get(i)+" ");
          }
            System.out.println();
        }


    }
}
