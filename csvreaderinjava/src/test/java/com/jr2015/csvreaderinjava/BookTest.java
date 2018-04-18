/***************************************************************************
 * Copyright February, 2016 HW Tech Services, LLC
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package com.jr2015.csvreaderinjava;

import java.util.List;

/***************************************************************************
 * Program Synopsis
 * <p>
 * Test the Book class.
 * <p>
 * Change History
 * ------Who----- ---When--- ---------------------What----------------------
 * H. Melville    1851.01.31 Wooden whales, or whales cut in profile out of
 * the small dark slabs of the noble South Sea war-wood, are frequently met
 * with in the forecastles of American whalers. Some of them are done with 
 * much accuracy.
 *
 ***************************************************************************/
public class BookTest {
    public static void main(String[] args) {

        List<Book> books = BookUtils.readBooksFromCSV("books.txt");

        // let's print all the person read from CSV file
        for (Book b : books) { System.out.println(b); }

    }
}

/*
Output
Book [name=Effective Java, price=42, author=Joshua Bloch]
Book [name=Head First Java, price=39, author=Kathy Sierra]
Book [name=Head First Design Pattern, price=44, author=Kathy Sierra]
Book [name=Introduction to Algorithms, price=72, author=Thomas Cormen]
*/