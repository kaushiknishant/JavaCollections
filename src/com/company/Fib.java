package com.company;
// Dynamic programming top-down approach
import java.util.Scanner;

class Example {
    public static int[] F = new int[51];
}

public class Fib {
    static int fib(int n){
        if(Example.F[n] != -1) {
            return Example.F[n];
        }
        Example.F[n] = fib(n-1) +fib(n-2);
        return Example.F[n];
    }

    public static void main(String[] args) {
        for(int i = 0; i < 51; i++){
            Example.F[i] = -1;
        }
        Example.F[0] = 0;
        Example.F[1] = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int results = fib(n);
        System.out.println(results);
    }

}
