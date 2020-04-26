package com.company;

import java.util.Scanner;

public class Exponentiation {
    static int power(int x, int n){
        if(n==0)
            return 1;
        else if(n%2==0){
            int y = power(x,n/2);
            return y*y;
        }
        else
            return x*power(x,n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int results = power(x,n);
        System.out.println(results);
    }
}
