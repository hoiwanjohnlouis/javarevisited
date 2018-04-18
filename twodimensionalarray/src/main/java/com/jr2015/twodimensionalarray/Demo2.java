package com.jr2015.twodimensionalarray;

/**
 * Copyright 9/6/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Package com.hwtechservicesllc.twodimensionalarray
 * Project TwoDimensionalArrary
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

public class Demo2 {

    public static void main(String args[]) {

        // functions the same as Demo1, except it will use subroutines

        // let's create board of 4x4
        int[][] board = new int[4][4];

        // let's loop through array to populate board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
            }
        }

        // let's loop through array to print each row and column
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
                System.out.print(board[row][col] + "\t");
            }

            System.out.println();
        }

    }

}
