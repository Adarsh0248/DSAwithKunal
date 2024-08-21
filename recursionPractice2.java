import java.util.ArrayList;
import java.util.Scanner;
import BasicOperations.operationsOnArrays;
public class recursionPractice2 {
//    static int greatestCommonDivisor(int a,int b){
//        if (a%b==0)
//            return b;
//        return greatestCommonDivisor(b,a%b);
//    }
//
//
//    static int sumOfArray(int[] arr, int n){
//        if (n == arr.length-1)
//            return arr[arr.length-1];
//        return arr[n]+sumOfArray(arr,n+1);
//    }
    static ArrayList<Integer> ifNumberExist(int [] arr, int n, int x){
        if (n>=arr.length){
            return new ArrayList<Integer>();

        }
        ArrayList<Integer> obj = new ArrayList();
        if (arr[n]==x) {
            obj.add(n);
        }
        ArrayList<Integer> smallAns = ifNumberExist(arr,n+1,x);
        obj.addAll(smallAns);
        return obj;

    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter the number of elements in array : ");
        int n = get.nextInt();
        int[] arr = new int[n];
        obj.inputArray(arr);
        System.out.print("Enter the number you want to search : ");
        int x = get.nextInt();
        ArrayList<Integer> ans = ifNumberExist(arr,0,x);
        System.out.println(ans);

    }


}
