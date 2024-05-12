package com.ms.collectionsLearning;

import java.util.LinkedList;
import java.util.List;

//it is not pure Lst interface. It implements the List and Deque interface. which means it performs List interface and
// Queue Interface methods. Mostly linked List is used data manipulation in middle of the list. the default capacity of
// Linked List is 0 and initial capacity is depending on the adding element into the list. It allows null values and duplicates also.
public class LLPractice {
    public static void main(String[] args) {
        LinkedList<String> l1= new LinkedList<>();

        l1.add("green");
        l1.add("white");
        l1.add("red");
        System.out.println(l1);
        System.out.println(l1.indexOf("white"));
        l1.add(0,"pink");
        System.out.println(l1.get(0));
        List<String> l2= new LinkedList<>();
        l2.add("Y");
        l2.add("E");
        l2.add("S");
        System.out.println(l1.containsAll(l2));
        l1.addAll(l2);
        System.out.println(l1.containsAll(l2));
        l1.remove(0);
        System.out.println(l1);
        l1.remove("green");
        System.out.println(l1);
        l1.removeAll(l2);
        l1.set(0,"orange");
        System.out.println(l1);
    }
}
