import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3,2,4,0,5,1,10,-1,-2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length;i++){
             int end = arr.length-i -1;
             int maxIndex = getMaxIndex(arr,0, end);
             swap(arr,maxIndex,end);
        }
    }

    static void swap(int[] arr, int i ,int j){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

     static int getMaxIndex(int[] arr, int start  ,int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

}
