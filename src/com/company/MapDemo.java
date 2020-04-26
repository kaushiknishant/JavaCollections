package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("Name", "Nishant");
        map.put("course","B.Tech");
        map.put("Profession","Software Developer");

        Set<String> keys = map.keySet();

        for(String key : keys){
            System.out.println(key + " -> "+ map.get(key));
        }
        
//        Set<Map.Entry<String,String>> Values = map.entrySet();
//
//        for(Map.Entry<String,String> e : values){
//            System.out.println(e.getKey()+ " : " + e.getValue());
//            e.setValue("III");
//        }


    }
}
