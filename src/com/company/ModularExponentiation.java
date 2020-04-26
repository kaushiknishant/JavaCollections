package com.company;

import java.util.Scanner;

public class ModularExponentiation {
    static int modular(int x, int n, int m){
        if(n==0)
            return 1;
        else if (n%2 == 0){
            int y = modular(x,n/2, m); // memoization
                return (y*y)%m;

        }
        else
            return((x%m)*modular(x,n-1,m))%m;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int results = modular(x,n,m);
        System.out.println(results);
    }
}
