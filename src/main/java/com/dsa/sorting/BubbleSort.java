package com.dsa.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args){
        Random rand = new Random();
        int[] randomArr = new int[10];

        for (int i = 0; i < randomArr.length; i++){
            randomArr[i] = rand.nextInt(10);
        }

        System.out.println("Before sort - ");
        System.out.println(Arrays.toString(randomArr));

        System.out.println("After sort - ");
        bubbleSort(randomArr);
        System.out.println(Arrays.toString(randomArr));
    }

    // 3, 4, 1, 5, 6
    private static void bubbleSort(int[] randomArr) {
        boolean hasPerformedSwap = true;
        while (hasPerformedSwap) {
            hasPerformedSwap = false;
            for (int i = 0; i < randomArr.length - 1; i++){
                if (randomArr[i] > randomArr[i + 1]){
                    hasPerformedSwap = true;
                    // swap(randomArr, randomArr[i], randomArr[i + 1]); this did not work revisit
                    int temp = randomArr[i];
                    randomArr[i] = randomArr[i + 1];
                    randomArr[i + 1] = temp;
                }
            }
        }
    }

    private static void swap(int[] randomArr, int a, int b) {
        int temp = randomArr[a];
        randomArr[a] = randomArr[b];
        randomArr[b] = temp;
    }
}
