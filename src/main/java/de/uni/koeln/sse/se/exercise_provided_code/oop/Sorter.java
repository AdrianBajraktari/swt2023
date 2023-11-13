package de.uni.koeln.sse.se.exercise_provided_code.oop;

import java.util.Arrays;

public class Sorter {
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{6,2,4,8,3,1,10,5};
        Sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
