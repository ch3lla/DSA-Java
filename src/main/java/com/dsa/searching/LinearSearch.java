package com.dsa.searching;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int valueToSearchFor = 111;
        String result = linearSearch(arr, valueToSearchFor);
        System.out.println(result);
    }

    private static String linearSearch(int[] arr, int valueToSearchFor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearchFor){
                return "Value: " + valueToSearchFor + " found at index: " + i;
            }
        }
        return "Value not found.";
    }
}
