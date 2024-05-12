package com.ms.collectionsLearning;


import java.util.*;

//The classes which are introduced in java 1.0 are called as legacy classes
//The classes which are introduced in java 1.2 are called as new classes
// legacy classes --> Vector,Stack,HashTable,Dictionary and Properties
public class IterationPractice {
    public static void main(String[] args) {
        //Enumeration
        // The Enumeration is only iterate the legacy class and new classes collection
        // we can traverse in forward direction only
        //when we use Enumeration we just print tha values we didn't perform add,update,remove operations on the collection

        System.out.println("Enumeration: ");
        Vector<Integer> s1= new Vector<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        Enumeration<Integer> e = s1.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(s1);


        System.out.println("Iterator: ");
        //Iterator
        //The Iterator is introduced for iterate the all collection objects
        //we can traverse only in forward direction
        //when we use Iterator we just print the values we didn't perform add,update,
        //but we have special permission to perform remove operations on the collection
        //In map the iterator is not applied directly, but we can do it on keySet and ValueSet
        // we can also convert enumeration into the iterator using asIterator()

        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        Iterator<Integer> it=a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        it.remove();
        System.out.println(a);


        System.out.println("ListIterator: ");
        //ListIterator
        //The ListIterator is introduced for iterate the collection objects which are implements the List interface
        //ArrayList,Vector,Stack,LinkedList
        //we do forward and backward traverse using this ListIterator (Bi-directional)
        //we can perform the all operation add,update and remove operations
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        ListIterator<Integer> it1= a1.listIterator();
        //forward iteration
        System.out.println("forward iteration: ");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        it1.add(6);
        System.out.println(a1);

        //backward iteration
        System.out.println("backward iteration: ");
        while(it1.hasPrevious()){
            System.out.println(it1.previous());
        }

    }
}
