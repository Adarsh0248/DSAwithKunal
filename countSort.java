import java.util.*;
import BasicOperations.operationsOnArrays;
public class countSort {
    public static int max (int [] a){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>mx){
                mx = a[i];
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter the number of elements : ");
        int n =get.nextInt();
        int [] arr = new int[n];
        obj.inputArray(arr);
        int max =max(arr);
        int [] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        obj.makePrefixSum(count);
        int [] ans = new int[n];
        for (int i = arr.length-1; i >=0 ; i--) {
            ans[(count[arr[i]]--)-1]=arr[i];
        }

        obj.printArray(ans);
    }
}
