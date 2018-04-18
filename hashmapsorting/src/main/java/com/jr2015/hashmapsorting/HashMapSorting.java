package com.jr2015.hashmapsorting;

/**
 * Copyright 10/20/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Login   KimHaNeul
 * <p>
 * Package com.hwtechservicesllc.jr2015.hashmapsorting
 * Project myJavaPrototyping
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

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/** How to sort HashMap in Java by keys and values.
 *  HashMap doesn't guarantee any order, so you cannot rely on it, even if
 *  it appear that it storing entries in a particular order, because
 *  it may not be available in future version e.g. earlier HashMap stores
 *  integer keys on the order they are inserted but from Java 8 it has changed.
 *
 *  * @author WINDOWS 8
 **/

public class HashMapSorting{
    public static void processData() throws ParseException {

        // let's create a map with Java releases and their code names
        HashMap<String, String> codenames = new HashMap<String, String>();

        codenames.put("JDK 1.1.4", "Sparkler");
        codenames.put("J2SE 1.2", "Playground");
        codenames.put("J2SE 1.3", "Kestrel");
        codenames.put("J2SE 1.4", "Merlin");
        codenames.put("J2SE 5.0", "Tiger");
        codenames.put("Java SE 6", "Mustang");
        codenames.put("Java SE 7", "Dolphin");

        System.out.println("HashMap before sorting, random order ");
        Set<Entry<String, String>> entries = codenames.entrySet();
        for(Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

        // Now let's sort HashMap by keys first
        // all you need to do is create a TreeMap with mappings of HashMap
        // TreeMap keeps all entries in sorted order
        TreeMap<String, String> sorted = new TreeMap<>(codenames);
        Set<Entry<String, String>> mappings = sorted.entrySet();
        System.out.println("HashMap after sorting by keys in ascending order ");
        for(Entry<String, String> mapping : mappings){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }

        // Now let's sort the HashMap by values
        // there is no direct way to sort HashMap by values but you
        // can do this by writing your own comparator, which takes
        // Map.Entry object and arrange them in order increasing
        // or decreasing by values.
        Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>() {
            @Override public int compare(Entry<String, String> e1, Entry<String, String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };

        // Sort method needs a List, so let's first convert Set to List in Java
        List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(entries);

        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, valueComparator);
        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());

        // copying entries from List to Map
        for(Entry<String, String> entry : listOfEntries) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        System.out.println("HashMap after sorting entries by values ");
        Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
        for(Entry<String, String> mapping : entrySetSortedByValue) {
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
    }
}
/*
Output:

HashMap before sorting, random order
J2SE 1.2 ==> Playground
JDK 1.1.4 ==> Sparkler
J2SE 1.3 ==> Kestrel
J2SE 1.4 ==> Merlin
J2SE 5.0 ==> Tiger
Java SE 7 ==> Dolphin
Java SE 6 ==> Mustang
HashMap after sorting by keys in ascending order
J2SE 1.2 ==> Playground
J2SE 1.3 ==> Kestrel
J2SE 1.4 ==> Merlin
J2SE 5.0 ==> Tiger
JDK 1.1.4 ==> Sparkler
Java SE 6 ==> Mustang
Java SE 7 ==> Dolphin
HashMap after sorting entries by values
Java SE 7 ==> Dolphin
J2SE 1.3 ==> Kestrel
J2SE 1.4 ==> Merlin
Java SE 6 ==> Mustang
J2SE 1.2 ==> Playground
JDK 1.1.4 ==> Sparkler
J2SE 5.0 ==> Tiger
*/