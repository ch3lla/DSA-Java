package com.dsa;

public class Inserting {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int value = 123;
        int position = 4;

        // Create a new array with an additional slot for the new value
        int[] newArr = new int[arr.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = value;  // Insert the new value at the specified position
            } else {
                newArr[i] = arr[j];  // Copy elements from the original array
                j++;
            }
        }

        // Print the new array
        System.out.print("Array after insertion: ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
