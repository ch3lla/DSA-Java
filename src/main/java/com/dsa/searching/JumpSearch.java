package com.dsa.searching;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int valueToSearchFor = 11;
        String result = jumpSearch(arr, valueToSearchFor);
        System.out.println(result);
    }

    private static String jumpSearch(int[] arr, int valueToSearchFor) {
        int n = arr.length;
        int jump = (int) Math.sqrt(n);
        int prev = 0;

        /**
         * arr[Math.min(jump, n) ensures you don't encounter an array out of bound exception
         * basically what it does is that it checks for which value is less between jump and array length
         * returns that value and decreases it by 1 and find its position in the array and checks if it is less
         * than the value we are searching for
         */
        while (arr[Math.min(jump, n) - 1] < valueToSearchFor) {
            prev = jump; // stores value of jump before incrementing it
            jump += (int) Math.sqrt(n); // jump is incremented by itself
            if (prev >= n) {
                return "Value not found in array";
            }
        }

        /**
         * after the while loop a for loop is executed to perform a linear search
         * within the jump's boundaries, using the prev var as our initial value
         * and our bound as the minimum value between jump and array length, this is because
         * our jump may exceed our array length, so we trace back to the last jump i.e
         * prev value and perform a linear search from prev to n
         * check if each value within jump is equivalent to the value which we seek
         */
        for (int i = prev; i < Math.min(jump, n); i++) {
            if (arr[i] == valueToSearchFor) {
                return "Value found at index " + i + " , " + valueToSearchFor;
            }
        }

        return "Value not found in array";
    }
}
