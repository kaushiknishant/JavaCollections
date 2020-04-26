package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList[] arr = new ArrayList[20002];
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            arr[i]  = new ArrayList();
            int num = scan.nextInt();
            for(int j = 1; j <= num; j++){
                int val = scan.nextInt();
                arr[i].add(val);
            }
        }
        int query = scan.nextInt();
        for(int i=1; i<=query; i++)
        {
            int x,y;
            x = scan.nextInt();
            y = scan.nextInt();
            try
            {
                System.out.println(arr[x].get(y-1));
            }catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }


    }
}
