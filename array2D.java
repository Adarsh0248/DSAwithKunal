import java.util.*;
import BasicOperations.operationsOnArrays;

import static BasicOperations.operationsOnArrays.multiplyMatrix;

public class array2D {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        int [][] arr1 = new int[2][4];
//        int [][] arr2 = new int[4][2];
        obj.inputArray2d(arr1);
//        obj.inputArray2d(arr2);
        obj.printArray2D(arr1);
//        obj.printArray2D(arr2);
//        int [][] product = multiplyMatrix(arr1,2,4,arr2,4,2);
//        obj.printArray2D(product);
        for (int i = 0; i <2 ; i++) {
            obj.reverseArray(arr1[i]);

        }
        obj.printArray2D(arr1);


    }
}
