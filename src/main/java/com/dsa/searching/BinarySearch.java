package com.dsa.searching;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int valueToSearchFor = 110;
        String result = binarySearch(arr, valueToSearchFor);
        System.out.println(result);
    }

    private static String binarySearch(int[] arr, int valueToSearchFor) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (int) Math.floor((left + right)/2);
            int currentValue = arr[mid];

            if (currentValue == valueToSearchFor){
                return "Value: " + valueToSearchFor + " found at index: " + mid;
            }

            if (currentValue < valueToSearchFor) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "Value not found.";
    }
}
