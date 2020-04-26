package com.company;

import java.util.Scanner;

public class RotatedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0){
            int n = scan.nextInt();
            int d = scan.nextInt();
            int [] array = new int[n];
            for(int i = 0 ; i < n; i++){
                array[i] = scan.nextInt();
            }
            for(int i = 0 ; i < d; i++){
                array[i] = array[(i+d) % n];
            }
            for(int i = 0 ; i < n; i++){
                System.out.print(array[i]);
            }
        }
    }
}
