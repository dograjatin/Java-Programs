package com.company.DSA.Sorting;

public class InsertionSort {

    public static void insertSort(int[] arr){

        for( int i =1 ;i<arr.length;i++){

            int value = arr[i]; //Current Element
            int  j= i;  // index of current Element

            while(j>0 && arr[j-1]>value){
                arr[j]=arr[j-1];
                arr[j-1] = value;
                j--;

            }


        }
    }

    public static void main(String[] args) {
        int arr[] = {7,1,0,9,5,13};
        insertSort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}