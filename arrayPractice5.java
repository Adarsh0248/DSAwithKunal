import java.util.*;
import BasicOperations.operationsOnArrays;
import java.math.*;

import static BasicOperations.operationsOnArrays.Swap;

public class arrayPractice5 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter The no of elements in the array: ");
        int l = get.nextInt();
        int[] arr = new int[l];
        obj.inputArray(arr);

 // SORT ARRAYS OF 0s AND 1s//

//        int left=0,right= arr.length-1;
//        while (left<right){
//            if (arr[left] == 1 && arr[right]==0) {
//                Swap(arr,left,right);
//                left++;
//                right--;
//            }
//            if (arr[left]==0)
//                left++;
//            if (arr[right]==1)
//                right--;
//        }


        // SORTING ARRAY BASED ON EVEN ODD
//        int odd =0,even=arr.length-1;
//        while (odd<even){
//            if (arr[odd]%2!=0 && arr[even]%2==0){
//                Swap(arr,odd,even);
//                odd++;
//                even--;
//            }
//            if (arr[odd]%2==0)
//                odd++;
//            if (arr[even]%2!=0)
//                even--;
//        }
        int [] ans = new int[arr.length];

        int left = 0 , right = arr.length-1,i=0;
        while (left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[i]=arr[left]*arr[left];
                i++;
                left++;
            } else {
                ans[i]=arr[right]*arr[right];
                i++;
                right--;
            }
            if (left==right)
                ans[i]=arr[right]*arr[right];
        }
        System.out.println("Problem Array:");
        obj.printArray(arr);
        System.out.println("Sorted array :");
        obj.reverseArray(ans);
        obj.printArray(ans);




    }
}
