import java.util.Scanner;
import BasicOperations.operationsOnArrays;
public class dailyQuestions{

    public static int leastNumberFalling(int a,int b,int c,int idx){
        if(a<=b){
            if(a<=c)
                return idx;
            else return idx+1;
        }
        else {
            if(b<=c)
                return idx-1;
            else return idx+1;
        }
    }

    public static int minFallingPathSum(int[][] matrix) {
        int sum =111111;
        int temp=sum;
        for (int curridx = 0;curridx< matrix.length;curridx++){

            sum = matrix[0][curridx];
            for (int i = 1; i < matrix.length; i++) {
                if (curridx == 0) {
                    curridx = leastNumberFalling(matrix[i][curridx], 111, matrix[i][curridx + 1], curridx);
                    sum += matrix[i][curridx];
                    continue;
                }
                if (curridx == matrix[0].length - 1) {
                    curridx = leastNumberFalling(matrix[i][curridx], matrix[i][curridx - 1], 111, curridx);
                    sum += matrix[i][curridx];
                    continue;
                }

                curridx = leastNumberFalling(matrix[i][curridx], matrix[i][curridx - 1], matrix[i][curridx + 1], curridx);
                sum += matrix[i][curridx];
                continue;

            }
            if(sum<temp)
                temp=sum;

        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        int [][] arr= obj.inputSquareArray2d();
        System.out.println("Sum = "+minFallingPathSum(arr));
    }
}