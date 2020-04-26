package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i,scan.nextInt());
        }
        int q = scan.nextInt();
        while (q-- > 0) {
            String str = scan.next();
                if(str.equals("Insert")) {
                    int index = scan.nextInt();
                    int value = scan.nextInt();
                    list.add(index, value);
                }
                else if(str.equals("Delete")){
                    int x = scan.nextInt();
                    list.remove(x);
            }

        }
        for(int element : list){
            System.out.print(element+" ");
        }
    }
}
