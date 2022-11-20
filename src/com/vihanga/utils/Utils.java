package com.vihanga.utils;

public class Utils {

    public static void swap (int [] arr,int i, int j){
        if(arr[i]== arr[j]){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
