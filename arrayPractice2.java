import java.util.*;
import BasicOperations.operationsOnArrays;
public class arrayPractice2 {
    static int Unique(int[] arr){


        loop1:for (int i = 0; i<arr.length;i++){

            loop2:for (int j = i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    //System.out.println("Your answer is "+arr[i]);
                    return arr[i];
                }
            }


        }
      return -1;
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.println("Enter The no of elements in the array:");
        int l = get.nextInt();
        int[] arr = new int[l];
        obj.inputArray(arr);
        System.out.println("The First number repeating itself is "+Unique(arr));

    }
}
