import BasicOperations.Operations;
import BasicOperations.*;

import java.util.Arrays;
import java.util.Scanner;
class copyingArray{
    Scanner sc = new Scanner(System.in);

    void cloneArray(){
        copyingArray obj1 = new copyingArray();
        System.out.println("Enter Length of Array");
        int l = sc.nextInt();
        int[] arr = new int[l];
        operationsOnArrays obj = new operationsOnArrays();
        obj.inputArray(arr);
        int []arr_2 = arr; //Shallow copy
        int []arr_3 = arr.clone(); //Deep cpoy
        System.out.println("Original Array :");
        obj.printArray(arr);
        System.out.println("Shallow copy");
        obj.printArray(arr_2);
        System.out.println("Deep copy");
        obj.printArray(arr_3);
        int []arr_4 = Arrays.copyOf(arr,arr.length-2);
        System.out.println("Copying Array using copy of fn");
        obj.printArray(arr_4);
        System.out.println("Using copy of range function");
        int []arr_5 = Arrays.copyOfRange(arr,1,4);
        obj.printArray(arr_5);
//        arr_2[0]=0;
//        arr_2[5]=0;
        obj1.nullArray(arr);
        System.out.println("after changing values");
        System.out.println("Original Array :");
        obj.printArray(arr);
        System.out.println("Shallow copy");
        obj.printArray(arr_2);
        System.out.println("Deep copy");
        obj.printArray(arr_3);
        System.out.println("Using copy of function");
        obj.printArray(arr_4);
        System.out.println("Using copy of range function");
        obj.printArray(arr_5);


    }
    void nullArray(int[] array){
        Arrays.fill(array, 0);

    }
}

public class Arrays2 {
    public static void main(String[] args) {
        copyingArray obj = new copyingArray();
        obj.cloneArray();

    }
}
