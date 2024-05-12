package com.ms.collectionsLearning;

import java.sql.Array;
import java.util.*;

// Vector:
//      1. Vectors are use at multi threading concepts
//      2. Vectors are used at where the data is increased exponentially
//      3. Vector introduced in java 1.0
//      4. Collections framework introduced in java 1.2
//      5. Generics are introduced in java 1.5
// Generic example initially without generic we use Vector v1 = new Vector(); I wrote a code for sum of all elements
// in Vector. So I wrote the sum function pass the parameters to that function for calculating sum. Other dev have no
// idea only insert integers, so he adds the string to that vector then sum function throes exception because it won't
// add the string to integers. that's why we use the generics concept like Vector<Integer> v1 = new Vector<>();
// when we use that generics it won't allow the other datatype values except string. In declaration, we use only the
// wrapper classes not the primitive datatypes because it's looking object which has we can create instance
// we can not create instance for primitive data types.So it's allows only the non-primitive datatypes.

//default size of the Vector is 10. when vector is full we add new element again then the capacity of vector is doubled
//for example: vector capacity is 10. it is full. noe I add new element then capacity od vector is 20.like that it continuous
// when we create the vector from array then capacity of vector is size of the array not 10.
public class VPractice {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        System.out.println("Before Adding elements in Vector 1:");
        System.out.println("\t Capacity of Vector 1 is: "+v1.capacity());
        System.out.println("\t Size of Vector 1 is: "+v1.size());

        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        v1.add(60);

        v1.add(70);
        v1.add(80);
        v1.add(90);
        v1.add(100);
        v1.add(110);
        v1.add(120);





        System.out.println("\nVector 1: " +v1);
        System.out.println("\nAfter Adding Elements in Vector 1:");
        System.out.println("\t Capacity of in Vector 1 is: "+v1.capacity());
        System.out.println("\t Size of Vector 1 is : " +v1.size());



        Vector<Integer> v2 = new Vector<>();
        System.out.println("\nBefore Adding elements in Vector 2:");
        System.out.println("\t Capacity of Vector 2 is: "+v2.capacity());
        System.out.println("\t Size of Vector 2 is: "+v2.size());
        v2.add(1000);
        v2.add(2000);
        System.out.println("\nVector 2: "+v2);
        System.out.println("\nAfter Adding Elements in Vector 2:");
        System.out.println("\t Capacity of in Vector 2 is: "+v2.capacity());
        System.out.println("\t Size of in Vector 2 is : " +v2.size());


        System.out.println("\nBasic Operations on Vectors:");
        System.out.println("\tGet the value in index 0: "+v1.get(0));
        System.out.println("\tVerify vector contains the value 120: "+v1.contains(120));
        System.out.println("\tGet the first element in vector: "+v1.firstElement());
        System.out.println("\tGet the last element in vector: "+v1.lastElement());
        v1.add(0,999);
        System.out.println("\tInsert the 999 element at index 0: "+v1);
        v1.set(0,888);
        System.out.println("\tUpdate the 999 element to 888 element at index 0 "+v1);


        System.out.println("\tVerify Vector 1 contains Vector 2 are not: "+v1.containsAll(v2));
        v1.addAll(v2);
        System.out.println("\tAdd Vecotr 2 elements into the Vector 1: "+v1);

        v1.removeElement(120);
        System.out.println("\tRemove element 120 in Vector 1: "+v1);
        v1.remove(0);
        System.out.println("\tRemove element at index 0 in Vector 1: "+v1);
        v1.removeAll(v2);
        System.out.println("\tRemove all elements of Vector 2 in Vector 1: "+v1);
        v1.clear();
        System.out.println("\tRemove all elements in Vector 1: "+v1);

        Integer [] arr = new Integer[]{1,2,3,4,5};
        Vector<Integer> v3 = new Vector<>(Arrays.asList(arr));

        System.out.println("\tCreate the vector from array so vector size is size of array:"+v3.capacity());



    }
}
