package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection values = new ArrayList();
        values.add(7);
        values.add("nishant");
        values.add(6.7f);

        for(Object i: values){
            System.out.println(i);
        }
    }
}
