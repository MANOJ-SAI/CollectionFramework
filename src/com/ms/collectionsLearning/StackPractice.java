package com.ms.collectionsLearning;


import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();

        s1.push("White");
        s1.push("Red");
        s1.push("Black");

        System.out.println(s1);

        System.out.println(s1.peek());



        System.out.println(s1.search("White"));
        System.out.println(s1.indexOf("White"));

        s1.pop();
        System.out.println(s1);

    }
}