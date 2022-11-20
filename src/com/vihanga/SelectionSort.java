package com.vihanga;

import com.vihanga.utils.Utils;

public class SelectionSort {
    public static void main(String[] args) {

        int [] arr = {12,43,-5,80,-177,13,50};

        for (int lastUnsortedIndex = arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largestIndex=0;
            for (int i = 1;i<=lastUnsortedIndex;i++){
                if(arr[i]>arr[largestIndex]){
                    largestIndex=i;
                }
            }
            Utils.swap(arr,largestIndex,lastUnsortedIndex);

        }

        for (int a: arr){
            System.out.println(a);
        }



    }


}
