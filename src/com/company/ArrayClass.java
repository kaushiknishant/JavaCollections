package com.company;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test-- > 0)
        {
            int n = scan.nextInt();
            int d = scan.nextInt();
            int [] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = scan.nextInt();
            }
            for (int i = 0; i < d/2; i++){
                int temp = array[i];
                array[i] = array[d-i-1];
                array[d-i-1] = temp;
            }
            for (int i = d; i < n; i++){
                int temp = array[i];
                array[i] = array[n-i-1];
                array[n-i-1] = temp;
            }
            for (int i = 0; i < n/2; i++){
                int temp = array[i];
                array[i] = array[n-i-1];
                array[n-i-1] = temp;
            }
            for(int element : array){
                System.out.print(element+" ");
            }

        }
    }
}
