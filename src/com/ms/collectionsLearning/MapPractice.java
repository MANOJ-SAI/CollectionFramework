package com.ms.collectionsLearning;

import java.util.*;


// HashMap,LinkedHashMap,HashTale and TreeMap has same function what we used in below. difference are in internal implementations
public class MapPractice {

    public static void main(String[] args) {
        System.out.println("LinkedHashMap: ");
        Map<Integer,String> map = new LinkedHashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("one"));
        map.putIfAbsent(5,"five");
        map.remove(1);
        System.out.println(map.get(5));
        map.replace(5,"5");
        Set<Map.Entry<Integer,String>> s = map.entrySet();
        for(Map.Entry<Integer,String> entry : s){
            System.out.println(entry.getKey()+" >>> "+entry.getValue());
        }

        System.out.println("HashTable: ");
        Map<Integer,String> map1 = new Hashtable<>();

        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");
        map1.put(4,"four");

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.containsKey(4));
        System.out.println(map1.containsValue("one"));
        map1.putIfAbsent(5,"five");
        map1.remove(1);
        System.out.println(map1.get(5));
        map1.replace(5,"5");
        Set<Map.Entry<Integer,String>> s1 = map1.entrySet();
        for(Map.Entry<Integer,String> entry : s1){
            System.out.println(entry.getKey()+" >>> "+entry.getValue());
        }

        System.out.println("HashMap: ");
        Map<Integer,String> map2 = new HashMap<>();

        map2.put(1,"one");
        map2.put(2,"two");
        map2.put(3,"three");
        map2.put(4,"four");

        System.out.println(map2.keySet());
        System.out.println(map2.values());
        System.out.println(map2.containsKey(4));
        System.out.println(map2.containsValue("one"));
        map2.putIfAbsent(5,"five");
        map2.remove(1);
        System.out.println(map2.get(5));
        map2.replace(5,"5");
        Set<Map.Entry<Integer,String>> s2 = map2.entrySet();
        for(Map.Entry<Integer,String> entry : s2){
            System.out.println(entry.getKey()+" >>> "+entry.getValue());
        }

        System.out.println("TreeMap: ");
        Map<Integer,String> map3 = new TreeMap<>();

        map3.put(1,"one");
        map3.put(2,"two");
        map3.put(3,"three");
        map3.put(4,"four");

        System.out.println(map3.keySet());
        System.out.println(map3.values());
        System.out.println(map3.containsKey(4));
        System.out.println(map3.containsValue("one"));
        map3.putIfAbsent(5,"five");
        map3.remove(1);
        System.out.println(map3.get(5));
        map3.replace(5,"5");
        Set<Map.Entry<Integer,String>> s3 = map3.entrySet();
        for(Map.Entry<Integer,String> entry : s3){
            System.out.println(entry.getKey()+" >>> "+entry.getValue());
        }
    }
}
