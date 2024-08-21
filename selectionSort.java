import java.util.Scanner;
import BasicOperations.operationsOnArrays;
import static BasicOperations.operationsOnArrays.Swap;

public class selectionSort {
    public static int minElement(int [] arr,int idx){
        int min = Integer.MAX_VALUE;
        int index=0;
        for (int i = idx; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
                index=i;
            }


        }
        return index;
    }
//    public static void sort(int []arr,int idx){
//        if (idx>=arr.length-1) return;
//        Swap(arr,idx,minElement(arr,idx));
//        sort(arr,idx+1);
//
//    }
//    public static void insertionSort(int [] arr ,int sorted , int unsorted){
//        if(unsorted>arr.length-1) return;
//        for (int i = 0; i < sorted; i++) {
//            if(arr[unsorted]>=arr[i]) continue;
//            else {
//                int temp =arr[unsorted];
//                for (int j = unsorted; j >i ; j--) {
//                    arr[j]=arr[j-1];
//
//                }
//                arr[i]=temp;
//            }
//        }
//        insertionSort(arr,sorted+1,unsorted+1);
//    }
public static void sortAscending(int[] arr){
    int temp;
    for (int i = arr.length; i>0;i--){
        for (int j = 0; j<i-1;j++){
            if(arr[j]==0){
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                continue;
            }
            if (arr[j]>arr[j+1]&&arr[j+1]!=0){
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.println("Enter The number of elements : " );
        int a = sc.nextInt();
        int [] arr = new int[a];
         obj.inputArray(arr);
         sortAscending(arr);
         obj.printArray(arr);


    }
}
