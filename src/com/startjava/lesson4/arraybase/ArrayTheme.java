package com.startjava.lesson4.arraybase;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] ar1 = {1, 2, 3, 4, 5, 6, 7};
        int[] ar2 = new int [7];
        int z = ar2.length - 1 ;
        int x = 0;
        int sum = 1;
        for(int i = 0; i < ar1.length; i++) {
            System.out.println("ar1[" + i + "]" + " = " + ar1[i]);
            ar2[z] = ar1[i];
            z--;
        }
        for(int ar : ar2) {
            System.out.println("ar2[" + x++ + "]" + " = " + ar);
        } System.out.println("");

        System.out.println("2. Вывод произведения элементов массива");
        int[] list = new int [10];
        for(int i =0; i < list.length; i++) {
            list[i] = i;
            if(list[i] > 0 && list[i] < 9) {
                sum *=list[i];
            } 
        } System.out.println("без учета первого и последнего индекса  = " + sum + " \n");

        System.out.println("3. Удаление элементов массива");
        double[] list3 = new double[15];
        for(int i=0; i < list3.length; i++) {
            //double a = 
            list3[i] = Math.random();
            System.out.println(list3[i]);
        } 
        for(Double l : list3) {
            
        }
    }
}