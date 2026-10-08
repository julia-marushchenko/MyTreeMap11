/**
 *  Java program to create and use TreeMap instance.
 */

package com.mycollections;

/**
 *  Main class.
 */

import java.util.Map;
import java.util.TreeMap;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create TreeMap object.
        Map<Float, Integer> myMap = new TreeMap<>();

        // Add elements.
        myMap.put(2.1F, 1223456);
        myMap.put(2.3F, 654321);
        myMap.put(2.2F, 987654556);
        myMap.put(2.0F, 345678);
        myMap.put(2.7F, 987123);

        // Show.
        System.out.println("MyMap: " + myMap); // Output: MyMap: {2.0=345678, 2.1=1223456, 2.2=987654556, 2.3=654321,
                                               // 2.7=987123}

        // Add more elements.
        myMap.put(2.4F, 456234);
        myMap.put(2.6F, 123);
        myMap.put(2.5F, 321);

        // Show.
        System.out.println("MyMap: " + myMap); // Output: MyMap: {2.0=345678, 2.1=1223456, 2.2=987654556, 2.3=654321,
                                               // 2.4=456234, 2.5=321, 2.6=123, 2.7=987123}

        // Replace.
        myMap.replace(2.2F, 234);

        // Show.
        System.out.println("MyMap: " + myMap); // Output: MyMap: {2.0=345678, 2.1=1223456, 2.2=234, 2.3=654321,
                                               // 2.4=456234, 2.5=321, 2.6=123, 2.7=987123}

        // Delete.
        myMap.remove(2.0F);
        myMap.remove(2.7F);
        myMap.remove(2.6F);

        // Show.
        System.out.println("MyMap: " + myMap); // Output: MyMap: {2.1=1223456, 2.2=234, 2.3=654321, 2.4=456234, 2.5=321}

        // Clear.
        myMap.clear();

    }
}