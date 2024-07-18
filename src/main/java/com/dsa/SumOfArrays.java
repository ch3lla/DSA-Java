package com.dsa;

public class SumOfArrays {

    public static int sumOfTwoArrays(int[] arr1, int[] arr2){
        int sumOfArray1 = 0;
        for (int i = 0; i < arr1.length; i++){
            sumOfArray1 += arr1[i];
        }

        int sumOfArray2 = 0;
        for (int j = 0; j < arr2.length; j++){
            sumOfArray2 += arr2[j];
        }

        return sumOfArray1 + sumOfArray2;
    }

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {3, 4, 5};

        int sum = sumOfTwoArrays(numbers, numbers2);

        System.out.println("The sum of two arrays is: " + sum);
    }
}
