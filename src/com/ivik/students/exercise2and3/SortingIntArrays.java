package com.ivik.students.exercise2and3;

import java.util.Arrays;

/**
 * Created by jennie on 14-1-2016.
 */
public class SortingIntArrays {

    public static void printArray(int[] i){

        for(int j = 0; j < i.length; j++){
            System.out.print(i[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] i = {5, 20, 40, 15, 1, 30, 100, 6, 300, 23, 48};
        Arrays.sort(i);
        printArray(i);
        System.out.println(" ");

        int[] j = Arrays.copyOfRange(i, 2, 8);
        printArray(j);

    }
}
