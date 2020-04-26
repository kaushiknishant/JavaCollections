package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// same thing can be done by comparable and extra method CompareTo

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(799);
        values.add(896);
        values.add(605);
        values.add(708);
        values.add(501);

//        //  Anonymous Class
//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1%10 > o2%10)
//                    return 1;
//
//                return -1;
//            }
//        };

        //Lambda Expression
        Comparator<Integer> com = (o1, o2) -> {
            return o1%10>o2%10?1:-1;
        };

        Collections.sort(values,com);

        for(int i : values){
            System.out.println(i);
        }

    }
}
