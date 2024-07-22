package com.dsa.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args){
        Random rand = new Random();
        int[] randomArr = new int[10];

        for (int i = 0; i < randomArr.length; i++){
            randomArr[i] = rand.nextInt(10);
        }

        System.out.println("Before sort - ");
        System.out.println(Arrays.toString(randomArr));

        System.out.println("After sort - ");
        selectionSort(randomArr);
        System.out.println(Arrays.toString(randomArr));
    }

    // 3, 4, 1, 5, 6
    private static void selectionSort(int[] randomArr) {
        for (int i = 0; i < randomArr.length - 1; i++){
            int minValue = randomArr[i];
            int minValueIndex = i;
            for (int j = i + 1; j < randomArr.length; j++){
                if (randomArr[j] < minValue){
                    minValue = randomArr[j];
                    minValueIndex = j;
                }
            }
            swap(randomArr, i, minValueIndex);
        }
    }

    private static void swap(int[] randomArr, int i, int minValueIndex) {
        int temp = randomArr[i];
        randomArr[i] = randomArr[minValueIndex];
        randomArr[minValueIndex] = temp;

    }
}
