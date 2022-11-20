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
            swap(arr,largestIndex,lastUnsortedIndex);

        }

        for (int a: arr){
            System.out.println(a);
        }



    }

    public static void swap (int [] arr,int i, int j){
        if(arr[i]== arr[j]){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
