package Sort;

public class SelectionSort{

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = n-1; i>0; i--){
            int maxIndex = 0;

            for(int j = 0; j<=i; j++){
                if(arr[j]>arr[maxIndex])
                    maxIndex =j;
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}