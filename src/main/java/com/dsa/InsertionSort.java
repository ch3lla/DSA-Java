package com.dsa;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args){
        Random rand = new Random();
        int[] randomArr = new int[10];

        for (int i = 0; i < randomArr.length; i++){
            randomArr[i] = rand.nextInt(10);
        }

        System.out.println("Before sort - ");
        System.out.println(Arrays.toString(randomArr));

        System.out.println("After sort - ");
        insertionSort(randomArr);
        System.out.println(Arrays.toString(randomArr));
    }

    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];

            int j = i - 1; // can't use i-- or --i
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
        }
    }
}
