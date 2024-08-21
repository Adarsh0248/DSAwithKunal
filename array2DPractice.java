import java.util.*;
import BasicOperations.operationsOnArrays;
import static BasicOperations.operationsOnArrays.arrayTranspose;
public class array2DPractice {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();;
        System.out.print("Enter number of rows: ");
        int n = get.nextInt();
        int [][] arr = new  int[n][];
        for (int i = 0; i <arr.length ; i++) {
            arr [i] = new int[i+1];
            for (int j = 0; j <=i ; j++) {
                if ( j==0 || j==i ) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }

        }
        obj.printArray2D(arr);

    }
}
