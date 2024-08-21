import java.util.Scanner;
import BasicOperations.operationsOnArrays;


public class quickSort {
    static int index(int []arr, int start,int end){
        int ind = start ;
        for (int i = start; i <= end; i++) {
            if (arr[i]<arr[start])
                ind++;
        }
        if (start != ind) {
            arr[ind] = arr[ind] + arr[start];
            arr[start] = arr[ind] - arr[start];
            arr[ind] -= arr[start];
        }
        int p = 0;
        int q = end;
        while (p<ind && q>ind){
            while(arr[p]<arr[ind]){
                p++;
            }
            while(arr[q]>arr[ind]){
                q--;
            }
            if (arr[p]>arr[ind]){
                arr[q]+= arr[p];
                arr[p]=arr[q]-arr[p];
                arr[q]-=arr[p];

            }
        }
        return ind;
    }
    static void QuickSort(int []arr,int start,int end){
        if (start>=end)
            return;
        int p=index(arr,start,end);
        QuickSort(arr,0,p-1);
        QuickSort(arr,p+1,end);
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("");
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter the number of elements: ");



        int n = get.nextInt();
        int [] arr = new int[n];
        obj.inputArray(arr);
        QuickSort(arr,0,arr.length-1);
        obj.printArray(arr);


    }
}
