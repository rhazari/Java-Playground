package org.raihan.basics.MultiDimArrays;

public class MutliDimArrayExample {
    public static void main(String[] args){
        // create a 2d array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + array[0].length);
        System.out.println("Length of row 2: " + array[1].length);
        System.out.println("Length of row 3: " + array[2].length);

        // using indexes for accessing array values
        for(int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // using the for-each loop
        for(int[] innerArray: array) {
            for(int data: innerArray) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
