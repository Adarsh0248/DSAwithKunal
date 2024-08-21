import java.util.*;
import BasicOperations.operationsOnArrays;

public class array2DPractice3 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        int [][] arr = obj.inputSquareArray2d();
        obj.printArray2D(arr);
        for (int i = 0; i < arr.length; i++) {
            obj.makePrefixSum(arr[i]);
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[j][i] +=arr[j-1][i];
            }

        }
        obj.printArray2D(arr);
        System.out.println("Enter the coordinates of rectangle");
        int r1 = get.nextInt();
        int c1 = get.nextInt();
        int r2 = get.nextInt();
        int c2 = get.nextInt();
        int ans =0;
        if (r1==0 && c1==0)
            ans = arr[r2][c2];
        else if (r1==0|| r2 ==0){
            ans =arr[r2][c2]-(arr[r2][c1-1]);
        }else if (c1==0||c2==0){
            ans = arr[r2][c2]-(arr[r1-1][c2]);
        }
        else
            ans = arr[r2][c2]-(arr[r1-1][c2]+arr[r2][c1-1])+arr[r1-1][c1-1];
        System.out.println("Your ans is : "+ans);
    }
}
