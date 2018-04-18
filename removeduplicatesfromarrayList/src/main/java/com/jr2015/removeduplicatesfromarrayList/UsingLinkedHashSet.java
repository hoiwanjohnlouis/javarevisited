package com.jr2015.removeduplicatesfromarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Copyright 8/23/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Package com.hwtechservices.jr2015.removeduplicatesfromarrayList
 * Project removeduplicatesfromarrayList
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class UsingLinkedHashSet {

    // we will use LinkedHashSet, Which guarantees insertion order.
    // Just remember checking whether ArrayList contains duplicates
    // or not is completely different than removing it, which is what
    // we are doing here. Here is a another example of removing
    // duplicate entries from ArrayList without losing insertion
    // order or entries:

    public static void processData() {

        //ArrayList with duplicates String
        List<String> duplicateList = (List<String>) Arrays.asList("Android" , "Android", "iOS", "Windows mobile");

        //should print 4 becaues of duplicates Android
        System.out.println("size of Arraylist with duplicates: " + duplicateList.size());
        System.out.println("ArrayList with duplicates: " + duplicateList);

        //Converting ArrayList to HashSet to remove duplicates
        LinkedHashSet<String> listToSet = new LinkedHashSet<String>(duplicateList);

        //Creating Arraylist without duplicate values
        List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);

        //should print 3 becaues of duplicates Android removed
        System.out.println("size of ArrayList without duplicates: " + listToSet.size());
        System.out.println("ArrayList after removing duplicates in same order: " + listWithoutDuplicates);


    }

}

//  Output:
//      size of Arraylist with duplicates: 4
//      ArrayList with duplicates: [Android, Android, iOS, Windows mobile]
//      size of ArrayList without duplicates: 3
//      ArrayList after removing duplicates in same order: [Android, iOS,
// Windows mobile]

