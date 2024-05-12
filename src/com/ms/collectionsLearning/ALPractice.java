package com.ms.collectionsLearning;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

//default size of the ArrayList is 0. when ArrayList is full we add new element again then the capacity of ArrayList is increased
// 50% for example: ArrayList initial capacity is 10. it is full. now I add new element then capacity of ArrayList is 15.like that it continuous
// ArrayList overcame the drawback of Vector. like it's not have any default capacity when object is created. it allocates capacity after an element
// added to the list (reduce memory wastage) and it is not synchronized (means increase performance). we explicit make it as synchronized using Collections interface
public class ALPractice {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        System.out.println("Before Adding elements in ArrayList 1:");
        System.out.println("\t Size of ArrayList 1 is: "+al1.size());

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        al1.add(60);

        al1.add(70);
        al1.add(80);
        al1.add(90);
        al1.add(100);
        al1.add(110);
        al1.add(120);





        System.out.println("\nArrayList 1: " +al1);
        System.out.println("\nAfter Adding Elements in ArrayList 1:");
        System.out.println("\t Size of ArrayList 1 is : " +al1.size());



        ArrayList<Integer> al2 = new ArrayList<>();
        System.out.println("\nBefore Adding elements in ArrayList 2:");
        System.out.println("\t Size of ArrayList 2 is: "+al2.size());
        al2.add(1000);
        al2.add(2000);
        System.out.println("\nArrayList 2: "+al2);
        System.out.println("\nAfter Adding Elements in ArrayList 2:");
        System.out.println("\t Size of in ArrayList 2 is : " +al2.size());


        System.out.println("\nBasic Operations on ArrayLists:");
        System.out.println("\tGet the value in index 0: "+al1.get(0));
        System.out.println("\tVerify ArrayList contains the value 120: "+al1.contains(120));
        al1.add(0,999);
        System.out.println("\tInsert the 999 element at index 0: "+al1);
        al1.set(0,888);
        System.out.println("\tUpdate the 999 element to 888 element at index 0 "+al1);



        System.out.println("\tVerify ArrayList 1 contains ArrayList 2 are not: "+al1.containsAll(al2));
        al1.addAll(al2);
        System.out.println("\tAdd ArrayList 2 elements into the ArrayList 1: "+al1);
        System.out.println("\tSorted ArrayList 1: "+al1.stream().sorted().collect(Collectors.toList()));

        System.out.println("\tRemove element 120 in ArrayList 1: "+al1);
        al1.remove(0);
        System.out.println("\tRemove element at index 0 in ArrayList 1: "+al1);
        al1.removeAll(al2);
        System.out.println("\tRemove all elements of ArrayList 2 in ArrayList 1: "+al1);
        al1.clear();
        System.out.println("\tRemove all elements in ArrayList 1: "+al1);

        Integer [] arr = new Integer[]{1,2,3,4,5};
        ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("\tCreate the ArrayList from array so ArrayList size is size of array:"+al3.size());


        Collections.synchronizedList(al3);
        System.out.println("\tSynchronized ArrayList: "+al3);
    }
}