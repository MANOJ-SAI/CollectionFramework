package com.ms.collectionsLearning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// HashSet,LinkedHashSet and TreeSet has same function what we used in below. difference are in internal implementations
public class SetPractice {
    public static void main(String[] args) {
        System.out.println("HashSet:");
        HashSet<Integer> s1=new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(20);
        s1.add(40);
        s1.add(60);
        s1.add(70);
        s1.add(80);
        s1.add(100);
        s1.add(100);
        s1.add(110);
        s1.add(120);
        System.out.println(s1);
        s1.remove(10);
        System.out.println(s1);
        s1.add(null);
        System.out.println(s1);
        s1.clear();
        System.out.println(s1.size());

        System.out.println("LinkedHashSet:");
        LinkedHashSet<Integer> s2=new LinkedHashSet<>();
        s2.add(10);
        s2.add(10);
        s2.add(20);
        s2.add(30);
        s2.add(20);
        s2.add(40);
        s2.add(60);
        s2.add(70);
        s2.add(80);
        s2.add(100);
        s2.add(100);
        s2.add(110);
        s2.add(120);
        System.out.println(s2);
        s2.remove(10);
        System.out.println(s2);
        s2.add(null);
        System.out.println(s2);
        s2.clear();
        System.out.println(s2.size());

        System.out.println("TreeSet:");
        TreeSet<Integer> s3=new TreeSet<>();
        s3.add(10);
        s3.add(10);
        s3.add(20);
        s3.add(30);
        s3.add(20);
        s3.add(40);
        s3.add(60);
        s3.add(70);
        s3.add(80);
        s3.add(100);
        s3.add(100);
        s3.add(110);
        s3.add(120);
        System.out.println(s3);
        s3.remove(10);
        System.out.println(s3);
       // s3.add(null); we didn't add null value into the treeSet
        System.out.println(s3);
        s3.clear();
        System.out.println(s3.size());
    }
}
