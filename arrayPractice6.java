import java.util.*;
import BasicOperations.operationsOnArrays;
public class arrayPractice6 {
    static void makePrefixSum(int []arr){
        for (int i = 1; i <arr.length ; i++) {
            arr[i] += arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter The no of elements in the array: ");
        int l = get.nextInt();
        int[] arr = new int[l];
        obj.inputArray(arr);
        obj.printArray(arr);
        makePrefixSum(arr);
        obj.printArray(arr);
//        System.out.print("Which index prefix sum you want: ");
//        int index = get.nextInt();
//        System.out.println("The prefix sum at index "+index+" is "+arr[index-1]);


//--------------------------------------------------------------------------------------------------------------------//

//        System.out.print("How may query you want to ask : ");
//        int noOfQuery = get.nextInt();
//        for (int i = 0; i <=noOfQuery ; i++) {
//            System.out.println("Enter the range of indices : ");
//            int indexStart = get.nextInt();
//            int indexEnd = get.nextInt();
//            System.out.println("The required sum is "+(arr[indexEnd]-arr[indexStart-1]));
//        }

//--------------------------------------------------------------------------------------------------------------------//
        boolean division = false;
        for (int j : arr) {
            if (j == (arr[arr.length - 1] - j)) {
                division = true;
                break;
            }
        }
        if(division)
            System.out.println("Can be divided.");
        else
            System.out.println("Cannot be divided.");

    }
}
