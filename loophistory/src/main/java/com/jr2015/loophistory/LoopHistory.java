package com.jr2015.loophistory;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright 8/12/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Package com.hwtechservices.jr2015
 * Project LoopHistory
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

public class LoopHistory {

    public static void processData() {

        List<String> countries = Arrays.asList("India", "Australia", "England", "South Africa");

        // pre JDK 1.5, printing each element of List using for loop
        System.out.println("** pre JDK 1.5, printing each element of List using for loop");
        for(int i=0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }

        // JDK 5, added foreach loop and advanced for loop was added to Collection or List :
        System.out.println("\n** JDK 5, added foreach loop and advanced for loop was added to Collection or List :");
        for(String country : countries){
            System.out.println(country);
        }

        // JDK 8, added Lambda and Streams
        System.out.println("\n** JDK 8, added Lambda and Streams");
        countries.stream().forEach(str -> System.out.println(str));

        // JDK 8, also filters for Lambda and Streams
        System.out.println("\n** JDK 8, also filters for Lambda and Streams");
        countries.stream()
                .filter(country -> country.contains("n"))
                .forEach(str -> System.out.println(str));

        // JDK 8, method reference for Lambda and Streams
        System.out.println("\n** JDK 8, method reference for Lambda and Streams");
        countries.stream()
                .filter(country -> country.contains("n"))
                .forEach(System.out::println);

    }
}
