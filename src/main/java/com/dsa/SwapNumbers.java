package com.dsa;

import java.util.Arrays;

public class SwapNumbers {

    public static int[] swapFirstAndLastElementsInArray(int[] arr){
        int initialElement = arr[0];
        int lastElement = arr[arr.length - 1];
        arr[0] = lastElement;
        arr[arr.length - 1] = initialElement;
        return arr;
    }

    public static void main(String[] args){
        int[] numbers = {6, 5, 7, 8, 10};

        int[] swapValue = swapFirstAndLastElementsInArray(numbers);

        System.out.println("Your swapped array is " + Arrays.toString(swapValue));
    }
}
