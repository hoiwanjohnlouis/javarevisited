package com.jr2015.removeduplicatesfromarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UsingHashSet {

    // Here is a quick example of removing duplicates from ArrayList in Java.
    // Suppose you have an ArrayList of String which contains 4 Strings out
    // of those one is duplicate and we want to remove that duplicate:

    // Now if you have noticed here duplicate entry "Android" has been
    // removed from ArrayList but order of ArrayList is not same. Since
    // we have converted ArrayList to HashSet we have lost insertion
    // order of elements. but don't worry there is another way of
    // removing duplicates from ArrayList without losing order
    // of elements, for that instead of HashSet we need to use LinkedHashSet.

    public static void processData() {
        //ArrayList with duplicates String
        List<String> duplicateList = (List<String>) Arrays.asList("Android" , "Android", "iOS", "Windows mobile");
        System.out.println("size of Arraylist with duplicates: " + duplicateList.size()); //should print 4 becaues of duplicates Android

        System.out.println(duplicateList);

        //Converting ArrayList to HashSet to remove duplicates
        HashSet<String> listToSet = new HashSet<String>(duplicateList);

        //Creating Arraylist without duplicate values
        List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
        System.out.println("size of ArrayList without duplicates: " + listToSet.size()); //should print 3 becaues of duplicates Android removed

        System.out.println(listWithoutDuplicates);

    }
}
//  Output:
//      size of Arraylist with duplicates: 4
//          [Android, Android, iOS, Windows mobile]
//      size of ArrayList without duplicates: 3
//          [Android, Windows mobile, iOS]
