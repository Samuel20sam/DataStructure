package com.bridgelabz.datastructure;

public class MergeSort {
    public void displayArray(int[] arr, int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Dividing array to sub arrays and merge to function
    public void splitAndMerge(int[] arr, int low, int high){
        if (low<high){
            int mid = (low+high) / 2;
            splitAndMerge(arr, low, mid);
            splitAndMerge(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    //merge divided arrays to function
    public void merge(int[] arr, int low, int mid, int high){
        int i = low;
        int h = low;
        int j = mid+1;
        int k;
        int[] temp = new int[10];
        while (h<=mid && j<=high){
            if (arr[h] <= arr[j]){
                temp[i] = arr[h];
                h++;
            }else {
                temp[i] = arr[j];
                j++;
            }
            i++;
        }
        if (h>mid){
            for (k=j; k<=high; k++){
                temp[i] = arr[k];
                i++;
            }
        }else {
            for (k=h; k<= mid; k++){
                temp[i] = arr[k];
                i++;
            }
        }
        for (k=low; k<=high; k++){
            arr[k] = temp[k];
        }
    }
    public static void main(String[] args)
    {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {48, 93, 28, 44, 1, 0, -1, 3};
        int len = arr.length;
        System.out.println("Before MergeSort the array elements : ");
        mergeSort.displayArray(arr, len);
        //Dividing array to sub arrays, fixing start to high index and merge to function
        mergeSort.splitAndMerge(arr, 0, len-1);
        System.out.println("After MergeSort the array elements : ");
        mergeSort.displayArray(arr, len);

    }
}
