package com.startjava.lesson4.arraybase;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] ar1 = {1, 2, 3, 4, 5, 6, 7};
        int[] ar2 = new int [7];
        int z = ar2.length - 1 ;
        int x = 0;
        for(int i = 0; i < ar1.length; i++) {
            System.out.println("ar1[" + i + "]" + " = " + ar1[i]);
            ar2[z] = ar1[i];
            z--;
        }
        for(int ar : ar2) {
            System.out.println("ar2[" + x++ + "]" + " = " + ar);
        }
        System.out.println("");
    }
}