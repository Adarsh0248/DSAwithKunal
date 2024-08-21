import java.util.*;
import BasicOperations.operationsOnArrays;
public class arrayPractice3 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter The no of elements in the array: ");
        int l = get.nextInt();
        int[] arr = new int[l];
        obj.inputArray(arr);
        System.out.print("How many times rotate : ");
        int x = get.nextInt();
        System.out.println("Entered Array is : ");
        obj.printArray(arr);
        System.out.println("Rotated Array is : ");
        int r = x%arr.length;
        obj.reverse_Array(arr,0,arr.length-r-1);
        obj.reverse_Array(arr,arr.length-r,arr.length-1);
        obj.reverse_Array(arr,0,arr.length-1);
        obj.printArray(arr);
    }
}
