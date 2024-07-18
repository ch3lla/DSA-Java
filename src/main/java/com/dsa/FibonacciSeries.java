package com.dsa;

public class FibonacciSeries {
    public static void main(String[] args){
        // Define the number of terms to generate
        int n = 20;

        // Initialize an array to hold the series
        int[] fibSeries = new int[n];

        // Manually set the first three terms of the series based on the given sequence
        fibSeries[0] = 0;
        fibSeries[1] = 4;
        fibSeries[2] = 4;

        // Generate the rest of the series
        for (int i = 3; i < n; i++) {
            fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
        }

        // Print the series
        System.out.print("First " + n + " terms of the Fibonacci series: ");
        for (int i : fibSeries) {
            System.out.print(i + " ");
        }
    }
}

