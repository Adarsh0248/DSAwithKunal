import java.util.*;
import BasicOperations.operationsOnArrays;
public class array2DPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter the no of rows : ");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        System.out.println("The spiral of the Given Matrix is : ");
        int rowStart=0,rowEnd=n-1,colStart=0,colEnd=n-1;
        int totalElements = 1;
        System.out.println(rowEnd);
        while (totalElements <= (n*n)) {
            for (int i = colStart; i <= colEnd && totalElements <= (n*n); i++) {
                arr[rowStart][i] = totalElements;
                totalElements++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd && totalElements <= (n*n); i++) {
                arr[i][colEnd] = totalElements;
                totalElements++;
            }
            colEnd--;
            for (int i = colEnd; i >= colStart && totalElements <=(n*n); i--) {
                arr[rowEnd][i] = totalElements;
                totalElements++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart && totalElements <= (n*n); i--) {
                arr[i][colStart] = totalElements;
                totalElements++;
            }
            colStart++;
        }
        obj.printArray2D(arr);


    }
}
