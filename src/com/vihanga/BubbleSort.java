package com.vihanga;

import com.vihanga.utils.Utils;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {12,43,-5,80,-17,13,50};

        for (int lastUnSortedIndex= arr.length-1; lastUnSortedIndex>0;lastUnSortedIndex--){
            for (int i=0;i<lastUnSortedIndex;i++){
                if(arr[i]>arr[i+1]){
                    Utils.swap(arr,i,i+1);
                }
            }
        }

        for (int a :arr){
            System.out.println(a);
        }

    }
}
