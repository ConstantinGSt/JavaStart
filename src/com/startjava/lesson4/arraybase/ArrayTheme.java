package com.startjava.lesson4.arraybase;

public class ArrayTheme {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int [] yarra = new int [6];
        int i = 0;
        for(int ar : array) {
            System.out.println("array[" + i + "]" + " = " + ar);
        }
    }
}