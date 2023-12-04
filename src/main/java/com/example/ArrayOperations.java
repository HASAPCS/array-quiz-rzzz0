package com.example;

public class ArrayOperations {
    // Exercise 1: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        // TODO: Implement the logic to find the maximum value in the array.
        int maxNum = 0;
        for (int i : array){
            if (i > maxNum) {
                maxNum = i;
            }
         // Placeholder return value
        }
        return maxNum;
    }

    // Exercise 2: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        // TODO: Implement the logic to calculate the average of the array elements.
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum / array.length; // Placeholder return value
    }

    // Exercise 3: Reverse an Array
    public static int[] reverseArray(int[] array) {
        // TODO: Implement the logic to reverse the array.
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length-1-i];
            array[i] = temp;
            array[array.length-1-i] = array[i];
            
        }
        return array; // Placeholder return value
    }
}
