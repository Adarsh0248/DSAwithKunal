import java.util.*;
import BasicOperations.operationsOnArrays;
public class array2D2 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        int [][] arr = obj.inputSquareArray2d();
        obj.printArray2D(arr);
        for (int i = 0; i <arr.length ; i++) {
            obj.reverseArray(arr[i]);

        }
        obj.printArray2D(arr);



    }
}
