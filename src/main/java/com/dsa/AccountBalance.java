package com.dsa;

public class AccountBalance {
    public static double[] findMaxAndSecondMax(double[] ACBal) {
        double maxBalance = Double.NEGATIVE_INFINITY;
        double secondMaxBalance = Double.NEGATIVE_INFINITY;

        for (double balance : ACBal) {
            if (balance > maxBalance) {
                secondMaxBalance = maxBalance;
                maxBalance = balance;
            } else if (balance > secondMaxBalance) {
                secondMaxBalance = balance;
            }
        }

        return new double[]{maxBalance, secondMaxBalance};
    }

    public static void main(String[] args) {
        double[] ACBal = {7150.99, 8455.00, 9450.12, 5112.34, 200.78, 9450.12, 200.78};
        double[] results = findMaxAndSecondMax(ACBal);
        System.out.println("Max Balance: " + results[0]);
        System.out.println("Second Max Balance: " + results[1]);
    }
}

